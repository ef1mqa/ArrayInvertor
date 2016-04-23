package com.efimov.pack.printArray;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Class for testing printArray method
 */
public class PrintArrayTest {
    private ByteArrayOutputStream out;
    @Before
    public void setUp(){
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testPrintArray(){
        Double[] secondDoubleArray = {1.53, 2.37, 7.57};
        PrintArray print = new PrintArray();
        print.printArray(secondDoubleArray);
        assertEquals(" 1.53 2.37 7.57", getOut());
    }
    private String getOut() {
        return new String(out.toByteArray());
    }
}
