import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        String filesrc = "C:\\Users\\dell\\IdeaProjects\\Bussin\\CommonFiles\\bus-data.csv";
        String filecsv="C:\\Users\\dell\\IdeaProjects\\Bussin\\CommonFiles\\";

        //  This part of code is for creating an Arraylist for CSV file elements
       ArrayList<Bus> Bus;
        CSVReader csvr=new CSVReader();
        Bus=csvr.getvalue(filesrc);
        // This part of code is for source destination filtering
        String dest="";
        String source="";
        SourceDest SD=new SourceDest();
        ArrayList<Bus> Bus1 = SD.runSourceDest(Bus, "TRV", "CAL", "s");

        CSVWriter CSW=new CSVWriter();
        CSW.CSVWriterFilter(Bus1,filecsv+"filterBySource.csv");


        // This part of code is for Time range filtering
        //String filenameTime="filterByTime.csv";
        //String arrival="17:50";
        //String departure="20:00";
        //Time T=new Time();
        //CSW.CSVWriterFilter(T.Filter(Bus,arrival,departure),filecsv+"TimeRangeFilter.csv");


        //This part of code is for Type count and filtering



    }
}