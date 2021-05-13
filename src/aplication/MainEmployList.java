package aplication;

import entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainEmployList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Employee2> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0 ; i < n; i++){
            System.out.println("Emplyoee #" + (i+1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)){
                System.out.print("Id Already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();// pra não consumir o enter pendente na entrada o enter do nextInt()
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double sal = sc.nextDouble();
            list.add(new Employee2(id,name,sal));

        }
        System.out.println();

        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null){
            System.out.println("This Id do not exist");
        }else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        for (Employee2 i :
                list) {
            System.out.println(i);
        }




        sc.close();
    }

    public static boolean hasId(List<Employee2> list, int id){
        Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;// ele vai retorna um true or false se emp for diferente de null o retorno pode ser uma expressão
        // essa expressao acima retorna true ou false
    }

}
