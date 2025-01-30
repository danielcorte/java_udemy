package section8pooIntroduction.Triangles;

import java.util.Scanner;

public class ClassMethod {

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

        double areaX = x.area();

        double areaY = y.area();

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

        public double area() {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    /*
    Benefícios de se calcular a área de um triângulo por meio de um METODO dentro da CLASSE Triangle?

    1) Reaproveitamento de código: nós eliminamos o código repetido (cálculo das áreas
       dos triângulos x e y) no programa principal

    2) Delegação de responsabilidades: quem deve ser responsável por saber calcular a área
       de um triângulo é o próprio triângulo. A lógica do cálculo da área não deve estar
       em outro local.
     */
}
