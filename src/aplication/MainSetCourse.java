package aplication;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class MainSetCourse {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int number = sc.nextInt();
            a.add(number);
        }


        System.out.print("How many students for course B? ");
         n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int number = sc.nextInt();
            b.add(number);
        }


        System.out.print("How many students for course C? ");
         n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int number = sc.nextInt();
            c.add(number);
        }

        //precisamos agora pegar todos os alunos de todos os cursos e jogar o total dentro de uma lista

        Set<Integer> total = new HashSet<>(a);// podemos criar o valor com o elemento ja
        total.addAll(b);
        total.addAll(c);

        // no caso acima usamos o addAll que ele junta tudo e soma em um elemento como por exemplo pega os elementos de a somados e coloca na string total

        System.out.println();
        System.out.println("Total Students: " + total.size() );



        sc.close();
    }
}
