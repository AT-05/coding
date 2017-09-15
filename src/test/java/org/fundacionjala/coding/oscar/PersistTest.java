package org.fundacionjala.coding.oscar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 15/09/2017.
 */
public class PersistTest {
    private Persist persist;

    /**
     * This executed before any test.
     */
    @Before
    public void setUp() {
        persist = new Persist();
    }

    /**
     * Basic test.
     */
    @Test
    public void basicTests() {
        assertEquals(3, persist.persistence(39));
        assertEquals(0, persist.persistence(4));
        assertEquals(2, persist.persistence(25));
        assertEquals(4, persist.persistence(999));
        assertEquals(3, persist.persistence(444));
    }
}
