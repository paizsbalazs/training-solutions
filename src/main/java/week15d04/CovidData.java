package week15d04;

import java.time.LocalDate;

public class CovidData  implements Comparable<CovidData> {


    private String dataRep;
    private String year_week;
    private int cases;

    public CovidData(String dataRep, String year_week, int cases) {
        this.dataRep = dataRep;
        this.year_week = year_week;
        this.cases = cases;
    }

    public String getDataRep() {
        return dataRep;
    }

    public String getYear_week() {
        return year_week;
    }

    public int getCases() {
        return cases;
    }

    @Override
    public String toString() {
        return "CovidData{" +
                "dataRep='" + dataRep + '\'' +
                ", year_week='" + year_week + '\'' +
                ", cases=" + cases +
                '}';
    }

    @Override
    public int compareTo(CovidData o) {
        if (this.getCases()==o.getCases()) {
            return 0;
        } else if (this.getCases()<o.getCases()){
            return 1;
        } else {
            return -1;
        }
    }
}
