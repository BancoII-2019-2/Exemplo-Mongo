package com.ifpb.mongodriver.modelo;

import java.util.Set;

public class Turma {

    private String disciplina;
    private Professor professor;
    private Set<Aluno> alunos;

    public Turma() {
    }

    public Turma(String disciplina, Professor professor, Set<Aluno> alunos) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "disciplina='" + disciplina + '\'' +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }
}
