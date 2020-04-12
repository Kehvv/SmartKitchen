package com.smartkitchen.SmartList.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.proto.smartlist.CreateSmartListRequest;
import com.proto.smartlist.CreateSmartListResponse;
import com.proto.smartlist.SmartListServiceGrpc;
import com.proto.smartlist.Smartlist;
import io.grpc.stub.StreamObserver;
import org.bson.Document;

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
}
