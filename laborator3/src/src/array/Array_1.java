package src.array;

public class Array_1 {
    public static void main(String[] args) {
        int[] array = new int[3];

        array[0] = 10;
        array[1] = 11;
        array[2] = 12;

        //array[3] = 5;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int value : array) {
            System.out.println(value);
        }

        System.out.println("Length: " + array.length);


        int[] emptyArray = new int[3];
        System.out.println("Length: " + emptyArray.length);

        System.out.println("Not initialised value: " + emptyArray[0]);
    }
}
