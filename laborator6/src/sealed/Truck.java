package sealed;

public final class Truck extends Vehicle implements Service {

    private final int loadCapacity;

    public Truck(String registrationNumber, int loadCapacity) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 18;
    }
}
