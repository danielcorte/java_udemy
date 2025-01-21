package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExFor3 {

    public static void main(String[] args) {

        /*
        Leia 1 valor inteiro N, que representa o
        número de casos de teste que segue.
        Cada caso de teste consiste de 3 valores
        reais, cada um deles com uma casa decimal.
        Apresente a média ponderada para cada um destes
        conjuntos de 3 valores, sendo que o primeiro
        valor tem peso 2, o segundo valor tem peso 3
        e o terceiro valor tem peso 5.
        */

        int escolha;

        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja realizar quantos casos de teste?: ");
        escolha = sc.nextInt();

        for (int i=0; i<escolha; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
