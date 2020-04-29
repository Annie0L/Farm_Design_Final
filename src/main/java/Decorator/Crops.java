package Decorator;

import java.util.Random;

public class Crops extends Affinities{
    
    private int numCrops = 0;
    private int affinity = decorate();

    public int decorate() {
        cropsAffinityMod();
        return super.decorate() + affinity;
    }
    
    public void cropsAffinityMod() {
        Random r = new Random();
        int randInt = r.nextInt(4);
        affinity = randInt;
    }
    
    public int getCropAffinity() {
        return affinity;
    }
    
    public int getNumCrops() {
        return numCrops;
    }
    
    public void setNumCrops(int numCrops) {
        this.numCrops = numCrops;
    }
}
