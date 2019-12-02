package com.ifpb.mongodriver.visao;

import com.ifpb.mongodriver.modelo.Pessoa;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.time.LocalDate;
import java.util.function.Consumer;

public class App {

    public static void main(String[] args) {

        try(MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")){

            MongoDatabase banco = mongoClient.getDatabase("aula");
            MongoCollection collection = banco.getCollection("Pessoa");

            collection.insertOne(new Pessoa("111.111.111-01",
                    "João", LocalDate.now()).toDocument());

        }
    }

}
