package org.fundacionjala.coding.david;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by Administrator on 8/22/2017.
 */
public class MultipleThreeAndFiveTest {

    /**
     * asdasd.
     */
    @Test
    public void multipleThreeAndFive() {
        MultipleThreeAndFive multiple = new MultipleThreeAndFive();
        assertEquals(23, multiple.multipleThreeAndFive(10));
        assertEquals(78, multiple.multipleThreeAndFive(20));
        assertEquals(9168, multiple.multipleThreeAndFive(200));
    }

}
