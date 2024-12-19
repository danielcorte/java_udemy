package java_udemy.section5conditionalStructure.optionalSyntax.switchCase;

import java.util.Scanner;

public class Main {
    // Utilizamos if-else para estruturas de condições mais complexas
    // switch-case para estruturas de condições simples, como menus
    // e operaqdor ternário para estrutura de true e false apenas.

    public static void main(String[] args) {
        /* Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1 = domingo
           2 = segunda, e assim por diante). Escrever na tela o dia da semana correspondente, conforme exemplos.
        */

        Scanner sc = new Scanner(System.in);
        String dia = "";

        System.out.println("-----------------------------------");
        System.out.println("      Domingo [1]\nSegunda-feira [2]\n  Terça-feira [3]\n Quarta-feira [4]\n Quinta-feira [5]\n  Sexta-feira [6]\n       Sábado [7]");
        System.out.println("-----------------------------------");

        System.out.print("Escolha uma opção: ");
        int x = sc.nextInt();

        switch (x) {
            case 1 ->dia = "Domingo";

            case 2 -> dia = "Segunda-feira";

            case 3 -> dia = "Terça-feira";

            case 4 -> dia = "Quarta-feira";

            case 5 -> dia = "Quinta-feira";

            case 6 -> dia = "Sexta-feira";

            case 7 -> dia = "Sábado";

            default -> System.out.println("Valor inválido!!");
        }


        System.out.printf("Dia da semana: %s", dia);
        System.out.println("\n-----------------------------------");

        sc.close();
    }
}
