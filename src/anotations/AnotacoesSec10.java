package anotations;

import java.util.Locale;
import java.util.Scanner;

public class AnotacoesSec10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] vect = new double[n];// forma de declarar um array vetor em java
        for (int i; i < n; i++){
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i; i < n; i++){
            sum+=vect[i];
        }
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n",avg);


        sc.close();
    }
}
