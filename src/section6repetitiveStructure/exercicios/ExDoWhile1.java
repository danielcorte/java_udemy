package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExDoWhile1 {

    public static void main(String[] args) {

        // programa que calcula uma temperatura em fahrenheit e pergunta se o usuario
        // deseja rodar o programa novamente

        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

            System.out.print("Deseja continuar? (s/n): ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
        System.out.println("Obrigado, volte sempre!!!");

    }
}
