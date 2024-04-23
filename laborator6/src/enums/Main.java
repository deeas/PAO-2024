package enums;

enum DAY {
    MON,
    TUE,
    WED
}

enum Month {
    MON,
    FEB,
    MAR
}
public class Main {

    public static void main(String[] args) {
        TrafficSignal[] signals = TrafficSignal.values();

        for (TrafficSignal signal : signals) {
            System.out.println("name:  " + signal.name() + " action: " + signal.getAction());
        }

        System.out.println(Month.MON.equals(DAY.MON));

        //System.out.println(Month.MON == .MON);

        for (var counter=4; counter>=0; counter++){
            System.out.println(counter + " ");
        }
    }
}
