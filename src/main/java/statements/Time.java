package statements;

public class Time {

    private int Hour;
    private int Minute;
    private int Second;

    public int getHour() {
        return Hour;
    }

    public int getMinute() {
        return Minute;
    }

    public int getSecond() {
        return Second;
    }

    public void setHour(int hour) {
        Hour = hour;
    }

    public void setMinute(int minute) {
        Minute = minute;
    }

    public void setSecond(int second) {
        Second = second;
    }

    public Time(int hour, int minute, int second) {
        Hour = hour;
        Minute = minute;
        Second = second;
    }

    public int getInMinutes() {
        return (this.getHour()*60)+this.getMinute() ;
    }

    public int getInSeconds() {
        return (this.getHour()*360)+(this.getMinute()*60)+this.getSecond();
    }

    public Boolean earlierThan(Time time) {
       return (this.getInSeconds() < time.getInSeconds());
    }
}
