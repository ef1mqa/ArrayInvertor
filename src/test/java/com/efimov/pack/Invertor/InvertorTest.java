package com.efimov.pack.Invertor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Class for test reverse method
 */
public class InvertorTest {
    private Invertor invert;
    @Before
    public void setUp() {
        this.invert = new Invertor();
    }

    @Test
    public void testReverse() {
        Integer[] integerArray = {1, 2, 3};
        this.invert.reverseArray(integerArray);
        assertArrayEquals("wrong reverse", new Integer[]{3, 2, 1}, integerArray);

        Double[] doubleArray = {1.0, 2.0, 3.0};
        this.invert.reverseArray(doubleArray);
        assertArrayEquals("wrong reverse", new Double[]{3.0, 2.0, 1.0}, doubleArray);

        String[] stringArray = {"one", "two", "three"};
        this.invert.reverseArray(stringArray);
        assertArrayEquals("wrong reverse", new String[]{"three", "two", "one"}, stringArray);
    }
}
