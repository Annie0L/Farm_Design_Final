package test;
import org.junit.Test;
import static org.junit.Assert.*;
import Decorator.Currency;

public class FactoryCurrTest {

    Currency curr1;
    int curr1Expected;

    @org.junit.Before
    public void setUp() throws Exception {
        curr1 = new Currency();
        curr1Expected = 5;
    }

    // crop1
    @Test
    public void anim1() {
        curr1.setCurrency(curr1Expected);
        assertEquals(curr1.getCurrency(), curr1Expected, 5);
    }

}