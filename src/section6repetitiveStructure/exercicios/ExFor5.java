package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExFor5 {

    public static void main(String[] args) {
    /*
    Ler um valor N. Calcular e escrever o seu respetivo fatorial.
    Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    Lembrando que, por definição, fatorial de 0 é 1.
    */
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja saber o fatorial de qual numero?: ");
        int num = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
    }

}
