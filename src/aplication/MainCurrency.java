package aplication;

import StaticMethods.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class MainCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("What is the dolar price? : ");
        double dolarP = sc.nextDouble();
        System.out.print("How many dolars will be bought?: ");
        double valueDol = sc.nextDouble();

        System.out.println();
        System.out.println("Amount to be paid in reais = " + CurrencyConverter.dolarToReal(dolarP,valueDol));

        sc.close();
    }
}
