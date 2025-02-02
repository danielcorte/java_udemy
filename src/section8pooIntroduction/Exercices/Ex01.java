package section8pooIntroduction.Exercices;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        /*
        Fazer um programa para ler os valores da largura
        e altura de um retângulo. Em seguida, mostrar na
        tela o valor da sua área, perímetro e diagonal.
        Usar uma classe como mostrado no projeto ao lado.

        Class: Retangulo
            Atributos:
                width: double
                height: double
            Metodos:
                area(): double
                perimeter(): double
                diagonal(): double
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.println("""
                 -----------------------------
                \s
                 Insira uma altura e uma \s
                 largura e eu retornarei a:\s
                 -----------------------------
                 \
              área do retângulo\s
                 \
              perímetro do retângulo\s
                 \
              diagonal do retângulo\s
                 \
              -----------------------------
               \s"""
        );
        System.out.print("Insira altura: ");
        y = sc.nextDouble();
        System.out.print("Insira largura: ");
        x = sc.nextDouble();

        System.out.println();
        System.out.printf("Área: %.2f%n", Retangulo.area(x, y));
        System.out.printf("Perímetro: %.2f%n", Retangulo.perimeter(x, y));
        System.out.printf("Diagonal: %.2f%n", Retangulo.diagonal(x, y));
        System.out.println("-----------------------------");


    }

    public static class Retangulo {

        double width;
        double height;

        public static double area(double width, double height) {

            return width * height;
        }

        public static double perimeter(double width, double height) {

            return 2 * (width + height);
        }

        public static double diagonal(double width, double height) {

            return Math.sqrt((width * width) + (height * height) );
        }

        public String toString() {
            return "Triangle's width: " + width + "\nTriangle's height: " + height;

        }
    }
}
