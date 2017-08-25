import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Samuel on 24/08/2017.
 */
public class NumberMapTest {

    @Test
    public void testMapNumber_chek_value(){
        NumberMap mapin=new NumberMap();
   /* String stringCode="    _  _     _  _  _  _  _ " +
                        "  | _| _||_||_ |_   ||_||_|" +
                        "  ||_  _|  | _||_|  ||_| _|";*/

        String stringCodeOne =   "    _  _     _  _  _  _  _ " ;
        String stringCodeTwo =   "  | _| _||_||_ |_   ||_||_|" ;
        String stringCodeThree = "  ||_  _|  | _||_|  ||_| _|";

        assertEquals("123456789",mapin.chek_value(stringCodeOne,stringCodeTwo,stringCodeThree));

    }

    @Test
    public void test_chek_value_with_sevent(){
        NumberMap maping=new NumberMap();
   /* String stringCode="    _  _     _  _  _  _  _ " +
                        "  | _| _||_||_ |_   ||_||_|" +
                        "  ||_  _|  | _||_|  ||_| _|";*/

        String stringCodeOne =   "    _  _     _  _  _ " ;
        String stringCodeTwo =   "  | _| _||_||_ |_   |" ;
        String stringCodeThree = "  ||_  _|  | _||_|  |";

        assertEquals("1234567",maping.chek_value(stringCodeOne,stringCodeTwo,stringCodeThree));

    }

    @Test
    public void test_chek_value_with_three(){
        NumberMap maping=new NumberMap();
   /* String stringCode="    _  _     _  _  _  _  _ " +
                        "  | _| _||_||_ |_   ||_||_|" +
                        "  ||_  _|  | _||_|  ||_| _|";*/

        String stringCodeOne =   " _  _  _  _  _  _  _  _  _ ";
        String stringCodeTwo =   " _| _| _| _| _| _| _| _| _|";
        String stringCodeThree = " _| _| _| _| _| _| _| _| _|";

        assertEquals("333333333",maping.chek_value(stringCodeOne,stringCodeTwo,stringCodeThree));

    }



    @Test
    public void testMapNumber_chek_one_value(){
        NumberMap mapin=new NumberMap();
   /* String stringCode="    _  _     _  _  _  _  _ " +
                        "  | _| _||_||_ |_   ||_||_|" +
                        "  ||_  _|  | _||_|  ||_| _|";*/

        String stringCodeOne =   "   " ;
        String stringCodeTwo =   "  |" ;
        String stringCodeThree = "  |";

        assertEquals(1,mapin.chek_one_value(stringCodeOne,stringCodeTwo,stringCodeThree));

    }
}
