package com.ifpb.mongodriver.visao;

import com.ifpb.mongodriver.modelo.Pessoa;
import com.mongodb.client.*;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

import java.time.LocalDate;
import java.util.function.Consumer;

import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Updates.set;

public class App {

    public static void main(String[] args) {

        try(MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")){

            MongoDatabase banco = mongoClient.getDatabase("aula");
            MongoCollection collection = banco.getCollection("Pessoa");

            //Inserção
//            collection.insertOne(new Pessoa("111.111.111-01",
//                    "João", LocalDate.now()).toDocument());

            //Remoção
//            collection.findOneAndDelete(new Document("cpf", "111.111.111-01"));

//            collection.insertOne(new Pessoa("111.111.111-01",
//                    "João", LocalDate.now()).toDocument());
//            collection.insertOne(new Pessoa("222.222.222-02",
//                    "João", LocalDate.now()).toDocument());

            //Atualização
//            UpdateResult result = collection.updateOne(
//                    new Document("cpf", "222.222.222-02"),
//                    set("nome", "Maria"));
//            System.out.println("Elementos Modificados: "+result.getModifiedCount());

            //Listar todos
//            MongoIterable<Document> documents = collection.find();
//            documents.forEach((Consumer<? super Document>)
//                    document -> System.out.println(new Pessoa().fromDocument(document)));


        }
    }

}
