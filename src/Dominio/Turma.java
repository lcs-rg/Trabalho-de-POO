package Dominio;
import java.util.ArrayList;

public class Turma{
    public String nomeTurma;
    ArrayList<Aluno> lista = new ArrayList<>();
    public void adicionarAluno(Aluno aluno){
        lista.add(aluno);
    }

    public void listarAlunos() {
        if(lista == null){
            throw new IndexOutOfBoundsException("Lista vazia");
        }
        for (Aluno aluno : lista) {
            System.out.println(aluno.nome);
        }
    }

public Aluno buscarAlunoPorMatricula(String matricula) {
    if(lista == null){
        throw new IndexOutOfBoundsException("Lista vazia");
    }
    for (Aluno aluno : lista) {
        if (aluno.matricula.equals(matricula)) {
            return aluno;
        }
    }
        return null;
}
public void removerAluno(String matricula){
        if(lista.isEmpty()){
            throw new IndexOutOfBoundsException("Lista vazia");
        }
        lista.remove(buscarAlunoPorMatricula(matricula));
        }
public double calcularMediaTurma(){
        if(lista == null){
            return 0;
        }
        double soma = 0;
        for(Aluno aluno : lista){
            soma += aluno.nota;
        }
        return soma / lista.size();
}
public ArrayList<Aluno> getAlunos(){
        return lista;
    }
    public void LimparAlunos(){
        lista.clear();
    }
}
