package test;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import Factory.CropFarm;

public class FactoryCropTest {

    CropFarm crop1;

    @org.junit.Before
    public void setUp() throws Exception {
        crop1 = new CropFarm();
    }

    // crop1
    @Test
    public void anim1() {
        assertNotNull(crop1.getCrops());
    }
  
}