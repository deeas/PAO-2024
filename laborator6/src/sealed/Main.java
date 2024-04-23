package sealed;

public class Main {
    public static void main(String[] args) {
        var car = new Car("B89HXX", 3);
        var truck = new Truck("B34THY", 100);

        System.out.println(car.getMaxDistanceBetweenServicesInKilometers());
        System.out.println(truck.getMaxServiceIntervalInMonths());
    }
}
