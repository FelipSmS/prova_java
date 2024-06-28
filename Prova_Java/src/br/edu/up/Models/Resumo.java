package br.edu.up.Models;

public class Resumo {

    private int TotalAlunos;
    private int TotalAprovados;
    private int TotalReprovados;
    private float MaiorNota;
    private float MenorNota;
    private float MediaNotas;

    public int getTotalAlunos() {
        return TotalAlunos;
    }

    public void setTotalAlunos(int totalAlunos) {
        TotalAlunos = totalAlunos;
    }

    public int getTotalAprovados() {
        return TotalAprovados;
    }

    public void setTotalAprovados(int totalAprovados) {
        TotalAprovados = totalAprovados;
    }

    public int getTotalReprovados() {
        return TotalReprovados;
    }

    public void setTotalReprovados(int totalReprovados) {
        TotalReprovados = totalReprovados;
    }

    public float getMaiorNota() {
        return MaiorNota;
    }

    public void setMaiorNota(float maiorNota) {
        MaiorNota = maiorNota;
    }

    public float getMenorNota() {
        return MenorNota;
    }

    public void setMenorNota(float menorNota) {
        MenorNota = menorNota;
    }

    public float getMediaNotas() {
        return MediaNotas;
    }

    public void setMediaNotas(float mediaNotas) {
        MediaNotas = mediaNotas;
    }

    public String toCSV() {
        return TotalAlunos + ";" + TotalAprovados + ";" + TotalReprovados + ";" + MaiorNota + ";" + MenorNota + ";"
                + MediaNotas;
    }

}
