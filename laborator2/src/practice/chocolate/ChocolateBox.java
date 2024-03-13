package practice.chocolate;

public class ChocolateBox {

    private String flavour;
    private String origin;

    public ChocolateBox() {

    }
    public ChocolateBox(String flavour, String origin) {
        this.flavour = flavour;
        this.origin = origin;
    }

    public Float getVolume() {
        return 0f;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "ChocolateBox{" +
                "flavour='" + flavour + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
