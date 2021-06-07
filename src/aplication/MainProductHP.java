package aplication;

import entities.ImportedProduct;
import entities.Produto;
import entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.util.*;

public class MainProductHP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List <Produto> products = new ArrayList<>();

        System.out.println("Enter the number of products:");
        int nProd = sc.nextInt();
        for (int i = 0 ; i < nProd ; i++){
            System.out.println("Product #" + (i+1) + " data");
            char op;
            do {
                System.out.print("Common, used or imported (c/u/i)?");
                sc.nextLine();
                op = sc.next().charAt(0);
            }while(op != 'c' || op != 'u' || op !='i');
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(op == 'i'){

                System.out.print("Customs Fee: ");
                double fee = sc.nextDouble();
                products.add(new ImportedProduct(name,price,fee));
            }else if(op == 'u'){

                System.out.print("Manufacture date (dd/MM/yyyy): ");
                Date manufacture = sdf.parse(sc.next());
                products.add(new UsedProduct(name,price,manufacture));

            } else{
                products.add(new Produto(name,price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Produto i :
                products) {
            System.out.println(i.priceTag());
        }




        sc.close();
    }
}
