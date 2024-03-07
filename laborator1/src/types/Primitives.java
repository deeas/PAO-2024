package types;

/**
 * Pentru a lucra cu date avem nevoie de zone de memorie, iar pentru a lucra cu zone de memorie în limbajul Java trebuie
 * sa ne gandim la tipul de date stocat: numere, valori de adevarat sau fals, caractere sau obiecte.
 *
 * Numerele, valorile de adevarat sau fals si caracterele sunt numite tipuri primitive.
 * => byte, short, int, long, float, double, char, boolean
 *
 * Sirul de caractere (String) nu este tip primitiv!
 * Primitivele sunt tipuri de date din java care nu sunt obiecte! (obiect = instanta a unei clase)
 *
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */
public class Primitives {

    /** possible values: true, false */
    boolean a = true;

    /** possible values: from -128 to 127. It variable is initialized with a literal, it can automatically cast down.
     * If assigned a value of a larger type (eg. short, int, long), it needs to be explicitly cast: b = (byte) someShort;.
     * If it is used in a mathematical expression, it will be cast up to the largest type in the expression (Eg: int + byte = int). */
    byte b = 32;

    /** possible values: from -2^15 to 2^15-1. Similar rules to byte. */
    short c = 32;
    short s1 = 10;
    short s2 = 0xFF; // hexa incepe cu 0X sau 0x apoi [0-9A-Fa-f]

    /** possible values: from -2^31 to 2^31-1. Similar rules to byte. */
    int d = 32;
    int r1, r2, r3; // se pot declara mai multe zone de memorie cu virgula intre ele
    int r4, r5 = 10, r6;
    /** numeric literals can have underscores inside them, for separating groups. However, a numeric literal cannot start
     * or end with an underscore (Eg: _52 is an invalid number). */
    int underscoreInt= 1____234; // it represents the number 1234

    /** possible values: from -2^63 to 2^63-1. This is the largest numeric non-floating point type in java. The L or l after
     * the literal can be omitted if the context allows the compiler to auto-cast to long. Very useful to distinguish if there
     * are methods that accept both int and long and we require an explicit literal of type int or long.*/
    long e = 32L;

    /** Floating-point number. If the suffix F or f is omitted. the number will be treated as a double (and will fail as
     * it is larger that float and will not fit in this type. */
    float f = 32.3f; // f = 32.3; will fail

    /** Default floating-point number in java. The D or d after the number is usually omitted, as floating numbers are
     * treated as doubles, unless explicitly set to float using the F or f suffix. */
    double g = 32d;

    /** possible values: from 0 to 2^16-1 */
    char h = 'a';


    public static void main(String[] args) {

        Primitives p = new Primitives();
        /* NO Floating point - poate fi scrie in baza 10 / binar / octal / hexa */

        // 8 bit: [-128...127]
        byte b1; // declarare zona memorie
        b1 = 10; // pentru a da o valoare zonei de memorie se foloseste operatorul "="

        byte b2 = 023; // octal incepe cu 0

        // 16 bit
        short s1 = 10;

        short s2 = 0xFF; // hexa incepe cu 0X sau 0x apoi [0-9A-Fa-f]

        // 32 bit; 4 bytes
        int i1 = 10;

        int i2 = 0b1_0110; // binar incepe cu 0b sau 0B apoi [0-1]

        int r1, r2, r3; // se pot declara mai multe zone de memorie cu virgula intre ele
        int r4, r5 = 10, r6;

        /* numeric literals can have underscores inside them, for separating groups. However, a numeric literal cannot start
        or end with an underscore (Eg: _52 is an invalid number). */
        int i3= 1____234; // it represents the number 1234

        /** 64 bit; 8 bytes
         possible values: from -2^63 to 2^63-1. This is the largest numeric non-floating point type in java. The L or l after
         * the literal can be omitted if the context allows the compiler to auto-cast to long. Very useful to distinguish if there
         * are methods that accept both int and long and we require an explicit literal of type int or long.*/
        long l1 = 10L;

        // Floating point - pot fi doar in baza 10; diferenta dintre double si float este de precizie (nr zecimale dupa virgula)
        // 32 bit floating point; by default in java orice valoare cu virgula e considerata de tip double
        // -> de aceea folosim un literal (f, F) pentru float
        float f1 = 123.45f;

        // 64 bit floating point; by default in java orice valoare cu virgula e considerata de tip double
        double d1 = 123.456;

        // 16 bit
        char c1 = 'a'; // caracterele in Java se pun intre ghilimele simple ''; 16-bit Unicode character.
        char c2 = '\n';

        boolean k1 = false; //1 bit
        boolean k2 = true;

    }
}
