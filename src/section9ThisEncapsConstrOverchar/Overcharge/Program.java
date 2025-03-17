package section9ThisEncapsConstrOverchar.Overcharge;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);
        System.out.println("Product data: " + product.name + ", $" + product.price + ", " + product.quantity + " units");

        sc.close();
    }
}
