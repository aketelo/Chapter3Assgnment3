package za.ac.cput;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.conf.Appconfig;

/**
 * Created by Scorpian on 2016-03-12.
 */
public class TestAnimal {
    private Animal lion;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
        lion = (Animal) ctx.getBean("lion");
    }
    @Test
    public void testFoodType() throws Exception {
        Assert.assertEquals("Carnivore",lion.eat());
    }
}
