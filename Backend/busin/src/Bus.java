public class Bus{
    private String busName;
    private String busType;
    private String busSource;
    private String busDestination;
    private String busArrival;
    private String busDepature;


    public Bus(String busName, String busType, String busSource, String busDestination, String busArrival, String busDepature) {
        this.busName = busName;
        this.busType = busType;
        this.busSource = busSource;
        this.busDestination = busDestination;
        this.busArrival = busArrival;
        this.busDepature = busDepature;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusSource() {
        return busSource;
    }

    public void setBusSource(String busSource) {
        this.busSource = busSource;
    }

    public String getBusDestination() {
        return busDestination;
    }

    public void setBusDestination(String busDestination) {
        this.busDestination = busDestination;
    }

    public String getBusArrival() {
        return busArrival;
    }

    public void setBusArrival(String busArrival) {
        this.busArrival = busArrival;
    }

    public String getBusDepature() {
        return busDepature;
    }

    public void setBusDepature(String busDepature) {
        this.busDepature = busDepature;
    }
}