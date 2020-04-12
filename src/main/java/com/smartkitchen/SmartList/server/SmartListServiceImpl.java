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
            Smartlist smartlist =  Smartlist.newBuilder()
                    .setId(itemId)
                    .setItem(result.getString("item"))
                    .setPrice(result.getDouble("price"))
                    .setBarcode(result.getInteger("barcode"))
                    .build();

            responseObserver.onNext(ReadSmartListResponse.newBuilder()
                    .setSmartlist(smartlist)
                    .build());

            responseObserver.onCompleted();
        }
    }
}
