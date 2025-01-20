package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExFor1 {

    public static void main(String[] args) {

        /*
        Leia um valor inteiro X (1 <= X <= 1000).
        Em seguida mostre os ímpares de 1 até X,
        um valor por linha, inclusive o X, se for o caso.
         */
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Insira um valor e eu direi os impares de 1 até o valor X escolhido: ");
        x = sc.nextInt();

        if (1 <= x && x <= 1000) {

            for (int i = 0; i <= x; i++) {

                if (i % 2 != 0) {
                    System.out.printf("Ímpar: %d", i);
                    System.out.println();
                }
            }
        }

    }
}
