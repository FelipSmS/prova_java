package br.edu.up.Models;

public class Aluno {

    public int Matricula;
    public String Nome;
    public float Nota;

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getNota() {
        return Nota;
    }

    public void setNota(float nota) {
        Nota = nota;
    }
}
