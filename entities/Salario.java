package entities;

public class Salario{
    public String name;
    public double salary,taxa;

    public double NetSalary(){
        return salary-taxa;
    }

    public void double increaseSalary(double percentage){
        (salary+taxa)*(percentage/100);
    }

    public String toString(){
        return name+" , $"+String.format("%.2f", NetSalary());
    }
}