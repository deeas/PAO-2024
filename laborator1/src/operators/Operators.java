package operators;

public class Operators {
    public static void main(String[] args) {
        int myValue = 50;
        myValue -= 5;

        System.out.println("myValue = " + myValue);

        int myOtherValue = 100;
        int val1 = 5, val2 = 10;

        myOtherValue /= val1 * val2;

        System.out.println("myOtherValue" + myOtherValue);

        boolean b1 = true == false;

        boolean b2 = 3 > 10;

        System.out.println(b1);
        System.out.println(b2);

        int x = 10;
        int y = 20;
        boolean b3 = y <= x;
        System.out.println(b3);
        int ty = 47;
        System.out.println(ty++);
        System.out.println(ty);

        if (y / x < 5) {
            System.out.println("A");
        } else {
            System.out.println("B");
        } // A

        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("1 + 2 = " + (1 + 2));

        System.out.println(1 + 2 + "abc");
        System.out.println("abc" + 1 + 2);

        System.out.println("abc" + 10 % 2);

        int a = 10, b = 5, c = 1, result;
        result = a - ++c - ++b;
        System.out.println("Result: " + result);

        System.out.println("abc" + 10 / 2); // "abc5"
        System.out.println("abc" + 10 + 2); // "abc102"
        System.out.println(2 - 1 + "abc"); // "1abc"


        System.out.println(1 + 2 + "abc" + 1 + 2); //"3abc12"

        Long l = 1L;


    }
}
