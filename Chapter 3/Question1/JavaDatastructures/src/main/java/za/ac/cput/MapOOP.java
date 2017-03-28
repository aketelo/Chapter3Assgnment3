package za.ac.cput;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Phelokazi on 2017-03-12.
 */
public class MapOOP {

    private Map product;

    public Map<String, String> getProduct(){

        product = new HashMap<String, String>();

        product.put("1", "Sprite");
        product.put("2", "Bread");
        product.put("3", "Milk");

        return product;

    }
}
