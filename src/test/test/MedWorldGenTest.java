package test;
import org.junit.Test;
import static org.junit.Assert.*;
import Meditator.WorldGenerator;

public class MedWorldGenTest {

    WorldGenerator wrld1;
    String wrld1Expected;
    
    WorldGenerator wrld2;
    String wrld2Expected;
    
    WorldGenerator wrld3;
    int wrld3Expected;
    

    @org.junit.Before
    public void setUp() throws Exception {
        wrld1 = new WorldGenerator();
        wrld1Expected = wrld1.getFarmType();
        
        wrld2 = new WorldGenerator();
        wrld2Expected = wrld2.getDayTime();
    }


    // wrld1
    @Test
    public void wrld1() {
        for (int i = 0; i < 7; i++) {
            wrld1.generateFarm();
            wrld2.printInitial();
        }
        assertNotNull(wrld1Expected);
    }
    
    // wrld2
    @Test
    public void wrld2() {
        for (int i = 0; i < 7; i++) {
            wrld2.printInitial();
        }
        wrld2.updateAnimals();
        wrld2.updateState();
        wrld2.updateState();
        wrld2.updateState();
        wrld2.disasterAnimals();
        wrld2.disasterAnimals();
        wrld2.disasterAnimals();
        wrld2.disasterAnimals();
        wrld2.updateCurrency();
        wrld2.updateCurrency();
        wrld2.updateCurrency();
        wrld2.updateCurrency();
        wrld2.updateCurrency();
        wrld2.updateCrops();
        assertNotNull(wrld2Expected);
    }
    
}