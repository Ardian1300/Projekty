package systemRezerwacjiSal;

public abstract class Room {

    private String name;
    private int capacity;
    private RoomType type;
    private boolean isBooked;
    private int availableSpots;

    public Room(String name,int capacity,RoomType type){
        this.name = name;
        if(capacity <= 0) throw new CapacityExceededException("Niepoprawna liczba miejsc");
        this.capacity = capacity;
        this.type = type;
        this.isBooked = false;
        this.availableSpots = capacity;
    }

    //GETTERY
    public String getName() {return name;}
    public RoomType getType() {return type;}
    public int getCapacity() {return capacity;}
    public boolean isBooked() {return isBooked;}

    public void setCapacity(int capacity) {this.capacity = capacity;}

    public void bookRoom(){
        this.isBooked = true;
    }

    public void cancelBooking(){
        this.isBooked = false;
    }

    public String getInfo(){
        return "Name: " + name + ", Type: " + type + ", Capacity: " +capacity+ ", Dostępna: " + isBooked;
    }

    public  int getAvailableSpot(){
        return availableSpots;
    }

    protected void decreaseAvailableSpots(int number) {
        this.availableSpots -= number;
    }

    public abstract void reserve(int numberOfPeople);

}
