package src.array;

public class Array_2 {
    public static void main(String[] args) {
        float[] values = {10.0f, 20.0f, 15.0f};

        //values[3] = 67.8f;
        float sum = 0.0f;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println(sum);
    }

}
