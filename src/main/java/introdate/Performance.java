package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {

    private LocalDate date;
    private String artist;
    private LocalTime startTime;
    private LocalTime endTime;

    public Performance() {
        this.date = LocalDate.of(1989, 6,2);
        this.artist = artist = "Queen";
        this.startTime = LocalTime.of(18, 00);
        this.endTime = LocalTime.of(20, 00);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getInfo() {
        return getArtist() + ": " + getDate() + " " + getStartTime() + " - " + getEndTime();
    }
}
