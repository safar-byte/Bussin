import java.io.IOException;
import java.util.ArrayList;

public class SourceDest {

    ArrayList<Bus> reqdList = new ArrayList<>();
    ArrayList<Bus> dests = new ArrayList<>();
    ArrayList<Bus> sourcedest = new ArrayList<>();
    CSVWriter CSW=new CSVWriter();




    public  void  runSourceDest(ArrayList<Bus> Bus, String src, String dest, String reqd,String filecsv) throws IOException {


            switch (reqd) {
                case "s": {
                    for (Bus bus : Bus) {
                        if (bus.getBusSource().equals(src)) {
                            reqdList.add(bus);
                        }
                        CSW.CSVWriterFilter(reqdList, filecsv + src + "Source.csv");
                    }
                    break;
                }
                case "sd": {
                    for (Bus bus : Bus) {
                        if (bus.getBusSource().equals(src) && bus.getBusDestination().equals(dest)) {
                            reqdList.add(bus);
                        }
                        CSW.CSVWriterFilter(reqdList, filecsv + src + dest + ".csv");
                    }
                }break;
                    case "d": {
                        for (Bus bus : Bus) {
                            if (bus.getBusDestination().equals(dest)) {
                                reqdList.add(bus);
                            }
                            CSW.CSVWriterFilter(reqdList, filecsv + dest + "Dest.csv");
                            break;
                        }
                    }break;



            }
        }



}

