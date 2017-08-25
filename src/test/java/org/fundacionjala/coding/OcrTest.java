/**
 * Created by Gary on 24/8/2017.
 */

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class OcrTest {

    @Test
  public void testBankOcrFirstCase()
    {
        String result="";
        String Line1 = "    _  _     _  _  _  _  _ ";
        String Line2 = "  | _| _||_||_ |_   ||_||_|";
        String Line3 = "  ||_  _|  | _||_|  ||_| _|";

        Ocr numbers = new Ocr();
        Assert.assertEquals("123456789",numbers.bankOcr(Line1,Line2,Line3));

    }
    @Test
    public void testBankOcrSecondCase()
    {
        String result="";
        String Line1 = "    _  _     _  _  _  _  _ ";
        String Line2 = "|_| _| _||_||_ |_ |_||_||_|";
        String Line3 = "  | _| _|  | _||_| _||_| _|";

        Ocr numbers = new Ocr();
        Assert.assertEquals("433456989",numbers.bankOcr(Line1,Line2,Line3));

    }
     @Test
    public void testcheckSum()
    {   int check;
        String result="";
        String Line1 = "    _  _     _  _  _  _  _ ";
        String Line2 = "|_| _| _||_||_ |_ |_||_||_|";
        String Line3 = "  | _| _|  | _||_| _||_| _|";

        Ocr numbers = new Ocr();
        result= numbers.bankOcr(Line1,Line2,Line3);
        check=  numbers.checkSum(result);
        Assert.assertEquals(8,check);

    }
    @Test
    public void testcheckSumCase2()
    {   int check;
        String result="";
        String Line1 = " _     _  _  _  _  _  _  _ ";
        String Line2 = " _||_||_ |_||_| _||_||_ |_ ";
        String Line3 = " _|  | _||_||_||_ |_||_| _|";

        Ocr numbers = new Ocr();
        result= numbers.bankOcr(Line1,Line2,Line3);
        check=  numbers.checkSum(result);
        Assert.assertEquals(0,check);

    }




}
