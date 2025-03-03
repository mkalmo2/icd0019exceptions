package exceptions.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BadTryCatchTest {

    @Test
    public void findsStringsWithNoDuplicateLetters() {

        assertTrue(Code.containsSingleLetters("abc"));

        assertFalse(Code.containsSingleLetters("aabc"));

        assertFalse(Code.containsSingleLetters("aba"));

        // unexpected result
        assertTrue(Code.containsSingleLetters(null));
    }

}
