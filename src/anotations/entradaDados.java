package anotations;

import java.util.Scanner;

public class entradaDados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//deste modo estou associando o meu objeto scanner ao teclado no modo console
        String x;
//        x = sc.next();// isso aqui vai permitir que a gente digite uma palavra e esta sera armazenada na variavel x
//        System.out.println("Você digitou: " + x);
        // para digitar um valor inteiro segue abaixo:
        int y;
        y = sc.nextInt();
        System.out.println("Você digitou inteiro: " + y);

        double z; // le um double
        z = sc.nextDouble();
        System.out.println("Você digitou double: " + z);
        char w;
        w = sc.next().charAt(0);// pega o primeiro caractere do string q é o 0
        System.out.println("Você digitou char: " + w);

        sc.close();

    }

}
