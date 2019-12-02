package com.ifpb.mongodriver.modelo;

import org.bson.Document;

import java.time.LocalDate;
import java.time.ZoneId;

public class Pessoa {

    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, LocalDate nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }

    public Document toDocument(){
        return new Document("cpf", cpf)
                .append("nome", nome)
                .append("nascimento", nascimento);
    }

    public Pessoa fromDocument(Document document){
        cpf = document.getString("cpf");
        nome = document.getString("nome");
        nascimento = document.getDate("nascimento").toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate();

        return this;
    }

}
