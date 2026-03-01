package Dziedziczenie;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Locale;
import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {


        System.out.println("Wybierz klese postaci: Paladyn,Mag,Rycerz");
        Scanner scanner = new Scanner(System.in);
        String postać = scanner.nextLine().toLowerCase();
        postać = postać.substring(0,1).toUpperCase() + postać.substring(1);

        switch (postać) {
            case "Paladyn":
                Paladyn paladyn = new Paladyn("Paladyn", "Podstawowa", 500, 150, 50, 100, "Blyskawica");
                paladyn.info();
                paladyn.powiedzonko();
                break;
            case "Mag":
                Mag mag = new Mag("Mag","Podstawowa",200,200,200,75,"Kóla Ognia");
                mag.info();
                mag.powiedzonko();
                break;
            case "Rycerz":
                Rycerz rycerz = new Rycerz("Rycerz","Podstawowa",1500,150,0,30,"Kamienna skóra");
                rycerz.info();
                rycerz.powiedzonko();
                break;
            default:
                System.out.println("Nie ma takiej klasy");
        }
    }
}
