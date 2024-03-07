import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Time {

    public static ArrayList<Bus> Filter(ArrayList<Bus> bustime, String Select) {
        ArrayList<Bus> time = new ArrayList<>();


        switch (Select) {
            case "M":
                time=restOfNight(bustime,"08:00","11:59");
                break;
            case "A":
                time=restOfNight(bustime,"12:00","15:59");
                break;
            case "E":
                time=restOfNight(bustime,"16:00","19:59");
                break;
            case "N":
                time=night(bustime);
                break;

        }

        return time;
    }

        public static ArrayList<Bus> restOfNight(ArrayList<Bus> bustime,String strTime,String endingTime){

            ArrayList<Bus> timeShedule = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime StartTime = LocalTime.parse(strTime, formatter);
        LocalTime endTime = LocalTime.parse(endingTime, formatter);


        for (Bus bus : bustime) {
            LocalTime departure = LocalTime.parse(bus.getBusDeparture(), formatter);
            if (departure.isAfter(StartTime) && departure.isBefore(endTime)) {
                timeShedule.add(bus);
            }


        }

        System.out.println("FILE SCHEDULE CREATED SUCCESSFULLY");
        return timeShedule;


    }

    public static ArrayList<Bus> night(ArrayList<Bus> bustime) {
        String strTime = "19:59";
        String endingTime = "23:59";
        String strTime1 = "00:00";
        String endingTime1 = "07:59";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime StartTime = LocalTime.parse(strTime, formatter);
        LocalTime endTime = LocalTime.parse(endingTime, formatter);
        LocalTime StartTime1 = LocalTime.parse(strTime1, formatter);
        LocalTime endTime1 = LocalTime.parse(endingTime1, formatter);
        ArrayList<Bus> timeShedule = new ArrayList<>();
        for (Bus bus : bustime) {
            LocalTime departure = LocalTime.parse(bus.getBusDeparture(), formatter);
            if ((departure.isAfter(StartTime) || departure.equals(strTime)) && (departure.isBefore(endTime) || departure.equals(endTime))) {
                timeShedule.add(bus);
            } else  if ((departure.isAfter(StartTime1) || departure.equals(StartTime1)) && (departure.isBefore(endTime1) || departure.equals(endTime1))) {
                timeShedule.add(bus);
            }

        }
return timeShedule;
    }

}