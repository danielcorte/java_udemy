package section6repetitiveStructure;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        // estrutura de controle
        // repete um bloco de comandos para um certo intervalo de valores

        // usar quando se sabe exatamente a quantidade de repetições que sera utilizada

        /*
        SINTAXE / REGRA


        for (inicio ; condição ; incremento) {    inicio -> executa somente na primeira vez
            comando 1                             condicao -> V: executa e volta | F: pula fora
            comando 2                             incremento -> executa toda vez depois de voltar
        }
        */

        // Exemplo: programa que lê um valor inteiro N e repete N vezes a solicitação de um número para o usuario
        // Fazer a soma desses N numeros e mostrar ao usuario

        Scanner sc = new Scanner(System.in);

        int qtd;
        int soma = 0;

        System.out.print("Deseja fazer a soma de quantos valores?: ");
        qtd = sc.nextInt();

        for (int i=1;i<qtd+1;i++) {
            System.out.printf("Insira o %d° valor: ", i);
            soma += sc.nextInt();
        }

        System.out.printf("A soma total dos valores é: %d", soma);

        System.out.println();
        // Contagem Regressiva
        for (int i = 10; i >= 0 ; i--) {
            System.out.println("Valor de I: " + i);
            
        }
    }

    // FOR é ótimo para fazer uma repetição baseada em uma CONTAGEM
}
