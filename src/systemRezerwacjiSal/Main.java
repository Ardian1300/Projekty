package systemRezerwacjiSal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();


        rooms.add( new ConferenceRoom("Sala Bankietowa",250,RoomType.MEDIUM));
        rooms.add( new ConferenceRoom("Sala Biurowa",35,RoomType.SMALL));
        rooms.add( new ConferenceRoom("Sala Operowa",2130,RoomType.LARGE));
        rooms.add( new TrainingRoom("Pokój do ćwiczeń",15,RoomType.SMALL,true));
        rooms.add( new TrainingRoom("Sala gimnastyczna",50,RoomType.MEDIUM,false));
        rooms.add( new TrainingRoom("Hala sportowa",350,RoomType.LARGE,true));

        try{
            rooms.get(1).reserve(59);
            System.out.println("Dostępne miejsca: " + rooms.get(1).getAvailableSpot());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            rooms.get(2).reserve(51);
            System.out.println("Dostępne miejsca: " + rooms.get(2).getAvailableSpot());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            rooms.get(3).reserve(75);
            System.out.println("Dostępne miejsca: " + rooms.get(3).getAvailableSpot());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            rooms.get(4).reserve(45);
            System.out.println("Dostępne miejsca: " + rooms.get(4).getAvailableSpot());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            rooms.get(5).reserve(5);
            System.out.println("Dostępne miejsca: " + rooms.get(5).getAvailableSpot());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Room> availableRooms = rooms.stream().filter(room -> !room.isBooked()).toList();
        // sprawdzanie które sale są niezarezerwowane , wpierw zamienia na stream sprawdza warunek i wraca do listy
        availableRooms.forEach(r -> System.out.println(r.getName()));

        List<Room> bigRooms = rooms.stream()
                .filter(room -> room.getCapacity() >= 100) // które mają pojemnosc większa/równą  niż 100
                .toList();

        bigRooms.forEach(r -> System.out.println(r.getName()));

        Optional<Room> smallRoom = rooms.stream()
                .filter(room -> room.getType() == RoomType.SMALL)  // pierwsza sala typu small
                .findFirst(); //.findFirst() NIE zwraca Room, tylko Optional<Room> bo mozę nic nie znaleźć

        smallRoom.ifPresent(r -> System.out.println(r.getName()));

        long bookedCount = rooms.stream() // sprawdzanie ile jest zajętych sal
                .filter(Room::isBooked) // jest to to samo co .filter(room -> room.isBooked())
                .count();

        System.out.println("Zajęte sale: " + bookedCount);

        List<String> names = rooms.stream()
                .map(Room::getName) // map zmienia obiekt na String
                .toList();

        names.forEach(System.out::println);

        Optional<Room> biggestRoom = rooms.stream()
                .max(Comparator.comparing(Room::getCapacity)); // zwraca największa sale

        biggestRoom.ifPresent(r ->
                System.out.println("Największa: " + r.getName()));

        boolean invalidData = rooms.stream()
                .anyMatch(room -> room.getCapacity() <= 0); //sprawdź czy istnieje sala o capacity <= 0 (błąd danych)

        System.out.println("Czy są błędne dane: " + invalidData);

        boolean allValid = rooms.stream()
                .allMatch(room -> room.getCapacity() > 0); //czy wszytskie sale maja capacity > 0

        boolean hasLarge = rooms.stream()
                .anyMatch(room -> room.getType() == RoomType.LARGE); //czy istnieje sala typu LARGE
    }
}
