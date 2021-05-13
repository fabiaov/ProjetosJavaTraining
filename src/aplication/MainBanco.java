package aplication;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class MainBanco {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank conta;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        char op = 'y';
        do {
            System.out.print("Is there na initial deposit (y/n)? ");
            op = sc.next().charAt(0);
        } while (op != 'y' || op != 'n');

        switch (op) {
            case op == 'y':
                System.out.print("Enter a deposit value: ");
                double deposit = sc.nextDouble();
                conta = new Bank(accountNumber, holder, deposit);
                break;
            case op == 'n':
                conta = new Bank(accountNumber, holder);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }

        System.out.println("Account Data: ");
        System.out.print(conta);
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(conta);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        conta.withdraw(saque);
        System.out.println("Updated account data: ");
        System.out.println(conta);


        sc.close();
    }
}
