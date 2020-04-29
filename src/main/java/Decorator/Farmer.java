package Decorator;

import java.util.Random;

public class Farmer extends Affinities {
    int affinity = decorate();

    public int decorate() {
        return super.decorate() + farmerAffinityMod();
    }
    
    public int farmerAffinityMod() {
        Random r = new Random();
        int randInt = r.nextInt(4);
        return randInt;
    }
    
    public int getFarmerAffinity() {
        return affinity;
    }
 
}
