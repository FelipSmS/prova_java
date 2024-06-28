package br.edu.up.Daos;

import java.io.FileWriter;
import java.io.PrintWriter;

import br.edu.up.Models.Resumo;

public class Gravar {

    private String ArquivosCaminho = "C:\\Users\\autologon\\java_prova\\Prova_Java\\src\\br\\edu\\up\\Arquivos\\";

    public void GravarResumo(Resumo resumo) {
        String arquivo = ArquivosCaminho + "Resumo.csv";

        try {
            FileWriter arquivoGravar = new FileWriter(arquivo, true);

            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println(resumo.toCSV());

            gravador.close();
            arquivoGravar.close();

        } catch (Exception e) {
            System.out.println("Não foi possível gravar o arquivo: " + e.getMessage());
        }
    }
}
