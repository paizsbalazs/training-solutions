package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger) {

        if (boat.getMaxPassengers()<=this.passengers.size()+1) {
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException("");
        }

    }

    public double getPriceForPassenger(Passenger passenger) {
        double price = 0.0;
        if (passenger.getCruiseClass().equals(CruiseClass.FIRST)) {
            price = 1.8 * this.getBasicPrice();
        } else {
            if (passenger.getCruiseClass().equals(CruiseClass.LUXURY)) {
                price = 3.0 * this.getBasicPrice();
            }
            price = this.basicPrice;
        }
        return price;
    }

}
