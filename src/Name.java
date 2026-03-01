import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String imie = scanner.nextLine();
        System.out.println("Cześć " + imie);
    }
}
