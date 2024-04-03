package strings;

public class PlayingWithStrings {
    public static void main(String[] args) {
        String s1 = "this is a string";
        String s3 = "this is a string";
        String s2 = new String("sdasfdsafsd");
        String s4 = new String("sdasfdsafsd");

        System.out.println(s1.concat(s2));

        System.out.println(s1.toUpperCase());
        System.out.println("Lungimea: " + s1.length());
        System.out.println(s1.indexOf('g'));

        String[] strings = s1.split(" ");

        for (int i = 0; i< strings.length; i++) {
            System.out.println(strings[i]);
        }

        String substring = s1.substring(5, 10);
        System.out.println("Substring: " + substring);


        if ( s1.equals(s3)) {
            System.out.println("(1) Strings are equals");
        }

        if (s1 == s3) {
            System.out.println("(1) Strings are the same");
        }

        if ( s2.equals(s4)) {
            System.out.println("(2) Strings are equals");
        }

        if (s2 == s4) {
            System.out.println("(2) Strings are the same");
        }

        for (int i = 0; i< s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

//s1.charAt(100);
    }
}
