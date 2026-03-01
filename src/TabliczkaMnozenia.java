import java.util.Scanner;

public class TabliczkaMnozenia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj zakres tabeli:");
        int zakres = scanner.nextInt();

        System.out.print("      ");
        for(int i = 1; i <= zakres; i++ ){
            if(i >999){
                System.out.print(i + "  ");
            }else if(i > 99 && i <= 999){
                System.out.print(i + "   ");
            }else if(i >= 10 && i <= 99){
                System.out.print(i + "    ");
            } else {
                System.out.print(i + "     ");
            }
        }
        System.out.println("");

        for(int wier = 1; wier <= zakres; wier++ ){
            if(wier > 999){
                System.out.print(wier + "  ");
            }else if(wier > 99 && wier <= 999){
                System.out.print(wier + "   ");
            }else if (wier >= 10 && wier <= 99){
                System.out.print(wier + "    ");
            }else {
                System.out.print(wier + "     ");
            }
            for(int col = 1; col <=zakres; col++ ){
                int sum = wier * col;
                if(sum >9999){
                    System.out.print(sum + " ");
                }else if(sum >999 && sum <= 9999){
                    System.out.print(sum + "  ");
                } else if (sum > 99 && sum <= 999){
                    System.out.print(sum + "   ");
                }else if (sum >= 10 && sum <= 99){
                    System.out.print(sum + "    ");
                }else {
                    System.out.print(sum + "     ");
                }
            }
            System.out.println("");
        }
    }
}
