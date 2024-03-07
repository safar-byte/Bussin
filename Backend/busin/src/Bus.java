public class Bus{
    private String busName;
    private String busType;
    private String busSource;
    private String busDestination;
    private String busDeparture;
    private String seatcnt;
    private String maxCnt;
    public String getSeatcnt() {
        return seatcnt;
    }
    public void setSeatcnt(String seatcnt) {
        this.seatcnt = seatcnt;
    }
    public Bus(String busName, String busType, String busSource, String busDestination, String busDeparture, String seatcnt) {
        this.busName = busName;
        this.busType = busType;
        this.busSource = busSource;
        this.busDestination = busDestination;
        this.busDeparture = busDeparture;
        this.seatcnt=seatcnt;
        maxCnt=seatcnt;

    }
//added again
    public String getMaxCnt() {
        return maxCnt;
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
    }public String getBusDeparture() {
        return busDeparture;
    }

    public void setBusDeparture(String busDeparture) {
        this.busDeparture = busDeparture;
    }
}