package practice.chocolate;

public class Milka extends ChocolateBox {
    private Float length;
    private Float width;
    private Float height;

    public  Milka(){

    }

    public Milka(String flavour, String origin, Float length, Float width, Float height) {
        super(flavour, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    public Float getVolume() {
        return length * height * width;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Milka{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
