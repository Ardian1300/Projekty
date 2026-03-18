package systemRezerwacjiSal;

public interface Reservable {

    int getAvailableSpots();

    void reserve(int numberOfPeople);
}
