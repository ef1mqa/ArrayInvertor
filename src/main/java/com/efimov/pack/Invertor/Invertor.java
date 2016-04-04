package com.efimov.pack.Invertor;

import com.efimov.pack.Interface.InterfaceInversion;

/**
     * Generalized class for array inversion
     */
    public class Invertor<T> implements InterfaceInversion {
        private T[] array;
    /**
     * Constructor
     * @param object of type T
     */
    public Invertor(final T[] object) {
        array = object;
    }
    /**
     * Changing array in the reverse direction
     * @return reversed array
     */
    public T[] reverseArray() {
        T tmp;
        for (Integer i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}