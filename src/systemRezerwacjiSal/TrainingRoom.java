package systemRezerwacjiSal;

public class TrainingRoom extends Room implements Reservable{

    private boolean hasProjector;

    public TrainingRoom(String name, int capacity, RoomType type, boolean hasProjector) {
        super(name, capacity, type);
        this.hasProjector = hasProjector;
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
        if(!hasProjector){
            System.out.println("Nie ma projektora");
        }
    }
    @Override
    public int getAvailableSpots() {
        return getAvailableSpot();
    }

}
