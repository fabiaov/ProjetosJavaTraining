package aplication;

import entities.Enterprise;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainTaxPay {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int npayers = sc.nextInt();

        for (int i = 0; i < npayers; i++) {
            System.out.println("Tax Payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)?");
            char op;
            sc.nextLine();
            do {
                op = sc.next().charAt(0);
            } while (op != 'i' || op != 'c');
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double aIncomme = sc.nextDouble();

            if (op == 'i') {
                System.out.print("Health expenditures: ");
                double expend = sc.nextDouble();
                list.add(new Individual(name, aIncomme, expend));
            } else {
                System.out.print("Number of employees: ");
                int nEmploy = sc.nextInt();
                list.add(new Enterprise(name, aIncomme, nEmploy));
            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println();

        System.out.println("TAX PAID: ");
        for (TaxPayer tp : list){
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tax));
            sum += tax;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));


        sc.close();
    }
}
