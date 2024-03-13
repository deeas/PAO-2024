package practice.complex;

	 /*Să se creeze o clasă numită Complex, care are doi membri de tip int (real și imaginary),
care vor fi private. Realizați următoarele subpuncte:

        •	să se creeze doi constructori: primul primește doi parametri de tip int
        (primul desemnează partea reală a unui număr complex, al doilea partea imaginară),
al doilea nu primește niciun parametru și apelează primul constructor cu valorile 0 și 0,
        •	să se scrie metode de tip getter și setter, prin care putem accesa membrii privați ai clasei
•	să se scrie o metodă de tip void numită addWithComplex, care primește ca parametru un
obiect de tip Complex, prin care se adună numărul complex dat ca parametru la numărul
care apelează funcția (adică la this)
•	să se scrie o metodă de tip void numita showNumber, prin care se afișează numărul complex */

public class Complex {

    private int realPart;
    private int imaginaryPart;

    public Complex() {
        this(0, 0);
    }

    public Complex (int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;

    }

    public void addWithComplex(Complex complex) {
        this.realPart +=complex.realPart;
        this.imaginaryPart += complex.imaginaryPart;
    }

    public void showNumber() {
        System.out.println("Real part: " + this.realPart + ": Imaginary part: " + this.imaginaryPart);
    }

    public static Complex sumOfComplex(Complex complex1, Complex complex2) {
        return new Complex(complex1.realPart + complex2.realPart, complex1.imaginaryPart + complex2.imaginaryPart);
    }

    public int getRealPart() {
        return realPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
}
