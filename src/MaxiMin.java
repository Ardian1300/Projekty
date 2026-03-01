import java.util.Arrays;
import java.util.Scanner;

public class MaxiMin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile chcesz podać liczb: ");
        int ilosc = scanner.nextInt();
        System.out.println("Podaj " + ilosc + " liczb");
        int[] tabela = new int[ilosc];
        for(int i = 1; i <= ilosc; i++){
            System.out.print(i + ". liczba: ");
            tabela[i-1] = scanner.nextInt();
        }
        Arrays.sort(tabela); // sortuje od najmniejszej
        System.out.println("Najmniejszą podana przez Ciebie liczbą jest: " + tabela[0]);
        System.out.println("Największą podaną przez Ciebie liczbą jest: " + tabela[tabela.length -1]);
    }
}
