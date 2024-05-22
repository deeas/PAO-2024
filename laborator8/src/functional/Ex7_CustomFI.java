package functional;

public class Ex7_CustomFI {

    public static void main(String[] args) {
        CustomFI customFI = (a, b, c) -> a + b + c;

        int sum = customFI.sum(1, 3, 5);
        System.out.println(sum);
    }
}