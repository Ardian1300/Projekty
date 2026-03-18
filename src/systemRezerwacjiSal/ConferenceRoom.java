package systemRezerwacjiSal;

public class ConferenceRoom extends Room implements Reservable{


    public ConferenceRoom(String name, int capacity, RoomType type) {
        super(name, capacity, type);
    }

    @Override
    public void reserve(int numberOfPeople) {
        if (isBooked()) {
            throw new RoomAlreadyBookedException("Sala już jest zajęta");
        }
        if (numberOfPeople > getAvailableSpot()) {
            throw new CapacityExceededException("Zbyt mało miejsc");
        }
        if (getAvailableSpot() != 0) {
            decreaseAvailableSpots(numberOfPeople);
            System.out.println("Miejsca zostały zarezerwowane");
        }
        if (getAvailableSpot() == 0) {
            bookRoom();
        }
    }
    @Override
    public int getAvailableSpots() {
        return getAvailableSpot();
    }

}
