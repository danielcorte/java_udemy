package section8pooIntroduction.staticMembers.Exercise.SecondVersion;

import java.util.Locale;
import java.util.Scanner;

public class Program {

     // FINAL = VALOR CONSTANTE E QUE NÃO PODE SER ALTERADO

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }

}

