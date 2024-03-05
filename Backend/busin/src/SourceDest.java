import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SourceDest {


    public SourceDest(String filesrc,String src,String dest) throws IOException {
        ArrayList<String> sources=new ArrayList<>();
        ArrayList<String> dests=new ArrayList<>();
        ArrayList<String> sourcedest=new ArrayList<>();
       FileReader f = new FileReader(filesrc);
       BufferedReader br = new BufferedReader(f);
{
            String s;
            while ((s = br.readLine()) != null) {

                String[] values=s.split(",");
                if(values[2]==src)
                {
                    sources.add(s);
                }
                if(values[3]==dest)
                {
                    dests.add(s);
                }
                if(values[2]==src && values[3]==dest )
                {
                    sourcedest.add(s);
                }
                System.out.println(s);
            }
        }
        br.close();
    }
}
