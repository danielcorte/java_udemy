package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExFor2 {

    public static void main(String[] args) {

        /*
        Leia um valor inteiro N. Este valor será
        a quantidade de valores inteiros X que
        serão lidos em seguida. Mostre quantos
        destes valores X estão dentro do intervalo
        [10,20] e quantos estão fora do intervalo,
        mostrando essas informações conforme exemplo
        (use a palavra "in" para dentro do intervalo,
        e "out" para fora do intervalo)
         */
        int escolha, in = 0, out = 0, valor;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores deseja inserir?: ");
        escolha = sc.nextInt();

        for (int i = 0; i < escolha; i++) {
            System.out.printf("Insira o %d° valor: ", i + 1);
            valor = sc.nextInt();

            if (valor >= 10 && 20 <= valor) {
                in += 1;
            } else {
                out += 1;
            }

        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
