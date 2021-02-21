package week11d02;

public class Ride {

    private int nap;
    private int napif;
    private int km;

    public Ride(int nap, int napif, int km) {
        this.nap = nap;
        this.napif = napif;
        this.km = km;
    }

    public int getDayOfRide() {
        return nap;
    }

    public int getNumOfRide() {
        return napif;
    }

    public int getKm() {
        return km;
    }
}
