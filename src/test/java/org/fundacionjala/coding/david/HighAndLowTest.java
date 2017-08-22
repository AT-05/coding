package org.fundacionjala.coding.david;



/**
 * Created by Administrator on 8/21/2017.
 */
public class HighAndLow {

    @Test
    public void testHighAndLow() {
        HighAndLow highAndLow = new HighAndLow();
        assertEquals("5 1", highAndLow.highAndLow("1 2 3 4 5"));
        assertEquals("5 -3", highAndLow.highAndLow("1 2 -3 4 5"));
        assertEquals("4 -5", highAndLow.highAndLow("1 2 3 4 -5"));
    }

}
