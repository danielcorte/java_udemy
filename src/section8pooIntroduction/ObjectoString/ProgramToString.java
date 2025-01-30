package section8pooIntroduction.ObjectoString;

import section8pooIntroduction.ObjectoString.ProductToString;

import java.util.Locale;
import java.util.Scanner;

public class ProgramToString {

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

        ProductToString product = new ProductToString();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product);

        sc.close();
    }
}
