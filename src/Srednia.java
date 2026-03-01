import java.util.ArrayList;
import java.util.Scanner;

public class Srednia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Licznik średniej");
        ArrayList<Integer> tab = new ArrayList<Integer>();
        int i = 1;
        int liczba;
        do{
            System.out.println("podaj " + i + " liczbę. Jeżeli chcesz przerwać wpisz 0");
            liczba = scanner.nextInt();
            if(liczba != 0) {
                tab.add(liczba);
                i++;
            }
        }while(liczba != 0);
        int suma = 0;
        for(int j = 0; j < tab.size(); j++){
            suma += tab.get(j);
        }
        double srednia = (double)suma / tab.size();
        System.out.println("Średnia z podanych przez ciebie liczb to: " + srednia);
    }
}
