import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("Liczby podziellne przez 3 zostana zamienione na Fizz");
        System.out.println("Liczby podziellne przez 5 zostana zamienione na Buzz");
        System.out.println("Liczby podziellne przez 3 i 5 zostana zamienione na FizzBuzz");
        System.out.println("podaj liczbe startowa:");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        System.out.println("podaj liczbe końcową:");
        int end = scanner.nextInt();
        System.out.println();

        for(int i = start; i <= end; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 ==0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
