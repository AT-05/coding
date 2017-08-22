import org.fundacionjala.kata.Kata2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 18/08/2017.
 */
public class Kata2test {

    @Test
    public void sumOfMultiplesOf3and5(){

        assertEquals(23, Kata2.solution(10));
        assertEquals(78, Kata2.solution(20));
        assertEquals(9168, Kata2.solution(200));

    }
}
