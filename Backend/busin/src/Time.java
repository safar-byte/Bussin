import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Time {

        public ArrayList<Bus> Filter(ArrayList<Bus> bustime, String strTime , String endingTime ) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime StartTime = LocalTime.parse(strTime,formatter);
            LocalTime endTime = LocalTime.parse(endingTime,formatter);

            ArrayList<Bus> timeShedule = new ArrayList<>();
            for (Bus bus :bustime){
                LocalTime departure = LocalTime.parse(bus.getBusDeparture() ,formatter);
                if (departure.isAfter(StartTime) && departure.isBefore(endTime)){
                    timeShedule.add(bus);
                }

            }
            for(Bus hi:timeShedule) {
                System.out.println(hi.getBusDeparture() + "," + hi.getBusName());
            }
            System.out.println("FILE SCHEDULE CREATED SUCCESSFULLY");
            return timeShedule;




        }

}

