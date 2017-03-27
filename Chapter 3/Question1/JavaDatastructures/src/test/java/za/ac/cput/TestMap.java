package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Scorpian on 2016-03-12.
 */
public class TestMap {


    private MapOOP products = new MapOOP();

    @Test
    public void testContents() throws Exception {
        Assert.assertEquals("Sprite",products.getProduct().get("1"));
    }

    @Test
    public void testSize() throws Exception {
        Assert.assertEquals(3,products.getProduct().size());
    }

}
