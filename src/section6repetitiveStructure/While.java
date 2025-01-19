package section6repetitiveStructure;

import java.util.Scanner;

public class While {

    // repete um bloco de comandos enquanto uma condicao for verdadeira
    // nao se sabe previamente a quantidade de repeticoes que sera utilizada

    /*
    * SINTAXE
    *
    *  while (condicao) {
    *       comando
    *       comando
    * }
    * */

    // regra:
    // V = executa e volta
    // F = pula fora

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            soma += x;

            x = sc.nextInt();

            // Enquanto o valor de input nao for == 0, o programa continuira pedindo
            // numeros ao usuario
        }
        System.out.println(soma);

        sc.close();
    }
}
