package SystemParacownikow;

public abstract class Employee {

    protected  String name;
    protected  double baseSalary;

    public Employee(String name, double baseSalary){
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Pęsja jest nieprawidłowa");
        }else {
            this.name = name;
            this.baseSalary = baseSalary;
        }
    }

    public abstract double calculateSalary();

    public String getName(){
        return name;
    }
}
