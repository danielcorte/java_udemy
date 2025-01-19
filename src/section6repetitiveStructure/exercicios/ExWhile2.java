package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExWhile2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        Escreva um programa para ler as coordenadas (X,Y)
        de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a
        que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação
        sem escrever mensagem alguma).

        */

        int x, y;

        while (true) {
            System.out.println("""
                    ------------------------------------------------------
                    Insira coordenadas (x y) e eu irei falar\s
                    a qual quadrante do plano cartesiano ela pertence:\s
                    (primeiro, segundo, terceiro, quarto
                    ------------------------------------------------------
                    """);

            System.out.print("Coordenada X: ");
            x = sc.nextInt();
            // System.out.println();
            System.out.print("Coordenada Y: ");
            y = sc.nextInt();
            // System.out.println();

            if (x > 0 && y > 0) System.out.println("Pertence ao quadrante: Primeiro");
            else if (x > 0 && y < 0) System.out.println("Pertence ao quadrante: Segundo");
            else if (x < 0 && y < 0) System.out.println("Pertence ao quadrante: Terceiro");
            else if (x < 0 && y > 0) System.out.println("Pertence ao quadrante: Quarto");
            else {
                System.out.println("------------------------------------------------------");
                System.out.println("Numero inserido invalido");
                System.out.println("Programa encerrado!!!");
                break;
            }
        }

    }
}
