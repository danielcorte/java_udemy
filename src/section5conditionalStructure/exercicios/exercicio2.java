package java_udemy.section5conditionalStructure.exercicios;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        int tipo_num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor e eu falo se é par ou ímpar: ");
        tipo_num = sc.nextInt();
        sc.close();

        if (tipo_num % 2 == 0) {
            System.out.printf("O número %d é par", tipo_num);
        } else {
            System.out.printf("O número %d é ímpar", tipo_num);
        }
    }
}
