import java.util.Scanner;

public class ParzysteNieparzyste {

    public static void parzysta(long a){
        if(a % 2 == 0){
            System.out.println("Twoja liczba jest parzysta");
        }else{
            System.out.println("Twoja liczba jest nieparzysta");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        long a = scanner.nextInt();
        parzysta(a);
    }
}
