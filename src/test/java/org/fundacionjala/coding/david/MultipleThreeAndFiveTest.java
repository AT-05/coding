package org.fundacionjala.coding.david;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * This class is for test to class MultipleThreeAndFive.
 */
public class MultipleThreeAndFiveTest {

    /**
     * This method realize test to method of class MultipleThreeAndFive.
     */
    @Test
    public void multipleThreeAndFive() {
        MultipleThreeAndFive multiple = new MultipleThreeAndFive();
        assertEquals(23, multiple.multipleThreeAndFive(10));
        assertEquals(78, multiple.multipleThreeAndFive(20));
        assertEquals(9168, multiple.multipleThreeAndFive(200));
    }

}
