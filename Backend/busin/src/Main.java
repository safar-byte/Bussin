import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        String filesrc = "C:\\Users\\dell\\IdeaProjects\\Bussin\\CommonFiles\\mockdata.csv";


        //  This part of code is for creating an Arraylist for CSV file elements
       ArrayList<Bus> Bus;
        CSVReader csvr=new CSVReader();
        Bus=csvr.getvalue(filesrc);
        // This part of code is for source destination filtering
        String dest="";
        String source="";
        SourceDest SD=new SourceDest();
        ArrayList<Bus> Bus1 = SD.runSourceDest(Bus, "TVM", "CAL", "s");
        for(Bus heybus:Bus1)
        {
            System.out.println(heybus.getBusName()+heybus.getBusSource());
        }
        // csvwrite(SD.getSources(),sources,"filterBySource.csv");
        // csvwrite(SD.getDests(),dests,"filterByDestination.csv");
        // csvwrite(SD.getSourcedest(),sourcdest,"filterBySourceDest.csv");

        // This part of code is for Time range filtering
        String filenameTime="filterByTime.csv";
        String arrival="";
        String departure="";
        //Time T=new Time();
        //csvwrite(T.Filter(Bus,arrival,departure);


        //This part of code is for Type count and filtering



    }
}