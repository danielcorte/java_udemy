package java_udemy.section5conditionalStructure.exercicios;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        // Leia 2 valores inteiros (A e B). Após, o programa deve
        // mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        // Multiplos", indicando se os valores lidos são múltiplos
        // entre si. Atenção: os números devem poder ser digitados em
        // ordem crescente ou decrescente.
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o 1° valor: ");
        num1 = sc.nextInt();
        System.out.print("Insira o 2° valor: ");
        num2 = sc.nextInt();
        sc.close();

        if (num1 > num2){
            if (num1 % num2 == 0) {
                System.out.printf("Os valores %d e %d são múltiplos!", num1, num2);
            } else {
                System.out.printf("Os valores %d e %d não são múltiplos!", num1, num2);
            }
        } else {
            if (num2 % num1 == 0) {
                System.out.printf("Os valores %d e %d são múltiplos!", num1, num2);
            } else {
                System.out.printf("Os valores %d e %d não são múltiplos!", num1, num2);
            }
        }

    }
}
