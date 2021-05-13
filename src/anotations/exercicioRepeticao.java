package anotations;

import java.util.Locale;
import java.util.Scanner;


public class exercicioRepeticao {
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.print("Digite o valor em celsius");
            double C = sc.nextDouble();
            double F = 9.0 * C/ 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            char resp = sc.next().charAt(0);
            // para o while vc só copia o bloco de codigo acima e coloca dentro do while
            // mas sem as declarações de variavel agora é claro, mas essa forma seria inadequada
            // o correto seria usar do While, ai no caso de usar o while, teria q declarar a variavel resp
            // antes de entrar no loop com a letra "s"
            // no caso mesmo com do while tem q declarar a variavel fora do loop e utilizar ela la dentro




            sc.close();
        }
}
