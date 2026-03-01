import java.util.Scanner;

public class Kalkulator {

    public double dodawanie(double a, double b){
        double sum = a + b;
        return sum;
    }

    public double odejmowanie(double a, double b){
        double roznica = a - b;
        return roznica;
    }

    public double mnozenie(double a, double b){
        double wynik = a * b;
        return wynik;
    }

    public double dzielenie(double a, double b) throws IllegalArgumentException {
        if(b == 0 ){
            throw new IllegalArgumentException();
        }else{
            return a/b;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("Jaka operacje chcesz wykonać?: dodawanie,odejmowanie,mnożenie,dzielenie ");
        String dzialanie = scanner.nextLine().toLowerCase();
        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();


        switch (dzialanie) {
            case "dodawanie": {
                System.out.println(kalkulator.dodawanie(a, b));
                break;
            }
            case "odejmowanie": {
                System.out.println(kalkulator.odejmowanie(a, b));
                break;
            }
            case "mnożenie": {
                System.out.println(kalkulator.mnozenie(a, b));
                break;
            }
            case "dzielenie": {
                try {
                    System.out.println(kalkulator.dzielenie(a, b));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            default: {
                System.out.println("Błędne działanie");
            }
        }
    }
}
