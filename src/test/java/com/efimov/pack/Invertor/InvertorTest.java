package com.efimov.pack.Invertor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by andrey on 17.04.16.
 */
public class InvertorTest {
    private Invertor invert;

    @Before
    public void setUp(){
        this.invert = new Invertor();
    }

    @Test
    public void testReverse(){
        Integer[] original = {1, 2, 3};
        this.invert.reverseArray(original);
        assertArrayEquals("wrong reverse", new Integer[] {3, 2, 1}, original);
    }
}
