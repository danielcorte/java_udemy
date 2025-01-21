package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExFor4 {

    public static void main(String[] args) {

        /*
        Fazer um programa para ler um número N.
        Depois leia N pares de números e mostre
        a divisão do primeiro pelo segundo. Se
        o denominador igualar zero, mostrar
        a mensagem "divisao impossivel".
         */

        Scanner sc = new Scanner(System.in);

        int escolha;

        System.out.print("Deseja a divisao de quantos valores?: ");
        escolha = sc.nextInt();

        for (int i = 0; i < escolha; i++) {

            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            if (num2 == 0) {
                System.out.println("Divisão impossível!!");
            } else {
                double resultado = num1 / num2;
                System.out.println(resultado);
            }
        }
    }
}
