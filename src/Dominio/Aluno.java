package Dominio;

public class Aluno {
    public String nome;
    public String matricula;
    public int nota;
    public Aluno(String nome, String matricula, int nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {return matricula;}

    public int getNota() {
        return nota;
    }

    public void exibirInfo(){
        System.out.println(nome);
        System.out.println(matricula);
        System.out.println(nota);
    }
    @Override
    public String toString(){
        return nome + ";" + matricula + ";" + nota;
    }
}
