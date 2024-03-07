import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Time {

    public ArrayList<Bus> Filter(ArrayList<Bus> bustime, String Select) {
        String strTime = "";
        String endingTime = "";
        String strTime1 = "";
        String endingTime1 = "";
        switch (Select) {
            case "M":
                strTime = "08:00";
                endingTime = "11:59";
                break;
            case "A":
                strTime = "12:00";
                endingTime = "15:59";
                break;
            case "E":
                strTime = "16:00";
                endingTime = "19:59";
                break;
            case "N":
                night(bustime);
                break;

        }
        ArrayList<Bus> timeShedule = new ArrayList<>();
        if(!Select.equals("N")){


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime StartTime = LocalTime.parse(strTime, formatter);
        LocalTime endTime = LocalTime.parse(endingTime, formatter);


        for (Bus bus : bustime) {
            LocalTime departure = LocalTime.parse(bus.getBusDeparture(), formatter);
            if (departure.isAfter(StartTime) && departure.isBefore(endTime)) {
                timeShedule.add(bus);
            }


        }}

        System.out.println("FILE SCHEDULE CREATED SUCCESSFULLY");
        return timeShedule;


    }

    public void night(ArrayList<Bus> bustime) {
        String strTime = "20:00";
        String endingTime = "23:59";
        String strTime1 = "01:00";
        String endingTime1 = "07:59";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime StartTime = LocalTime.parse(strTime, formatter);
        LocalTime endTime = LocalTime.parse(endingTime, formatter);
        ArrayList<Bus> timeShedule = new ArrayList<>();
        for (Bus bus : bustime) {
            LocalTime departure = LocalTime.parse(bus.getBusDeparture(), formatter);
            if (departure.isAfter(StartTime) && departure.isBefore(endTime)) {
                timeShedule.add(bus);
            } else if (departure.isBefore(StartTime) && departure.isAfter(endTime)) {
                timeShedule.add(bus);
            }

        }

    }

}