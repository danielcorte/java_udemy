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
        System.out.println("Dados da conta:");
        System.out.printf("Conta %d, Responsável: %s, Saldo: $ %.2f", conta.num_conta, conta.nome, conta.saldo);
        System.out.println();
        System.out.println("---------------------------------------");


        System.out.print("Qual o montante do valor a ser recolhido: ");
        saque = parseInt(sc.nextLine());
        conta.novo_saque(saque);
        System.out.println("Dados da conta:");
        System.out.printf("Conta %d, Responsável: %s, Saldo: $ %.2f", conta.num_conta, conta.nome, conta.saldo);
        System.out.println();

        System.out.print("Qual a quantidade do valor a ser depositado: ");
        deposito = parseInt(sc.nextLine());
        conta.novo_deposito(deposito);
        System.out.println("Dados da conta:");
        System.out.printf("Conta %d, Responsável: %s, Saldo: $ %.2f", conta.num_conta, conta.nome, conta.saldo);
        System.out.println();

        System.out.println("---------------------------------------");
    }

}
