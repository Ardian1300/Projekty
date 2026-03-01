package Dziedziczenie;

public class Rycerz extends Postać {

    public Rycerz(String name, String clasa, int hp, int atackDemage, int mana, int speedOfWalking, String specialAbility){
        super(name,clasa,hp,atackDemage,mana,speedOfWalking,specialAbility);
    }
    public void powiedzonko(){
        System.out.println("Nasza droga bedzie długa i pełna niebezpieczeństw ale mam dużą tarcze wiec spoko ");
    }
}
