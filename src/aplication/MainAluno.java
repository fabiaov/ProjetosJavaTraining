package aplication;

import entities.Student;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student aluno = new Student();

        System.out.print("Name: ");
        aluno.name = sc.nextLine();
        System.out.print("nota1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("nota2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("nota3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f",aluno.finalGrade());

        if (aluno.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING POINTS %.2f",aluno.missingPoints());
        }else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
