import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SourceDest {

    ArrayList<Bus> sources=new ArrayList<>();
    ArrayList<Bus> dests=new ArrayList<>();
    ArrayList<Bus> sourcedest=new ArrayList<>();

    public ArrayList<Bus> getSources() {
        return sources;
    }

    public ArrayList<Bus> getDests() {
        return dests;
    }

    public ArrayList<Bus> getSourcedest() {
        return sourcedest;
    }

    public void runSourceDest(ArrayList<Bus> Bus, String src, String dest) throws IOException {

        for(Bus bus:Bus)
        {
            if(bus.getBusSource().equals(src))
            {
                sources.add(bus);
            }
            if(bus.getBusSource().equals(src) &&  bus.getBusDestination().equals(dest))
            {
                sourcedest.add(bus);
            }
            if(bus.getBusDestination().equals(dest))
            {
                dests.add(bus);
            }
        }


    }
}
