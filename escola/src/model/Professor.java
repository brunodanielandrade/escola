package model;

import model.Pessoa;

public final class Professor extends Pessoa implements FolhaPagamento {
    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public void Responsabilidade() {
        System.out.println("Ensinar");

    }

    @Override
    public String toString() {
        return "model.Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';



    }

    @Override
    public void calcular_salario() {
        System.out.println("Salario do model.Professor");
    }
}