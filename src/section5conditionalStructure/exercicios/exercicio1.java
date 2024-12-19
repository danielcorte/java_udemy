package java_udemy.section5conditionalStructure.exercicios;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor e eu direi se é positivo: ");
        numero = sc.nextInt();
        sc.close();

        if (numero > 0) {
            System.out.printf("O número %d é positivo", numero);
        } else {
            System.out.printf("O número %d é negativo", numero);
        }
    }
}
