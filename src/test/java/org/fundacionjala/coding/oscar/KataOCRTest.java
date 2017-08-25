import org.fundacionjala.kata.KataOCR;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 24/08/2017.
 */
public class KataOCRTest {
    /**
     * This test verifies the account 123456789.
     */
    @Test
    //public void testWhenScanAccount123456789ShoulBeReturnStringNumber(){
    public void testMapEntryToNumber(){
        String account = "    _  _     _  _  _  _  _ " +
                         "  | _| _||_||_ |_   ||_||_|" +
                         "  ||_  _|  | _||_|  ||_| _|";

        KataOCR ocr = new KataOCR();
        String result = "123456789";
        assertEquals(ocr.scanString(account),result);
    }

    /**
     * This test verifies the account 490067715.
     */
    @Test
    public void testScanNumberToAccountReturnStringTheAccountNumber490067715(){
        String account = "    _  _  _  _  _  _     _ " +
                         "|_||_|| || ||_   |  |  ||_ " +
                         "  | _||_||_||_|  |  |  | _|";

        KataOCR ocr = new KataOCR();
        String result = "490067715";
        assertEquals(ocr.scanString(account),result);
    }
}
