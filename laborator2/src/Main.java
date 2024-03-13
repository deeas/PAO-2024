import practice.chocolate.ChocolateBox;
import practice.chocolate.Milka;
import practice.complex.Complex;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Complex complex = new Complex(3, 10);
        //complex.showNumber();

        Complex complex2 = new Complex(5, 7);
        complex.addWithComplex(complex2);
        //complex.showNumber();

        Complex complex3 = Complex.sumOfComplex(complex, complex2);
        //complex3.showNumber();

        /////////////////
        ChocolateBox box = new ChocolateBox("cherry", "Romania");
        System.out.println(box.getVolume());

        Milka milka = new Milka("cocoa", "Italy", 3.4f,10f, 1.4f);
        System.out.println(milka);
        System.out.println(milka.getVolume());
    }
}