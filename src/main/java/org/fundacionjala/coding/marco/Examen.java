package org.fundacionjala.coding.marco;

/**
 * This was made by Marco Mendez September 15, 2017.
 */
public class Examen {
    /**
     * This method calculate digital root.
     *
     * @param value test.
     * @return test.
     */
    public int root(int value) {
        return (value != 0 && value % 9 == 0) ? 9 : value % 9;
    }
}
