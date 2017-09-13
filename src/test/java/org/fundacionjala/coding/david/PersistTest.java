import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Maizman on 12/09/2017.
 */
public class PersistTest {
    @Test
    public void persistence() throws Exception {
    }

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
        assertEquals(3, Persist.persistence(444));
    }
}