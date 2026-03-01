package Dziedziczenie;

public class Paladyn extends Postać {

    public Paladyn(String name, String clasa, int hp, int atackDemage, int mana, int speedOfWalking, String specialAbility){
        super(name,clasa,hp,atackDemage,mana,speedOfWalking,specialAbility);
    }

    public void powiedzonko(){
        System.out.println("Uczyłem się na paladyna tyle czasu a nawet nie potrafie latać");
    }
}
