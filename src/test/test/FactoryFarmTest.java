package test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import Factory.Farm;
import Factory.FarmFactory;

public class FactoryFarmTest {
    FarmFactory curr1;
    Farm curr1Expected;
    
    FarmFactory curr2;
    Farm curr2Expected;

    FarmFactory curr3;
    Farm curr3Expected;
    
    @org.junit.Before
    public void setUp() throws Exception {
        curr1 = new FarmFactory();
        curr1Expected = curr1.makeFarm("Hybrid");
        
        curr2 = new FarmFactory();
        curr2Expected = curr2.makeFarm("Alpha");        
        
        curr3 = new FarmFactory();
        curr3Expected = curr3.makeFarm("Crop");  
    }

    // farm1
    @Test
    public void farm1() {
        assertNotNull(curr1Expected);
    }
    
    // farm2
    @Test
    public void farm2() {
        assertNull(curr2Expected);
    }

    // farm2
    @Test
    public void farm3() {
        assertNotNull(curr3Expected);
    }
}
