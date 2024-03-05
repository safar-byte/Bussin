import java.io.BufferedReader;

public class FileReader {
    public FileReader(String filesrc)
    {
        java.io.FileReader f = new java.io.FileReader(filesrc);
        BufferedReader br = new BufferedReader(f);
        String s;
        while ((s = br.readLine()) != null) {

            String[] values=s.split(",");
    }


}
