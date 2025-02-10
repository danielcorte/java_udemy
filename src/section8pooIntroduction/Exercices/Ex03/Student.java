package section8pooIntroduction.Exercices.Ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    static Scanner sc = new Scanner(System.in);

    String nome;
    boolean student_situation;

    final double MIN_GRADE = 6.00;
    public static List<String> first_qua_grades = new ArrayList<>();
    public static List<String> second_qua_grades = new ArrayList<>();
    public static List<String> third_qua_grades = new ArrayList<>();
    public static List<String> all_grades = new ArrayList<>();
    static double grade;

    double average;

    public static List<String> listGrades() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.printf("Input the %d° grade of the %d° quarter: ", j, i);
                grade = sc.nextDouble();

                if (i == 0) {
                    all_grades.add(j, String.valueOf(grade));
                } else if (i == 1) {
                    all_grades.add(j, String.valueOf(grade));
                } else {
                    all_grades.add(j, String.valueOf(grade));
                }

            }
        }

        return all_grades;
    }
}
