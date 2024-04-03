package strings;

public class Exercise {
    public static void main(String[] args) {
        String vowels = "aeiou";
        String s = "A journey of a thousand miles begins with a single step";

        s = s.toLowerCase();

        int noOfSpaces = 0;
        int noOfVowels = 0;
        int noOfDigits = 0;
        int noOfConsonants = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                noOfSpaces++;
            } else if (Character.isDigit(s.charAt(i))) {
                noOfDigits++;
            } else if (Character.isAlphabetic(s.charAt(i))) {
                if (isVowel(s.charAt(i), vowels)) {
                    noOfVowels++;
                } else {
                    noOfConsonants++;
                }
            }
        }

        System.out.println("Vowels: " + noOfVowels);
        System.out.println("Consonants: " + noOfConsonants);
        System.out.println("Digits: " + noOfDigits);
        System.out.println("Spaces: " + noOfSpaces);
    }

    private static boolean isVowel(char c, String vowels) {
        return vowels.indexOf(c) >= 0;
    }
}
