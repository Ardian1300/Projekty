
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LicznikZnaków {
    public static void main(String[] args) {

        System.out.println("podaj jakieś słowo:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] leters = word.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char c : leters){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        System.out.println(map);
    }
}
