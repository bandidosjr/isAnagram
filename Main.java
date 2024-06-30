import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Anagram.isAnagram("test", "tets"));
    }

    public class Anagram {

        public static boolean isAnagram(String firstWord, String secondWord) {
            if (firstWord.length() != secondWord.length()) {
                return false;
            }
            char[] fW = firstWord.toCharArray();
            System.out.println("toCharArray the first word: " + Arrays.toString(fW));
            char[] sW = secondWord.toCharArray();
            System.out.println("toCharArray the second word: " + Arrays.toString(sW));
            Arrays.sort(fW);
            System.out.println("sort the first word: " + Arrays.toString(fW));
            Arrays.sort(sW);
            System.out.println("sort the second word: " + Arrays.toString(sW));
            return Arrays.equals(fW, sW);
        }

    }
}
