import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Time {
    public ArrayList<Bus> Filter(ArrayList<Bus> bustime) {
        LocalTime startTime = LocalTime.parse("09:00", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime endTime = LocalTime.parse("12:00", DateTimeFormatter.ofPattern("HH:mm"));

        ArrayList<Bus> timeSchedule = new ArrayList<>();
        for (Bus bus : bustime) {
            String departureTimeStr = bus.getBusDepature().trim();
            LocalTime departure = LocalTime.parse(departureTimeStr, DateTimeFormatter.ofPattern("HH:mm"));
            if (departure.isAfter(startTime) && departure.isBefore(endTime)) {
                timeSchedule.add(bus);
            }
        }

        for (Bus bus : timeSchedule) {
            System.out.println(bus.getBusDepature() + " " + bus.getBusName());
        }
        System.out.println("FILE SCHEDULE CREATED SUCCESSFULLY");
        return timeSchedule;
    }
}
