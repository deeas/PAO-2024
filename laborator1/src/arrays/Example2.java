package arrays;

public class Example2 {
    public static void main(String[] args) {

        float[] values = {10.0f, 20.0f, 15.0f};
        // after we declare the array name, we can use an open bracket and then just list the values and enclose it
        // => It automatically allocates the right number of spaces, in this case, three, and initializes the value in each one of those spaces.

        // Exercise: go through the values array and add everything up
        float sum = 0.0f;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println("The sum of array values = " + sum);
    }
}
