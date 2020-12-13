package week07d05;

public class Vechicle {

    private int numberofGears = 5;
    private TransmissionType transmissionType = TransmissionType.MANUAL;

    public Vechicle() {
    }

    public TransmissionType getTransmissionType() {
        return this.transmissionType;
    }

    public int getNumberofGears() {
        return numberofGears;
    }
}
