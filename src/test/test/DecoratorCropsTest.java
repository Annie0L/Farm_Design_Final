package test;
import org.junit.Test;
import static org.junit.Assert.*;
import Decorator.Crops;

public class DecoratorCropsTest {

    Crops crops1;
    int crops1Expected;
    
    Crops crops2;
    int crops2Expected;
    
    Crops crops3;
    int crops3Expected;


    @org.junit.Before
    public void setUp() throws Exception {
        crops1 = new Crops();
        crops1Expected = 1;
        
        crops2 = new Crops();
        crops2Expected = 1;
        
        crops3 = new Crops();
        crops3Expected = 0;
        crops3.setNumCrops(crops3Expected);
    }

    // crop1
    @Test
    public void anim1() {
        double amount = crops1.decorate();
        assertEquals(crops1Expected, amount, 5);
    }
    
    // crop2
    @Test
    public void anim3() {
        double amount = crops2.getCropAffinity();
        assertEquals(crops2Expected, amount, 5);
    }
    
    // crop2
    @Test
    public void anim4() {
        double amount = crops3.getNumCrops();
        assertEquals(crops3.getNumCrops(), amount, 0);
    }
}