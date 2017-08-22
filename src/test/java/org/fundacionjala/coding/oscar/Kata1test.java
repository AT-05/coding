import org.fundacionjala.kata.Kata1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 17/08/2017.
 */
public class Kata1test {

    @Test
    public void return5And1ofStringOfNumbers12345(){
        String stringNumbers = "1 2 3 4 5";

        String result = Kata1.HighAndLow(stringNumbers);
        assertEquals("5 1", result);
    }

    @Test
    public void return5AndMinus3ofStringOfNumbers12minus345(){
        String stringNumbers = "1 2 -3 4 5";

        String result = Kata1.HighAndLow(stringNumbers);
        assertEquals("5 -3", result);
    }
    @Test
    public void return9AndMinus5ofStringOfNumbers1934minus5(){
        String stringNumbers = "1 9 3 4 -5";

        String result = Kata1.HighAndLow(stringNumbers);
        assertEquals("9 -5", result);
   }


}
