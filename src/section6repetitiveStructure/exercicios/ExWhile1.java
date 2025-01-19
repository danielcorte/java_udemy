package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExWhile1 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            /*
    Escreva um programa que repita a leitura de uma senha até
    que ela seja válida. Para cada leitura de senha
    incorreta informada, escrever a mensagem "Senha Invalida".
    Quando a senha for informada corretamente deve ser impressa
    a mensagem "Acesso Permitido" e o algoritmo encerrado.
    Considere que a senha correta é o valor 2002.
    */

    // Exercicio 1 - Senha
    int senha = 2002;
    int tentativa = 0;

        System.out.println("Tente acertar a senha do cofre!!!");
    while (tentativa != senha) {
        System.out.println("Senha incorreta!");
        System.out.print("Tente acertar a senha (xxxx): ");
        tentativa = sc.nextInt();

        }
    System.out.println("Acesso permitido!");
    }
}
