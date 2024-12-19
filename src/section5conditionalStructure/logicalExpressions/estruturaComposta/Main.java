package java_udemy.section5conditionalStructure.logicalExpressions.estruturaComposta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora;
        int x = 1;

        System.out.println("Quantas horas? ");
        hora = scanner.nextInt();

    if (hora < 12) {
        System.out.println("Bom dia");
    }

    else if (hora > 12 && hora < 19) {
        System.out.println("Boa tarde");
    } else {
        System.out.println("Boa noite");
    }

    scanner.close();
    }
}
