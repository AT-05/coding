/**
 * Created by Gary on 29/8/2017.
 */




import com.company.CheckSum;
import org.junit.Test;
import org.junit.Assert;
public class testCheckSum {

    @Test
    public void testCheckSum()
    {String chain="4003301018398";

    Assert.assertTrue(CheckSum.checkSum1(chain));

    }

}
