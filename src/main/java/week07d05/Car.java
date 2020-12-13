package week07d05;

public class Car extends Vechicle{

    private TransmissionType transmissionType = TransmissionType.AUTOMATIC;

    public Car() {
        this.transmissionType = transmissionType;
    }

    @Override
    public TransmissionType getTransmissionType() {
        return this.transmissionType;
    }
}
