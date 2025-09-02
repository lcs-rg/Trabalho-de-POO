package Dominio;

import Dominio.Aluno;
import Dominio.Turma;

import java.io.*;

public class ArquivoTurma {
    private final String arquivo = "D:\\Estudos\\Projetos Intelij\\Pessoal\\POO\\src\\Dominio\\Alunos.txt";
    public void salvar(Turma turma) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Aluno aluno : turma.getAlunos()) {
                bw.write(aluno.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo" + e.getMessage());
        }
    }
        public void carregar(Turma turma){
        turma.LimparAlunos();
            try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){
                String linha;
                while((linha = br.readLine()) != null){
                    String[] partes = linha.split(";");
                    if(partes.length == 3){
                        String nome = partes[0];
                        String matricula = partes[1];
                        int nota = Integer.parseInt(partes[2]);
                        turma.adicionarAluno(new Aluno(nome, matricula, nota));
                    }
                }
            } catch (IOException e){
                System.out.println("Arquivo não encontrado, começando com a lista vazia" + e.getMessage());
            }
        }
    }