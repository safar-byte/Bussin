import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
    public ArrayList<Bus> CSVReader(String filesrc) throws IOException {
        ArrayList<Bus> bus=new ArrayList<>();
        java.io.FileReader f = new java.io.FileReader(filesrc);
        BufferedReader br = new BufferedReader(f);
        String s;
        while ((s = br.readLine()) != null) {

            String[] values = s.split(",");
            bus.add(new Bus(values[0],values[1],values[2],values[3],values[4],values[5]));

        }
        return bus;
    }


}
