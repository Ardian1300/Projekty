package Dziedziczenie;

public class Mag extends Postać {

    public Mag(String name, String clasa, int hp, int atackDemage, int mana, int speedOfWalking, String specialAbility){
        super(name,clasa,hp,atackDemage,mana,speedOfWalking,specialAbility);
    }

    public void powiedzonko(){
        System.out.println("Jestem najwyższym magiem w tej dżungli mozesz spamować zaklęciami");
    }
}
