package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;


public  double netSalary(double grossSalary){
    return this.grossSalary - tax;
}

public void increaseSalary(double percentage){
    grossSalary += grossSalary * percentage/100;
    }

    public String toString() {
        return name + increaseSalary();
    }
}

