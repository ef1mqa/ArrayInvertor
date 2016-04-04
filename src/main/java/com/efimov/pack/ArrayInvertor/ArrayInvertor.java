package com.efimov.pack.ArrayInvertor;
import com.efimov.pack.Invertor.Invertor;

/**
 * ArrayInvertor class
 * Entry point
 */
public class ArrayInvertor {
    /**
     * Main class to create an array of variables
     *
     * @param arg incoming argument
     */
    public static void main(final String[] arg) {
        Integer[] arrayInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        String[] arrayString = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        /**
         * Inversion Array of integer
         */
        System.out.print("\nИсходный массив: ");
        for (int anArray : arrayInteger) {
            System.out.print(" " + anArray);
        }
        Invertor<Integer> invertor = new Invertor<Integer>(arrayInteger);
        arrayInteger = invertor.reverseArray();
        System.out.print("\nНаш массив после инвертации: ");
        for (int anArray : arrayInteger) {
            System.out.print(" " + anArray);
        }
        /**
         * Inversion Array of Double
         */
        System.out.print("\nИсходный массив: ");
        for (double anArray2 : arrayDouble) {
            System.out.print(" " + anArray2);
        }
        Invertor<Double> invertor2 = new Invertor<Double>(arrayDouble);
        arrayDouble = invertor2.reverseArray();
        System.out.print("\nНаш массив после инвертации: ");
        for (double anArray2 : arrayDouble) {
            System.out.print(" " + anArray2);
        }
        /**
         * Inversion Array of String
          */
        System.out.print("\nИсходный массив: ");
        for (String anArray3 : arrayString) {
            System.out.print(" " + anArray3);
        }
        Invertor<String> invertor3 = new Invertor<String>(arrayString);
        arrayString = invertor3.reverseArray();
        System.out.print("\nНаш массив после инвертации: ");
        for (String anArray3 : arrayString) {
            System.out.print(" " + anArray3);
        }
    }
}

