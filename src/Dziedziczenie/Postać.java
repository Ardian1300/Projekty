package Dziedziczenie;

public class Postać {

    public int hp;
    public int atackDemage;
    public int speedOfWalking;
    public int mana;
    public String specialAbility;
    public String name;
    public String clasa;

    public Postać(String name, String clasa, int hp, int atackDemage, int mana, int speedOfWalking, String specialAbility) {
        this.name = name;
        this.clasa = clasa;
        this.atackDemage = atackDemage;
        this.mana = mana;
        this.speedOfWalking = speedOfWalking;
        this.specialAbility = specialAbility;
        this.hp = hp;
    }

        public void info(){
        System.out.printf("Nazwa postaci: %s%n" +
                "Klasa postaci: %s%n" +
                "Poziom Zdrowia na start: %d%n" +
                "Obrażenia: %d%n" +
                "Prędkość chodzenia: %d%n" +
                "Ilość many: %d%n" +
                "Specjalna umiejętność: %s%n" +
                "Powiedzonko: "
                ,name,clasa,hp,atackDemage,speedOfWalking,mana,specialAbility);
    }
}
