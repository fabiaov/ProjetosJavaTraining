package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        int x = 3;
//        String product1 = "computer";
//        String product2 = "Office desk";
//        int age = 30;
//        int code = 5290;
//        char gender = 'F';
//        double price1 = 2100.0;
//        double price2 = 650.50;
//        double measure = 53.234567;


//        System.out.println("hello world");
//        System.out.printf("%.2fn", x);
        //aqui ele imprime o numero com . e não com ,
        // tudo que vier depois desse locale vai estar no padrão US
//        System.out.printf("%s, Which price is $ %.2f%n", product1, price1);
//        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);

        System.out.println("Enter product Data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();// variavel auxiliar
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name,price);
        product.setName("Computer");// dessa forma alteramos o nome do produto encapsulado
        product.setPrice(1200.00);
        System.out.println("Product data: " + product);


    }
}
