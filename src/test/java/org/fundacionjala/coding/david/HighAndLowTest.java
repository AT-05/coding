package org.fundacionjala.coding.david;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * Created by Administrator on 8/21/2017.
 */
public class HighAndLowTest {

    /**
    asdasd.
     */
    @Test
    public void testHighAndLow() {
        HighAndLow highAndLow = new HighAndLow();
        assertEquals("5 1", highAndLow.highAndLow("1 2 3 4 5"));
        assertEquals("5 -3", highAndLow.highAndLow("1 2 -3 4 5"));
        assertEquals("4 -5", highAndLow.highAndLow("1 2 3 4 -5"));
    }

}
