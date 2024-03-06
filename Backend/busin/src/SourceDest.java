import java.io.IOException;
import java.util.ArrayList;

public class SourceDest {

    ArrayList<Bus> reqdList = new ArrayList<>();
    ArrayList<Bus> dests = new ArrayList<>();
    ArrayList<Bus> sourcedest = new ArrayList<>();



    public ArrayList<Bus> runSourceDest(ArrayList<Bus> Bus, String src, String dest, String reqd) throws IOException {

        for (Bus bus : Bus) {
            switch (reqd) {
                case "s": {

                    if (bus.getBusSource().equals(src)) {
                        reqdList.add(bus);
                    }
                }



                case "d":
                    if (bus.getBusSource().equals(src) && bus.getBusDestination().equals(dest)) {
                        reqdList.add(bus);
                    }


                case "sd":
                    if (bus.getBusDestination().equals(dest)) {
                        reqdList.add(bus);
                    }



            }
        }
    System.out.println("success");
    return reqdList;
    }
}

