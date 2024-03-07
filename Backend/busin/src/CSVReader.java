import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {



    public  ArrayList<Bus> getvalue(String filesrc) throws IOException {

        ArrayList<Bus> bus=new ArrayList<>();
        FileReader f = new FileReader(filesrc);
        BufferedReader br = new BufferedReader(f);
        String s = br.readLine(); //skip first line
        while ((s = br.readLine()) != null) {
            try {
                String[] values = s.split(",");
                if (values.length != 6) {
                    throw new Exception("Invalid cvs file");
                }
                String busName = values[0].trim();
                String busType = values[1].trim();
                String busSource = values[2].trim();
                String busDestination = values[3].trim();
                String busDeparture = values[4].trim();
                String seatCount = values[5].trim();
                if (busName.isEmpty()) {
                    throw new Exception("Bus name not found");
                }
                if (busType.isEmpty()) {
                    throw new Exception("Bus Type not found");
                }
                if (busSource.isEmpty()) {
                    throw new Exception("Bus Source not found");
                }
                if (busDestination.isEmpty()) {
                    throw new Exception("Bus Destination not found");
                }
                if (busDeparture.isEmpty()) {
                    throw new Exception("Bus Departure date not found");
                }
                if (seatCount.isEmpty()) {
                    throw new Exception("Seat Count not found");
                }
                bus.add(new Bus(values[0].replaceAll("^\"|\"$", ""), values[1].replaceAll("^\"|\"$", ""), values[2].replaceAll("^\"|\"$", ""), values[3].replaceAll("^\"|\"$", ""), values[4].replaceAll("^\"|\"$", ""), values[5].replaceAll("^\"|\"$", "")));
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.exit(0);

        }
        }
        System.out.println("FILE READ SUCCESSFULLY");
        //for(Bus hi:bus) System.out.println(hi.getBusDepature()+hi.getBusDestination()+hi.getBusSource()+hi.getBusType()+hi.getBusArrival()+hi.getBusName());
        return bus;
    }
    //added
    public  ArrayList<Reserve> getReserveValue(String filesrc) throws IOException {

        ArrayList<Reserve> reserves=new ArrayList<>();
        FileReader f = new FileReader(filesrc);
        BufferedReader br = new BufferedReader(f);
        String s = br.readLine(); //skip first line
        while ((s = br.readLine()) != null) {
            try {
                String[] values = s.split(",");
                if (values.length != 2) {
                    throw new Exception("Invalid cvs file");
                }
                String busName = values[0].trim();
                String busAction = values[1].trim();

                if (busName.isEmpty()) {
                    throw new Exception("Bus name not found");
                }
                if (busAction.isEmpty()) {
                    throw new Exception("Bus Action not found");
                }
                reserves.add(new Reserve(values[0].replaceAll("^\"|\"$", ""), values[1].replaceAll("^\"|\"$", "")));
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.exit(0);

            }
        }
        System.out.println("FILE READ SUCCESSFULLY");
        //for(Bus hi:bus) System.out.println(hi.getBusDepature()+hi.getBusDestination()+hi.getBusSource()+hi.getBusType()+hi.getBusArrival()+hi.getBusName());
        return reserves;
    }

}
