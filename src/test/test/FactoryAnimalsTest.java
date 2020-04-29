package test;

import org.junit.Test;
import static org.junit.Assert.*;
import Decorator.Animals;
import Factory.AnimalFarm;

public class FactoryAnimalsTest {

    // A sample Cart

    AnimalFarm anim1;

    @org.junit.Before
    public void setUp() throws Exception {
        anim1 = new AnimalFarm();
    }

    // anim1
    @Test
    public void anim1() {
        assertNotNull(anim1.getAnimals());
    }
}