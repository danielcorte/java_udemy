package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExFor6 {

    public static void main(String[] args) {

        /*
        Ler um número inteiro N e calcular todos os seus divisores.
        */

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Insira um valor e eu lhe darei todos os divisores: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) System.out.println("Divisor encontrado: " + i);
        }
    }
}
