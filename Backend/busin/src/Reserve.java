import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Reserve {
    private String action;
    private String busName;

    public Reserve(String action, String busName) {
        this.action = action;
        this.busName = busName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }


}
