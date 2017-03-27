package za.ac.cput;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.impl.CrocImpl;
import za.ac.cput.impl.LionImpl;



/**
 * Created by Scorpian on 2016-03-13.
 */
public class TestCroc {
    private Animal Croc;

    @Before
    public void setUp() throws Exception {
        Croc = new CrocImpl();

    }

    @Test
    public void testFoodType() throws Exception {
        Assert.assertEquals("Fish",Croc.eat());
    }


}
