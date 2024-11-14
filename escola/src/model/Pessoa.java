package model;

public abstract class Pessoa {
    protected String nome;

    protected int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public abstract void Responsabilidade();

    @Override
    public String toString() {
        return "model.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}