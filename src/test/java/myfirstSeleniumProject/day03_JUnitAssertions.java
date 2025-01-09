package myfirstSeleniumProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class day03_JUnitAssertions {

    @Test
    public void assertions() {

        Assertions.assertEquals(4, 5);
    }


    @Test
    public void assertEquels() {

        Assertions.assertEquals("apple", "APPLE".toLowerCase());
    }

    @Test
    public void assertEquels02() {

        Assertions.assertEquals(5.12, 5.12);
    }


    @Test
    public void assertEquel03() {

        Assertions.assertTrue(10 > 8);
    }

    @Test
    public void assertEquel04() {

        Assertions.assertTrue(7 > 6);
        Assertions.assertTrue(5 == 5);
        Assertions.assertTrue(6 > 5);
        Assertions.assertFalse(2 > 3);
        Assertions.assertFalse(5 > 3);

    }

    @Test
    public void assertNull() {

        String str = "a";
        Assertions.assertNull(str);

        Assertions.assertFalse("Java".contains("Techpro"));
    }
}