package SystemParacownikow;

public class Programmer extends Employee{

    private int overtimeHours;

    public Programmer(String name, double baseSalary, int overtimeHours) {
        super(name, baseSalary);
        if(overtimeHours < 0){
            throw new IllegalArgumentException("Błędne nadgodziny");
        }else {
            this.overtimeHours = overtimeHours;
        }
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimeHours*50;
    }
}
