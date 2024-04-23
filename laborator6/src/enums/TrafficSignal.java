package enums;

public enum TrafficSignal {
    RED("STOP"),
    GREEN("GO"),
    ORANGE("SLOW DOWN");

    private String action;

    private TrafficSignal(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }
}
