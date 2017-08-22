import com.company.Main;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gary on 17/8/2017.
 */

public class testSort {
    @Test
    public void testFirstCase() {
        Sort sort = new Sort("1 2 3 4 5");
        Assert.assertEquals("5 1", sort.HighAndLow());
    }

    @Test
    public void testSecondCase()
    {
        Sort sort = new Sort("1 2 -3 4 5");
        Assert.assertEquals("5 -3", sort.HighAndLow());
    }
    @Test
    public void testThirdCase()
    {
        Sort sort = new Sort("1 9 3 4 -5");
        Assert.assertEquals("9 -5", sort.HighAndLow());

    }
}
