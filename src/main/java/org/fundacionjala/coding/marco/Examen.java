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
        int module = value % 9;
        return module == 0 ? 9 : module;
    }
}
