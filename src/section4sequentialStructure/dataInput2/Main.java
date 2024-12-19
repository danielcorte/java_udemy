package java_udemy.dataInput2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = scanner.nextInt();
        scanner.nextLine(); // Criamos esse nextLine para ele absorver o espaço extra ao dar enter
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scanner.close();

    }
}
