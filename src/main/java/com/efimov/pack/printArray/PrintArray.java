package com.efimov.pack.printArray;

/**
 * Class for print of parametric array
 * @param parametric array
 */
public class PrintArray {
    public <T> void printArray(final T[] array) {
        for (T anArray:array) {
            System.out.print(" " + anArray);
        }
    }
}
