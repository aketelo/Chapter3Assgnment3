package za.ac.cput;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.impl.Lion;

/**
 * Created by Scorpian on 2016-03-12.
 */
public class TestLion {
    private Animal simba;

    @Before
    public void setUp() throws Exception {
        simba = new Lion();

    }

    @Test
    public void testFoodType() throws Exception {
        Assert.assertEquals("Carnivore",simba.eat());
    }
}
