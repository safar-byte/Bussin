import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Time {
    public ArrayList<Bus> read(String path,String busArrival , String busDepature) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM");
        LocalTime time =LocalTime.parse("HH:MM",formatter);


    }
}

