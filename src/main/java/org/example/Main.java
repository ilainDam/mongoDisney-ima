package org.example;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import static com.mongodb.client.model.Sorts.*;

import static com.mongodb.client.model.Filters.*;

public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = ConexionSingelton.getConexionBD();
        MongoDatabase mongoD = mongoClient.getDatabase("GameFreak");
        MongoCollection<Document> mongoC = mongoD.getCollection("Disney");
        //1
        //mongoC.find(lt("Release date (datetime)","1950-01-01")).forEach(System.out::println);
        //2
        //mongoC.find(gt("Running time","90 minutes")).forEach(document -> System.out.println(document.toJson()));
        //3
        //mongoC.find(gt("imdb",9)).forEach(System.out::println);
        //4
        //        mongoC.find(
        //                and(
        //                eq("Produced by","Walt Disney"),
        //                gt("imdb",7.5)))
        //                .sort(ascending("imdb")).forEach(System.out::println);
        //5
        //        mongoC.find(and(
        //                        gte("Release date (datetime)", "2000-1-1"),
        //                        lte("Release date (datetime)", "2009-12-31")
        //                        , gt("metascore", 90)
        //                        )
        //        ).forEach(System.out::println);
        //6
        //mongoC.find(exists("Budget",false)).forEach(System.out::println);
        //7
        //
    }
}
