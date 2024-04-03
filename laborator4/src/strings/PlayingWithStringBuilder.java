package strings;

public class PlayingWithStringBuilder {


    public static void main(String[] args) {
        String s1 = "Ana are mere";

        StringBuilder sb = new StringBuilder(s1);
        sb.append(" si pere ");
        sb.append( "si are si suc de mere");

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.setCharAt(2, 'X');

        System.out.println(sb);

    }
}
