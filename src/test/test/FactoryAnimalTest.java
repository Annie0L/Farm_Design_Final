package test;

import org.junit.Test;
import static org.junit.Assert.*;
import Decorator.Animals;

public class FactoryAnimalTest {

    // A sample Cart

    Animals anim1;
    int anim1Expected;
    
    Animals anim2;
    int anim2Expected;
    
    Animals anim3;
    int anim3Expected;


    @org.junit.Before
    public void setUp() throws Exception {
        anim1 = new Animals();
        anim1Expected = 1;
        
        anim2 = new Animals();
        anim2Expected = 1;
        
        anim3 = new Animals();
        anim3Expected = 2;
        anim3.setNumAnimals(anim3Expected);
    }

    // anim1
    @Test
    public void anim1() {
        double amount = anim1.decorate();
        assertEquals(anim1Expected, amount, 5);
    }
    
    // anim2
    @Test
    public void anim3() {
        double amount = anim2.getAnimalAffinity();
        assertEquals(anim2Expected, amount, 5);
    }
    
    // anim2
    @Test
    public void anim4() {
        double amount = anim3.getNumAnimals();
        assertEquals(amount, anim3Expected, 0);
    }
}