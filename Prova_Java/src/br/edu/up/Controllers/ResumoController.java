package br.edu.up.Controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import br.edu.up.Daos.Gravar;
import br.edu.up.Daos.Ler;
import br.edu.up.Models.Aluno;
import br.edu.up.Models.Resumo;

public class ResumoController {

        public void GravarResumo() {
                Ler leitura = new Ler();
                var alunos = leitura.buscarAlunos();
                Resumo resumo = new Resumo();

                int totalAluno = 0;
                int totalAprovados = 0;
                int totalReprovados = 0;
                float maiorNota = Float.MIN_VALUE;
                float menorNota = Float.MAX_VALUE;
                float totalNotas = 0.0f;

                for (Aluno aluno : alunos) {
                        totalAluno++;
                        if (aluno.getNota() >= 6.0) {
                                totalAprovados++;
                        } else {
                                totalReprovados++;
                        }

                        if (aluno.getNota() > maiorNota) {
                                maiorNota = aluno.getNota();
                        }
                        if (aluno.getNota() < menorNota) {
                                menorNota = aluno.getNota();
                        }

                        totalNotas += aluno.getNota();
                }

                resumo.setTotalAlunos(totalAluno);
                resumo.setTotalAprovados(totalAprovados);
                resumo.setTotalReprovados(totalReprovados);
                resumo.setMaiorNota(maiorNota);
                resumo.setMenorNota(menorNota);

                var media = totalNotas / totalAluno;

                resumo.setMediaNotas(media);

                Gravar gravar = new Gravar();
                gravar.GravarResumo(resumo);

        }
}
