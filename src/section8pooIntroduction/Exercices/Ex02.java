package section8pooIntroduction.Exercices;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        /*
        Fazer um programa para ler os dados de um funcionario
        (nome, salario bruto e imposto). Em seguida, mostrar
        os dados do funcionario (nome e salario liquido). Em
        seguida, aumentar o salario do funcionario com base
        em uma porcentagem dada (somente o salario bruto e
        afetado pela porcentagem) e mostrar novamente os dados
        do funcionario. Use a classe projetada abaixo.

        Classe: Employee
            Atributos:
                - Name = string
                - GrossSalary = double
                - Tax = double
            Metodos:
                - NetSalary() = double
                - IncreaseSalary(percentage : double) : void
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Insert employee's name: ");
        emp.name = sc.nextLine();
        System.out.print("Insert employee's GrossSalary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Insert salary tax %: ");
        emp.tax = sc.nextDouble();

        System.out.println("-----------------------------");
        System.out.printf("%s's net salary is R$%.2f: ", emp.name, Employee.netSalary(emp.grossSalary, emp.tax));
        System.out.println();

        System.out.println("-----------------------------");
        System.out.printf("%s received a raise, how much percent?: ", emp.name);
        emp.newSalaryTax = sc.nextDouble();
        System.out.println("-----------------------------");
        System.out.printf("After the salary raise, %s's new gross salary is: R$%.2f", emp.name, Employee.increaseSalary(emp.grossSalary, emp.newSalaryTax));
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println(emp);
    }

    public static class Employee {

        public String name;
        public double grossSalary;
        public double tax;
        public double newSalaryTax;

        public static double netSalary(double grossSalary, double tax) {
            return grossSalary - (grossSalary * (tax / 100));
        }

        public static double increaseSalary(double grossSalary, double newSalaryTax) {
            return grossSalary + (grossSalary * (newSalaryTax / 100));
        }


        public String toString() {
            return "Employee's name: " + name +
                    "\nEmployee's salary: R$" + increaseSalary(grossSalary, newSalaryTax);

        }
    }
}
