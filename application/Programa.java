package application;
import entities.Salario;
import java.util.Scanner;
import java.util.Locale;

public class Programa {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salario salario= new Salario();

        System.out.println("Name:");
        salario.name=sc.next();

        System.out.println("Salary:");
        salario.salary=sc.nextDouble();

        System.out.println("Tax:");
        salario.taxa=sc.nextDouble();

        System.out.println(salario);

        System.out.println("Which percentage to increase salary:");
        double percentage=sc.nextDouble();
        salario.increaseSalary(percentage);

        sc.close();
    }
}
