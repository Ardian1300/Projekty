import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class LiczbaPierwsza {
    public static void main(String[] args) {

        System.out.println("podaj liczbe do sprawdzenia:");
        Scanner scanner = new Scanner(System.in);
        long pierwsza = scanner.nextLong();

        ArrayList<Long> dzielniki = new ArrayList<>();
        for(long i = 2; i < pierwsza; i++){
            if(pierwsza % i ==0){
                dzielniki.add(i);
            }
        }
        if(dzielniki.isEmpty()){
            System.out.println("Liczba jest pierwsza");
        }else{
            System.out.println("Liczba nie jest pierwsza");
            System.out.print("Jej dzielniki to " + dzielniki);
        }
    }
}
