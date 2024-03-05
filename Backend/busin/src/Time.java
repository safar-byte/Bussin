import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Time {
    public ArrayList<Bus> read(String path) {
        ArrayList<Bus> timeSheduleList = new ArrayList<>();
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(path));
            while (fileReader.readLine() != null) {
                String line = timeSheduleList.readLine();
                String[] data = line.split(",");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

