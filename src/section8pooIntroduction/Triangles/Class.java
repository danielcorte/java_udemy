package section8pooIntroduction.Triangles;

import java.util.Scanner;

public class Class {

    /*
    É um tipo estruturado que pode conter: metodos e atributos

    Pode prover recursos como:
        - Construtores
        - Sobrecarga
        - Encapsulamento
        - Herança
        - Polimorfismo

    Exemplos:
        - Entidades: Produto, Cliente, Triangulo
        - Serviços: ProdutoService, ClienteService, EmailService, StorageService
        - Controladores: ProdutoController, ClienteController
        - Utilitarios: Calculadora, Compactador
        - Outros (views, repositórios, gerenciadores, etc)
    */

    public static void main(String[] args) {

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area: X");
        } else {
            System.out.println("Large area: Y");
        }

        sc.close();
    }

    public static class Triangle {

        public double a;
        public double b;
        public double c;
    }
}
