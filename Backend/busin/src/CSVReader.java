import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {



    public static ArrayList<Bus> getvalue(String filesrc) throws IOException {

        ArrayList<Bus> bus=new ArrayList<>();
        FileReader f = new FileReader(filesrc);
        BufferedReader br = new BufferedReader(f);
        String s=br.readLine(); //skipping the heading
        while (( s=br.readLine()) != null) {
            try {
                String[] values = s.split(",");
                if (values.length != 5) {
                    throw new Exception("Invalid cvs file");
                }
                String busName = values[0].trim();
                String busType = values[1].trim();
                String busSource = values[2].trim();
                String busDestination = values[3].trim();
                String Departure = values[4].trim();
                if (busName.isEmpty()) {
                    throw new Exception("Bus name  not found");
                }
                if (busType.isEmpty()) {
                    throw new Exception("Bus type not found");
                }
                if (busSource.isEmpty()) {
                    throw new Exception("Bus source not found");
                }
                if (busDestination.isEmpty()) {
                    throw new Exception("Bus Destination not found");
                }
                if (Departure.isEmpty()) {
                    throw new Exception("Bus Departure not found");
                }
                bus.add(new Bus(values[0], values[1], values[2], values[3], values[4]));
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.exit(0);

        }
        }
        System.out.println("FILE READ SUCCESSFULLY");
        //for(Bus hi:bus) System.out.println(hi.getBusDepature()+hi.getBusDestination()+hi.getBusSource()+hi.getBusType()+hi.getBusArrival()+hi.getBusName());
        return bus;
    }


}
