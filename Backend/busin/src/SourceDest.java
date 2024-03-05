import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SourceDest {


    public SourceDest(String filesrc) throws IOException {
       FileReader f = new FileReader(filesrc);
       BufferedReader br = new BufferedReader(f);
{
            String s;
            while ((s = br.readLine()) != null) {

                System.out.println(s);
            }
        }
        br.close();
    }
}
