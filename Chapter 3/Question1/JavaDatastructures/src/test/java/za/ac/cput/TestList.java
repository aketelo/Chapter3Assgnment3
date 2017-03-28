package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Phelokazi on 2017-03-12.
 */
public class TestList {

    private ListOOP universiries = new ListOOP();

    @Test
    public void testContentts() throws Exception {
        Assert.assertEquals("UCT",universiries.getUniversities().get(2));
    }

    @Test
    public void testSize() throws Exception {
        Assert.assertEquals(5,universiries.getUniversities().size());
    }
}
