package za.ac.cput;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Phelokazi on 2017-03-12.
 */
public class SetOOP {

    private Set<String> trainStations;


    public Set<String> getTrainStations(){

        trainStations = new HashSet<String>();

        trainStations.add("Cape Town");
        trainStations.add("Salt River");

        return trainStations;
    }

}
