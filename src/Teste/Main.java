package Teste;
import java.util.Scanner;
import Dominio.Turma;
import Dominio.Aluno;
import Dominio.ArquivoTurma;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        int escolha, escolha1;
        Scanner sc = new Scanner(System.in);
        Turma turma = new Turma();
        ArquivoTurma arq = new ArquivoTurma();
        arq.carregar(turma);
        do {
            System.out.println("Qual das opções abaixo você deseja?");
            System.out.println("1: Adicionar Aluno:");
            System.out.println("2: Listar alunos:");
            System.out.println("3: Buscar aluno por matrícula:");
            System.out.println("4: Remover aluno:");
            System.out.println("5: Calcular média da turma:");
            System.out.println("6: Sair:");
            escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha){
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = sc.nextLine();
                    System.out.println("Digite a matricula:");
                     String matricula = sc.nextLine();
                    System.out.println("Digite a nota:");
                    int nota = sc.nextInt();
                    sc.nextLine();
        Aluno aluno = new Aluno(nome, matricula, nota);
        turma.adicionarAluno(aluno);
        arq.salvar(turma);
        break;
                case 2:
                    turma.listarAlunos();
                    arq.salvar(turma);
                    break;
                case 3:
                    System.out.println(turma.buscarAlunoPorMatricula(sc.nextLine()));
                    arq.salvar(turma);
                    break;
                case 4:
                    System.out.println("Digite a matricula");
                    turma.removerAluno(sc.nextLine());
                    arq.salvar(turma);
                    break;
                case 5:
                    System.out.println(turma.calcularMediaTurma());
                    arq.salvar(turma);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
            }
            System.out.println("Deseja mais algo?");
            System.out.println("1 para sim?");
            System.out.println("2 para não?");
            escolha1 = sc.nextInt();
            sc.nextLine();
            if(escolha1 == 2){
              arq.salvar(turma);
                return;
            }
        } while (escolha != 6);
    }
}