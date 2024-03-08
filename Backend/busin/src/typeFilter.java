import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class typeFilter  {
    public static HashMap<String, Integer> hasfilterByType(List<Bus> buses) throws IOException {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(Bus bus:buses){
            hashMap.put(bus.getBusType(),hashMap.getOrDefault(bus.getBusType(), 0) + 1);

        }
        return hashMap;


}
}