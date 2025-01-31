package section8pooIntroduction;

import section8pooIntroduction.MainProduct;

import java.util.Locale;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        /*
        Toda classe em Java é uma subclasse da classe Object

        - Object possui os seguintes métodos:
            * getClass: retorna o tipo do objeto
            * equals: compara se o objeto é igual a outro
            * hashCode: retorna um código hash do objeto
            * toString: converte o objeto para string
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        MainProduct product = new MainProduct();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
