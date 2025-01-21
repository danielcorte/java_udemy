package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExFor7 {

    public static void main(String[] args) {

        /*
        Fazer um programa para ler um número inteiro
        positivo N. O programa deve então mostrar na
        tela N linhas, começando de 1 até N. Para cada
        linha, mostrar o número da linha, depois o
        quadrado e o cubo do valor, conforme exemplo.
         */

        Scanner sc = new Scanner(System.in);
        
        int num;

        System.out.print("Digite um valor: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.printf("%d %d %d", i, quadrado, cubo);
            System.out.println();
        }
    }
}
