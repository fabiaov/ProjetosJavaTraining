package aplication;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class mainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rect = new Rectangle();
        System.out.println("Enter the Rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        sc.close();
        System.out.println("AREA = " + rect.area());
        System.out.println("PERIMETER = " + rect.perimeter());
        System.out.println("DIAGONAL = " + rect.diagonal());
    }
}
