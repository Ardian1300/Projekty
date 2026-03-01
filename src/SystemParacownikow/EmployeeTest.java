package SystemParacownikow;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Programmer("Jan",7000,10));
        employees.add(new Tester("Anna",6000, 10));

        for(Employee e : employees){
            System.out.println(e.getName() + " zarabia " + e.calculateSalary());
        }
    }
}
