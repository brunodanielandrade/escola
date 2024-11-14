package model;

public class Aluno extends Pessoa {
    private int matricula;

    private double nota1, nota2, nota3, media;

    public void calcularMedia(){
        media = (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public void Responsabilidade() {
        System.out.println("Estudar");
    }

    @Override
    public String toString() {
        return "model.Aluno{" +
                "matricula=" + matricula +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + media +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
