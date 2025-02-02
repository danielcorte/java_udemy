package section8pooIntroduction.staticMembers.FinalExercise;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double realValue;

        System.out.printf("The price of the dolar today is %.2f%n: ", CurrencyConverter.DOLAR_TODAY);

        System.out.print("How many dollars will be bought?: ");
        realValue = sc.nextDouble();
        sc.close();

        System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.ConvertToReal(realValue));
    }
}
