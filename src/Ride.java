public class Ride {

    private String name;
    private int waitTime;
    private int thrillLevel;
    private String status;

    public Ride(String name, int waitTime, int thrillLevel, String status) {
        this.name = name;
        this.waitTime = waitTime;
        this.thrillLevel = thrillLevel;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public int getThrillLevel() {
        return thrillLevel;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return name + " - Wait: " + waitTime +
                " mins, Thrill: " + thrillLevel +
                ", Status: " + status;
    }
}