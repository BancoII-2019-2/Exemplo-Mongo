package com.ifpb.mongodriver.modelo;

import java.time.LocalDate;

public class Professor {

    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private float salario;

    //Obrigatório
    public Professor() {
    }

    public Professor(String cpf, String nome, LocalDate nascimento, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", salario=" + salario +
                '}';
    }
}
