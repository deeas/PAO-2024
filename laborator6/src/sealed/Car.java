package sealed;

public non-sealed class Car extends Vehicle implements Service {

    private final int numberOfSeats;

    public Car(String registrationNumber, int numberOfSeats) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }


    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }
}
