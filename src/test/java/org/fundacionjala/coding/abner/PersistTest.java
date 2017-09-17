package org.fundacionjala.coding.abner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this class persist.
 */
public class PersistTest {

    /**
     * this is the test.
     */

    @Test
    public void basicTests() {
        Persist persist = new Persist();
        System.out.println("****** Basic Tests ******");
        assertEquals(3, persist.persistence("39"));
        assertEquals(0, persist.persistence("4"));
        assertEquals(4, persist.persistence("999"));
        assertEquals(3, persist.persistence("444"));
    }
}
