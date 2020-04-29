/**
 * Animals class gives affinities to animals and stores num animals on farm.
 * 
 * @author annelandrum
 * @version 1.0
 */
package Decorator;
import java.util.Random;

public class Animals extends Affinities {
    int affinity = decorate();
    int numAnimals = 2;

    /**
     * Required to create affinity mod.
     * 
     * @return Returns modifier of crop.
     */
    public int decorate() {
        return super.decorate() + animalAffinityMod();
    }
    
    /**
     * Assists decorate.
     * 
     * @return Returns int to assist decorate.
     */
    public int animalAffinityMod() {
        Random r = new Random();
        int randInt = r.nextInt(4);
        return randInt;
    }
    
    /**
     * Returns affinity for direct access.
     * 
     * @return Returns in value as affinity.
     */
    public int getAnimalAffinity() {
        return affinity;
    }
    
    /**
     * Setter for numAnimals.
     * 
     * @param numAnimals Sets number of animals in class.
     */
    public void setNumAnimals(int numAnimals) {
        this.numAnimals = numAnimals;
    }
    
    /**
     * Getter for numAnimals.
     * 
     * @return Returns int representing number of animals on farm.
     */
    public int getNumAnimals() {
        return numAnimals;
    }
    
}
