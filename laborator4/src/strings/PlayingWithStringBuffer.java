package strings;

public class PlayingWithStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("A journey of a thousand miles ");
        sb.append("begins with a single step");
        System.out.println(sb);
        sb.replace(2, 9, "walk");
        System.out.println(sb);


    }

}
