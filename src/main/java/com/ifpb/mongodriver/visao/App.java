package com.ifpb.mongodriver.visao;

import com.ifpb.mongodriver.modelo.Aluno;
import com.ifpb.mongodriver.modelo.Pessoa;
import com.ifpb.mongodriver.modelo.Professor;
import com.ifpb.mongodriver.modelo.Turma;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.time.LocalDate;
import java.util.Set;
import java.util.function.Consumer;

import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Updates.set;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class App {

    public static void main(String[] args) {

//        try(MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")){
//
//            MongoDatabase banco = mongoClient.getDatabase("aula");
//            MongoCollection collection = banco.getCollection("Pessoa");
//
//            //Inserção
////            collection.insertOne(new Pessoa("111.111.111-01",
////                    "João", LocalDate.now()).toDocument());
//
//            //Remoção
////            collection.findOneAndDelete(new Document("cpf", "111.111.111-01"));
//
////            collection.insertOne(new Pessoa("111.111.111-01",
////                    "João", LocalDate.now()).toDocument());
////            collection.insertOne(new Pessoa("222.222.222-02",
////                    "João", LocalDate.now()).toDocument());
//
//            //Atualização
////            UpdateResult result = collection.updateOne(
////                    new Document("cpf", "222.222.222-02"),
////                    set("nome", "Maria"));
////            System.out.println("Elementos Modificados: "+result.getModifiedCount());
//
//            //Listar todos
////            MongoIterable<Document> documents = collection.find();
////            documents.forEach((Consumer<? super Document>)
////                    document -> System.out.println(new Pessoa().fromDocument(document)));
//
//        }

        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings
                        .getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        MongoClientSettings settings = MongoClientSettings.builder()
                .codecRegistry(pojoCodecRegistry)
                .build();

        try(MongoClient mongoClient = MongoClients.create(settings)){

            MongoDatabase banco = mongoClient.getDatabase("aula");
            MongoCollection<Turma> turmas = banco.getCollection("turma", Turma.class);

//            Professor professor = new Professor("111.111.111-01", "João",
//                    LocalDate.now(), 2000);
//            Set<Aluno> alunos = Set.of(
//                    new Aluno("123456", "Ana"),
//                    new Aluno("321654", "Pedro"),
//                    new Aluno("369852", "José")
//            );
//            Turma turma = new Turma("Banco II", professor, alunos);
//
//            turmas.insertOne(turma);

            turmas.find().forEach((Consumer<? super Turma>)
                    turma -> System.out.println(turma));

        }


    }

}
