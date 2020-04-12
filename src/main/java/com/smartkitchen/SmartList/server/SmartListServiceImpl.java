package com.smartkitchen.SmartList.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.proto.smartlist.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class SmartListServiceImpl extends SmartListServiceGrpc.SmartListServiceImplBase {

    private MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    private MongoDatabase database = mongoClient.getDatabase("mydb");
    private MongoCollection<Document> collection = database.getCollection("smartlist");

    @Override
    public void createSmartList(CreateSmartListRequest request, StreamObserver<CreateSmartListResponse> responseObserver) {

        System.out.println("Request to create a new item in the smart list received!");

        Smartlist smartlist = request.getSmartlist();

        Document doc = new Document("item", smartlist.getItem())
                .append("barcode", smartlist.getBarcode())
                .append("price", smartlist.getPrice());

        System.out.println("Inserting SmartList Item...");

        //insert the document into the database
        collection.insertOne(doc);


        String id = doc.getObjectId("_id").toString();
        System.out.println("Item id " + id + " added!");

        CreateSmartListResponse response = CreateSmartListResponse.newBuilder()
                .setSmartlist(smartlist.toBuilder().setId(id).build())
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }


    @Override
    public void readSmartList(ReadSmartListRequest request, StreamObserver<ReadSmartListResponse> responseObserver) {
        System.out.println("Request to read an item in the smart list received!");
        String itemId = request.getItemId();

        System.out.println("Searching for item by id...");
        //finds in the collection all the matching Ids and returns the first one found
        Document result = null;
        try {
            result = collection.find(eq("_id", new ObjectId(itemId)))
                    .first();
        }catch (Exception e){
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("No Smart List item with this ID was found!")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException()
            );

        }
        if (result == null){
            System.out.println("Item not found!");
            responseObserver.onError(
                    Status.NOT_FOUND
                    .withDescription("No Smart List item with this ID was found!")
                    .asRuntimeException()

            );
        } else{
            System.out.println("Smart Item found!");
            Smartlist smartlist = documentToSmartList(result);

            responseObserver.onNext(ReadSmartListResponse.newBuilder()
                    .setSmartlist(smartlist)
                    .build());

            responseObserver.onCompleted();
        }
    }

    @Override
    public void updateSmartList(UpdateSmartListRequest request, StreamObserver<UpdateSmartListResponse> responseObserver) {

        Smartlist smartlist = request.getSmartlist();

        System.out.println("Request to update an item in the smart list received!");
        String itemId = smartlist.getId();

        System.out.println("Searching for item by id to update...");
        //finds in the collection all the matching Ids and returns the first one found
        Document result = null;
        try {
            result = collection.find(eq("_id", new ObjectId(itemId)))
                    .first();
        }catch (Exception e){
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("No Smart List item with this ID was found!")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException()
            );

        }

        if (result == null){
            System.out.println("Item not found!");
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("No Smart List item with this ID was found!")
                            .asRuntimeException()

            );
        }else{
            Document replacement = new Document("item", smartlist.getItem())
                    .append("barcode", smartlist.getBarcode())
                    .append("price", smartlist.getPrice())
                    .append("_id", new ObjectId(itemId));

            System.out.println("Replacing smart list in db...");

            //replace the collection in mongodb for the corresponding id
            collection.replaceOne(eq("_id", result.getObjectId("_id")), replacement);

            System.out.println("Smart Item Replaced! Returning new item");

            responseObserver.onNext(
                    UpdateSmartListResponse.newBuilder()
                            .setSmartlist(documentToSmartList(replacement))
                            .build()
            );

            responseObserver.onCompleted();
        }

    }


    private Smartlist documentToSmartList(Document document){
        return Smartlist.newBuilder()
                .setId(document.getObjectId("_id").toString())
                .setItem(document.getString("item"))
                .setPrice(document.getDouble("price"))
                .setBarcode(document.getInteger("barcode"))
                .build();

    }
}
