package section9ThisEncapsConstrOverchar.Exercises;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num_conta;
        String nome;
        String escolha;
        double dep_inicial = 0;
        double saque;
        double deposito;

        System.out.println("---------------------------------------");
        System.out.println("Bem-vindo ao cadastro de conta!");
        System.out.println("---------------------------------------");

        System.out.print("Qual o numero do titular da conta: ");
        num_conta = parseInt(sc.nextLine());

        System.out.print("Qual o nome do titular da conta: ");
        nome = sc.nextLine();

        System.out.print("Deseja inserir um saldo inicial? [s/n]: ");
        escolha = sc.nextLine();

        if (escolha.equals("s")) {
            System.out.print("Insira o valor inicial: ");
            dep_inicial = parseInt(sc.nextLine());
        }

        Product conta = new Product(num_conta, nome, dep_inicial);

        System.out.println("---------------------------------------");
        System.out.printf("Novo usuário %s cadastrado!", nome);
        System.out.println();
        System.out.println("---------------------------------------");


        System.out.print("Qual o montante do valor a ser recolhido: ");
        saque = parseInt(sc.nextLine());
        System.out.printf("Saldo atualizado! Novo valor: %.2f", saque);
        System.out.println();

        System.out.print("Qual a quantidade do valor a ser depositado: ");
        deposito = parseInt(sc.nextLine());
        System.out.printf("Saldo atualizado! Novo valor: %.2f\n", deposito);

        System.out.println("---------------------------------------");
    }

}
