package com.efimov.pack.Invertor;

import com.efimov.pack.Interface.InterfaceInversion;

/**
     * Generalized class for array inversion
     */
    public class Invertor implements InterfaceInversion {
    /**
     * Default constructor
     *
     * @param object of type T
     */
    public Invertor() {
    }

    /**
     * Changing parametric array in the reverse direction
     *
     * @return reversed array
     */
    public <T> void reverseArray(final T[] array) {
        T tmp;
        for (Integer i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }
}