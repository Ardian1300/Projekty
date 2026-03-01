
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Duplikaty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Podaj liczby oddzielone spacją:");

        String line = scanner.nextLine();        // 1️⃣ wczytujemy całą linię
        String[] parts = line.split(" ");  // 2️⃣ dzielimy po spacji

        for(String part : parts) {               // 3️⃣ przechodzimy po każdym elemencie
            numbers.add(Integer.parseInt(part)); // 4️⃣ zamieniamy String → int
        }

        System.out.println("Lista: " + numbers);


        List<Integer> result = numbers
                .stream() // tworzy strumień danych w którym przepłwyaja wszytskie elementy z listy po kolei
                .distinct() // przepuszcza lemenent któryego jeszcze nie było
                .toList(); //strumień się wykonuje i powstaje lista

        System.out.println(result);
    }
}
