import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CSVWriter {
    public void CSVWriterTypeFilter(HashMap<String, Integer> filtedData, String Fileout) {
        try (FileWriter csvWriter = new FileWriter(Fileout)) {
            // Write header row
            csvWriter.append("Bus_type,Count\n");

           // Write data row
            for (Map.Entry<String, Integer> entry : filtedData.entrySet()) {
                csvWriter.append(entry.getKey()).append(",");
                csvWriter.append(entry.getValue().toString()).append("\n");
            }

            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void CSVWriterFilter(ArrayList<Bus> filtedData, String Fileout) {
        try (FileWriter csvWriter = new FileWriter(Fileout)) {
            // Write header row
            csvWriter.append("Bus_name,Bus_type,Source,Destination,Departure,SeatCount\n");

            // Write data row
            for (Bus bus : filtedData) {

                csvWriter.append(bus.getBusName()).append(",");
                csvWriter.append(bus.getBusType()).append(",");
                csvWriter.append(bus.getBusSource()).append(",");
                csvWriter.append(bus.getBusDestination()).append(",");
                csvWriter.append(bus.getBusDeparture()).append(",");
                csvWriter.append(bus.getSeatcnt()).append("\n");
            }

            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
