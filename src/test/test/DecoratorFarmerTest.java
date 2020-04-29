package test;

import org.junit.Test;
import static org.junit.Assert.*;
import Decorator.Farmer;

public class DecoratorFarmerTest {

    // A sample Cart

    Farmer farm1;
    int anim1Expected;
    
    Farmer farm2;
    int anim2Expected;
    

    @org.junit.Before
    public void setUp() throws Exception {
        farm1 = new Farmer();
        anim1Expected = 1;
        
        farm2 = new Farmer();
        anim2Expected = 0;
    }

    // anim1
    @Test
    public void anim1() {
        double amount = farm1.decorate();
        assertEquals(anim1Expected, amount, 5);
    }
    
    // anim2
    @Test
    public void anim3() {
        double amount = farm2.getFarmerAffinity();
        assertEquals(anim2Expected, amount, 5);
    }
    
}