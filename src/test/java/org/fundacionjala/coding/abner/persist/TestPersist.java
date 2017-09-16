package org.fundacionjala.coding.abner.persist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this class persist.
 * Created by Administrator on 9/15/2017.
 */
public class TestPersist {

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
