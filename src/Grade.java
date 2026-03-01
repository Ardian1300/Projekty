import java.util.Scanner;

public class Grade {

    private int value ;

    public Grade(int value){
        if (value < 1 || value > 6) {
            throw new IllegalArgumentException("Niedozwolona ocena"); // lerpiej wywalać wyjątek w konstruktorze nic w metodzie
        }
        this.value = value;
    }

    public String getDescription() {

        switch (value){
            case 6 : {
                return "Celujacy";
            }
            case 5 : {
                return "Bardzo dobry";

            }
            case 4 : {
                return "Dobry";

            }
            case 3 : {
                return "Dostateczny";

            }
            case 2 : {
                return "Dopuszczajacy";

            }
            case 1 : {
                return "Niedostateczny";

            }
        }
        return "";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ocene: ");
        int value = scanner.nextInt();
        Grade grade = new Grade(value);
        try {
            System.out.print("Twoja ocena to: " + grade.getDescription());
        } catch ( IllegalArgumentException e) {
            System.out.println( e.getMessage());
        }

    }
}
