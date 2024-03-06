import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Time {
    public ArrayList<Bus> Filter(ArrayList<Bus> bustime,String STRtime,String ENDtime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime StartTime = LocalTime.parse(STRtime,formatter);
        LocalTime endTime = LocalTime.parse(ENDtime,formatter);


        ArrayList<Bus>timeShedule = new ArrayList<>();
        for (Bus bus :bustime){
            LocalTime depature = LocalTime.parse(bus.getBusDeparture() ,formatter);
            if (depature.isAfter(StartTime) && depature.isBefore(endTime)){
                timeShedule.add(bus);
            }

        }
        for(Bus bus:timeShedule) {
            System.out.println(bus.getBusName()+"," +bus.getBusType()+"," + bus.getBusSource()+"," +bus.getBusDestination()+","+ bus.getBusDeparture());

        }
        System.out.println("FILE SCHEDULE CREATED SUCCESSFULLY");
        return timeShedule;




    }
}

