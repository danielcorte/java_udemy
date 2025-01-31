package section8pooIntroduction.staticMembers.Exercise.ThirdVersion;

import section8pooIntroduction.staticMembers.Exercise.ThirdVersion.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}

/*
Se mostrou desnecessário a utilização de objeto para os metodos
pois indeferente do objeto, se o parametro passado for o mesmo
o valor retornado vai se manter.
 */