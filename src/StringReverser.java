/**
 * Standalone Java utility to reverse a string.
 */
public class StringReverser {

    /**
     * Reverses the given string.
     *
     * @param input the string to reverse
     * @return the reversed string, or null if input is null
     */
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String[] samples = {"Hello, World!", "Java", "racecar", ""};
        for (String s : samples) {
            System.out.println("Original : " + s);
            System.out.println("Reversed : " + reverse(s));
            System.out.println();
        }
    }
}
