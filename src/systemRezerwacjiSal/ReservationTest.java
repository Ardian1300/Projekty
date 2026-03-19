package systemRezerwacjiSal;

import java.util.*;
import java.util.stream.Collectors;

public class ReservationTest {
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
    }
}
