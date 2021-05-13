package aplication;

import entities.Pensionato;

import java.util.Locale;
import java.util.Scanner;

public class MainPensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quartos = 10;
        Pensionato[] rent = new Pensionato[quartos];

        System.out.print("How many rooms will be rented? ");
        int q = sc.nextInt();

        for (int i = 0; i <= q; i++){
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rent[room] = new Pensionato(name,email);
        }
        System.out.println();

        for (int i = 0; i < rent.length; i++){
            System.out.println("Busy rooms: ");
            if(rent[i] != null){
                System.out.println((i+1) +":" + rent[i]);
            }
        }



        sc.close();
    }
}
