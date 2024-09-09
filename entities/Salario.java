package entities;

public class Salario{
    public String name;
    public double salary,taxa;

    public double NetSalary(){
        return salary-taxa;
    }

    public void increaseSalary(double percentage){
        salary+=salary*(percentage/100);
    }

    public String toString(){
        return name+" , $"+String.format("%.2f", NetSalary());
    }
}