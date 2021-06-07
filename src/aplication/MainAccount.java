package aplication;

import Exceptions.BusinessException;
import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int numb = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdraw = sc.nextDouble();
        Account account = new Account(numb,holder,balance,withdraw);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double saque = sc.nextDouble();
        try {

            account.withdraw(saque);
            System.out.println("New Balance: $ " + String.format("%.2f", account.getBalance()));
        }
        catch (BusinessException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }






        sc.close();
    }
}
