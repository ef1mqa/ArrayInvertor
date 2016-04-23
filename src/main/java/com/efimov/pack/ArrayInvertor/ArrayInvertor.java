package com.efimov.pack.ArrayInvertor;
import com.efimov.pack.Invertor.Invertor;
import com.efimov.pack.printArray.PrintArray;

/**
 * ArrayInvertor class
 * Entry point
 */
public class ArrayInvertor {
    /**
     * Main class to create an array of variables
     *
     *
     * @param arg incoming argument
     */
    public static void main(final String[] arg) {
        Integer[] arrayInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        String[] arrayString = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] arrayNull = null;
        /**
         * Inversion Array of integer
         */
        PrintArray print = new PrintArray();
        System.out.print("\nИсходный массив: ");
        print.printArray(arrayInteger);
        Invertor invertor = new Invertor();
        invertor.reverseArray(arrayInteger);
        System.out.print("\nНаш массив после инвертации: ");
        print.printArray(arrayInteger);
        /**
         * Inversion Array of Double
         */
        System.out.print("\nИсходный массив: ");
        print.printArray(arrayDouble);
        invertor.reverseArray(arrayDouble);
        System.out.print("\nНаш массив после инвертации: ");
        print.printArray(arrayDouble);
        /**
         * Inversion Array of String
         */
        System.out.print("\nИсходный массив: ");
        print.printArray(arrayString);
        invertor.reverseArray(arrayString);
        System.out.print("\nНаш массив после инвертации: ");
        print.printArray(arrayString);
        try {
            invertor.reverseArray(arrayNull);
        } catch (NullPointerException e) {
            System.out.println("\nВместо массива пришла Null ссылка");
        }
    }
}


