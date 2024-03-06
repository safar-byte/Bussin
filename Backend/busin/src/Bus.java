public class Bus{
    private String busName;
    private String busType;
    private String busSource;
    private String busDestination;

    private String busDepature;
    private String seatcnt;




    public String getSeatcnt() {
        return seatcnt;
    }

    public void setSeatcnt(String seatcnt) {
        this.seatcnt = seatcnt;
    }

    public Bus(String busName, String busType, String busSource, String busDestination, String busDepature, String seatcnt) {
        this.busName = busName;
        this.busType = busType;
        this.busSource = busSource;
        this.busDestination = busDestination;
        this.busDepature = busDepature;
        this.seatcnt=seatcnt;

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





    public String getBusDepature() {
        return busDepature;
    }

    public void setBusDepature(String busDepature) {
        this.busDepature = busDepature;
    }


}