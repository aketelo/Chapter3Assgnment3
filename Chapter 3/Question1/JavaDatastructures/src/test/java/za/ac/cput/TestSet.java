package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Scorpian on 2016-03-12.
 */
public class TestSet {

    private SetOOP trainStations = new SetOOP();

    @Test
    public void testContents() throws Exception {
        Assert.assertNotNull(trainStations.getTrainStations().size());
    }

    @Test
    public void testSize() throws Exception {
      Assert.assertEquals(2,trainStations.getTrainStations().size());
    }

}
