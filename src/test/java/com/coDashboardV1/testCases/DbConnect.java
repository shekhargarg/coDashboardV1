

package com.coDashboardV1.testCases;

/*
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.bson.Document;
import org.openqa.selenium.json.Json;

import java.sql.SQLOutput;


public class DbConnect {

    public static void main(String[] args) {


        MongoClientURI uri = new MongoClientURI("mongodb://admin:adminpassword@13.76.181.108:27017/?authSource=CL_orthopedic_data");
        MongoClient mongoClient = new MongoClient(uri);

        BasicDBObject fields = new BasicDBObject();
        //Steps
            fields.put("u","2YRQCN");
            fields.put("dateTime","2019-07-29");

        MongoDatabase existDB = mongoClient.getDatabase("CL_orthopedic_data");
            System.out.println(existDB.getCollection("steps").count());

        FindIterable<Document> steps = existDB.getCollection("steps").find(fields);
        MongoCursor<Document> cursor = steps.iterator();

        while (cursor.hasNext()) {
            System.out.println("--------------");
            System.out.println(cursor.next());
            System.out.println(cursor.next().getString("data_value"));
            Integer actual_patsteps = Integer.valueOf(cursor.next().getString("data_value"));

            //Distance
            fields.put("u", "2YRQCN");
            fields.put("dateTime", "2019-07-29");

           // MongoDatabase existDB = mongoClient.getDatabase("CL_orthopedic_data");
            System.out.println(existDB.getCollection("steps").count());

           // FindIterable<Document> steps = existDB.getCollection("steps").find(fields);
          //  MongoCursor<Document> cursor = steps.iterator();

            while (cursor.hasNext()) {
                System.out.println("--------------");
                System.out.println(cursor.next());
                System.out.println(cursor.next().getString("data_value"));
                actual_patsteps = Integer.valueOf(cursor.next().getString("data_value"));
            }


        }
}

//Steps
//db.getCollection('steps').find({ "u" : "2YRQCN","dateTime" : "2019-07-29"})

*/