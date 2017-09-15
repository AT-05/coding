package org.fundacionjala.coding.Marco;

/**
 * this is my finish exam, this was made by marco mendez september 15, 2017.
 */
public class Exam {
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
