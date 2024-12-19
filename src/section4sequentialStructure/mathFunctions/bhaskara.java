package java_udemy.mathFunctions;

public class bhaskara {

    public static void main(String[] args) {

        double delta;
        double a = 1;
        double b = 1;
        double c = 1;
        double x1, x2;

        delta = Math.pow(b, 2.0) - 4*a*c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println(x1);
        System.out.println(x2);
    }
}
