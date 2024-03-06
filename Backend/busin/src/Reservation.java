import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Reservation {
    public void seatUpdater( ArrayList<Bus> bus ,ArrayList<Reserve> res) {
        ArrayList<String> uniqBusList = new ArrayList<>();
        for (Reserve var : res) {
            uniqBusList.add(var.getBusName());
        }
        Set<String> uniqBusSet = new HashSet<>(uniqBusList);
    }
}
