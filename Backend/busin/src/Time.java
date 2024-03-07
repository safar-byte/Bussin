import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Time {

    public ArrayList<Bus> Filter(ArrayList<Bus> bustime,String Select ) {
        String strTime="08:00" ;
        String endingTime="11:59";
        switch (Select){
            case "M":strTime="08:00";
                endingTime="11:59";
                break;
            case "A":strTime="12:00";
                endingTime="15:59";
                break;
            case "E":strTime="16:00";
                endingTime="19:59";
                break;
            case "N":strTime="20:00";
                endingTime="23:59";
                break;
            default:strTime="24:00";
                endingTime="07:59";
                break;

        }
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

        }
        System.out.println("FILE SCHEDULE CREATED SUCCESSFULLY");
        return timeShedule;




    }

}

