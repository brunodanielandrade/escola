import model.*;

import java.util.Scanner;

public class Main   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa a = new Aluno();

        Pessoa p = new Professor();

        Pessoa c = new Coordenador();

        Polimorfismo t = new Polimorfismo();
        t.polimorfimso_interface((FolhaPagamento) p);
        ((FolhaPagamento) p). calcular_salario();



        System.out.println("Cadastre o nome do Aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.println("Cadastre o nome do Professor: ");
        String nomeProfessor = sc.nextLine();





        System.out.println("Informações do model.Professor");
        //System.out.println(p);

        System.out.println("Informações do model.Aluno");
        System.out.println(a);
        System.out.println("Informações do Coordernador");
    }
}

