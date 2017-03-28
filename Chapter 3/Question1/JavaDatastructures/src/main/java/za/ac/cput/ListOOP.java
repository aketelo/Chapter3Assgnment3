package za.ac.cput;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Scorpian on 2016-03-12.
 */
public class ListOOP {

    private List universities;


    public List<String> getUniversities(){

        universities = new ArrayList<String>();

        universities.add("CPU");
        universities.add("UWC");
        universities.add("UCT");
        universities.add("TUT");
        universities.add("UJ");

        return universities;
    }

}
