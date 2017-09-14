package org.fundacionjala.coding.franco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/14/2017.
 */
public class PersistentBuggerTest {
    private PersistentBugger persistentBugger;

    /**
     * This method tests instancing of Class PersistentBugger.
     */
    @Before
    public void setUp() {
        persistentBugger = new PersistentBugger();
    }

    /**
     * This method tests result of  persistence of number 39.
     */
    @Test
    public void persistenceOf39() {
        assertEquals(3, persistentBugger.persistence(39));
    }

    /**
     * This method tests result of  persistence of number 4.
     */
    @Test
    public void persistenceOf4() {
        assertEquals(0, persistentBugger.persistence(4));
    }

    /**
     * This method tests result of  persistence of number 25.
     */
    @Test
    public void persistenceOf25() {
        assertEquals(2, persistentBugger.persistence(25));
    }

    /**
     * This method tests result of  persistence of number 999.
     */
    @Test
    public void persistenceOf999() {
        assertEquals(4, persistentBugger.persistence(999));
    }

    /**
     * This method tests result of persistence of number 444.
     */
    @Test
    public void persistenceOf444() {
        assertEquals(3, persistentBugger.persistence(444));
    }
}
