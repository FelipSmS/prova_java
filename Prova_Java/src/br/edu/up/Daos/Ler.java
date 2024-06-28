package br.edu.up.Daos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.Models.Aluno;

public class Ler {

    public List<Aluno> buscarAlunos() {

        List<Aluno> alunosListagem = new ArrayList<>();

        try {
            File arquivoLeitura = new File(
                    "C:\\Users\\autologon\\java_prova\\Prova_Java\\src\\br\\edu\\up\\Arquivos\\alunos.csv\\");
            Scanner leitor = new Scanner(arquivoLeitura);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");

                int matricula = Integer.parseInt(dados[0]);
                String nome = dados[1];
                float nota = Float.parseFloat(dados[2]);

                Aluno aluno = new Aluno();
                aluno.setMatricula(matricula);
                aluno.setNome(nome);
                aluno.setNota(nota);

                alunosListagem.add(aluno);
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! " + e.getMessage());
        }

        return alunosListagem;
    }

}
