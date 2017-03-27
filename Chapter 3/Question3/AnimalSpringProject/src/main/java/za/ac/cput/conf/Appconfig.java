package za.ac.cput.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Animal;
import za.ac.cput.impl.CrocImpl;
import za.ac.cput.impl.LionImpl;

/**
 * Created by Scorpian on 2016-03-12.
 */
@Configuration
public class Appconfig {

    @Bean(name="lion")
    public Animal getLion(){
        return new LionImpl();
    }


    @Bean(name="croc")
    public Animal getCroc(){
        return new CrocImpl();
    }
}
