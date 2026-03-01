import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {

        System.out.println("podaj słowo/słowa do odwrócenia:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char[] leters = text.toCharArray();// tworzy tablice liter ze słowa
        String reversed = "";
        for (int i = leters.length-1; i >= 0; i--) {
            reversed += text.charAt(i); // dodaje kolejna litere do
        }
        System.out.println("odwrócony tekst to:");
        System.out.println(reversed);
    }
}
