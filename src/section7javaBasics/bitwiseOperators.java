package section7javaBasics;

import java.util.Scanner;

public class bitwiseOperators {

    public static void main(String[] args) {

        /*
          OPERADORES BITWISE

          Operador  | Significado
              &     | Operação "E" bit a bit
              |     | Operação "OU" bit a bit
              ^     | Operação "OU-exclusivo" bit a bit => FF e VV = F | FV e VF = V
         */

        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2); // 24
        System.out.println(n1 | n2); // 125
        System.out.println(n1 ^ n2); // 101

        /*
        Muito utilizado em programação baixo nivel
        interface de rede por exemplo
         */

        // EXEMPLO

        Scanner sc = new Scanner(System.in);

        int mask = 0b00100000; // com 0b podemos passar numeros em formato binario
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }
    }
}
