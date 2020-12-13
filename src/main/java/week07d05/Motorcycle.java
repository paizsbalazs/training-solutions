package week07d05;

public class Motorcycle extends Vechicle {

    private TransmissionType transmissionType = TransmissionType.SEQUENTIAL;

    public Motorcycle() {
        this.transmissionType = transmissionType;
    }

    @Override
    public TransmissionType getTransmissionType() {
        return this.transmissionType;
    }
}
