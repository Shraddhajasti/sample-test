/**
 * Unit tests for StringReverser.
 * Run with: javac -cp . StringReverser.java StringReverserTest.java && java StringReverserTest
 */
public class StringReverserTest {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        testReverseNormalString();
        testReverseSingleCharacter();
        testReversePalindrome();
        testReverseEmptyString();
        testReverseNullInput();
        testReverseStringWithSpaces();
        testReverseStringWithSpecialChars();

        System.out.println();
        System.out.println("Results: " + passed + " passed, " + failed + " failed.");
        if (failed > 0) {
            System.exit(1);
        }
    }

    private static void assertEquals(String testName, String expected, String actual) {
        if ((expected == null && actual == null) ||
                (expected != null && expected.equals(actual))) {
            System.out.println("PASS: " + testName);
            passed++;
        } else {
            System.out.println("FAIL: " + testName
                    + " | expected: [" + expected + "] but got: [" + actual + "]");
            failed++;
        }
    }

    private static void testReverseNormalString() {
        assertEquals("reverseNormalString", "!dlroW ,olleH", StringReverser.reverse("Hello, World!"));
    }

    private static void testReverseSingleCharacter() {
        assertEquals("reverseSingleCharacter", "A", StringReverser.reverse("A"));
    }

    private static void testReversePalindrome() {
        assertEquals("reversePalindrome", "racecar", StringReverser.reverse("racecar"));
    }

    private static void testReverseEmptyString() {
        assertEquals("reverseEmptyString", "", StringReverser.reverse(""));
    }

    private static void testReverseNullInput() {
        assertEquals("reverseNullInput", null, StringReverser.reverse(null));
    }

    private static void testReverseStringWithSpaces() {
        assertEquals("reverseStringWithSpaces", "avaJ evol I", StringReverser.reverse("I love Java"));
    }

    private static void testReverseStringWithSpecialChars() {
        assertEquals("reverseStringWithSpecialChars", "!321@cba", StringReverser.reverse("abc@123!"));
    }
}
