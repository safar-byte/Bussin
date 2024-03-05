import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Time {
    public ArrayList<Bus> Filter(ArrayList<Bus> bustime ,String busArrival , String busDepature) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime StartTime = LocalTime.parse("9:00",formatter);
        LocalTime endTime = LocalTime.parse("12:00",formatter);
        LocalTime time =LocalTime.parse("HH:mm",formatter);

        ArrayList<Bus> timeShedule = new ArrayList<>();
        for (Bus bus :bustime){
            LocalTime arrive = LocalTime.parse(bus.getBusArrival() ,formatter);
            LocalTime depature = LocalTime.parse(bus.getBusDepature() ,formatter);
            if (arrive.isAfter(StartTime) && depature.isBefore(endTime)){
                timeShedule.add(bus);
            }

        }
        return timeShedule;




    }
}

