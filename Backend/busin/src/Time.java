import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Time {
    public ArrayList<Bus> Filter(ArrayList<Bus> bustime, String busArrival,String busDeparture ) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime StartTime = LocalTime.parse(busArrival,formatter);
        LocalTime endTime = LocalTime.parse(busDeparture,formatter);
        LocalTime time =LocalTime.parse("HH:mm",formatter);

        ArrayList<Bus> timeShedule = new ArrayList<>();
        for (Bus bus :bustime){
            LocalTime arrive = LocalTime.parse(bus.getBusArrival() ,formatter);
            LocalTime depature = LocalTime.parse(bus.getBusDepature() ,formatter);
            if (arrive.isAfter(StartTime) && depature.isBefore(endTime)){
                timeShedule.add(bus);
            }

        }
        for(Bus hi:timeShedule) System.out.println(hi.getBusDepature()+hi.getBusName());
        System.out.println("FILE SCHEDULE CREATED SUCCESSFULLY");
        return timeShedule;




    }
}

