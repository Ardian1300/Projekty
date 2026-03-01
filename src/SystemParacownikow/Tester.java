package SystemParacownikow;

public class Tester extends Employee{

    private int bugsFound;

    public Tester(String name, double baseSalary,int bugsFound) {
        super(name, baseSalary);
        if(bugsFound < 0){
            throw new IllegalArgumentException("Błędna ilość znalezionych błędów");
        }else {
            this.bugsFound = bugsFound;
        }
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bugsFound*20;
    }
}
