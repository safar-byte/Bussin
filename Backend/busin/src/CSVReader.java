import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    String filesrc;

    public CSVReader(String filesrc) throws IOException {
     this.filesrc=filesrc;
    }
    public ArrayList<Bus> getArray() throws IOException {
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
