package SystemPojazdow;

public class Car extends Vehicle{

    @Override
    public void start() {
        System.out.println("Odpalam kluczyk w samochodzie i wciskam pedał gazu");
    }

    @Override
    public void stop() {
        System.out.println("Wciskam pedał hamulca i zatrzymuje się");
    }
}
