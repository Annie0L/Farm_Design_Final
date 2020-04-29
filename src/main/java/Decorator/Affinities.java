/**
 * Affinities abstract class can be used be other classes to decorate with affinities.
 * 
 * @author annelandrum
 * @version 1.0
 */
package Decorator;

public abstract class Affinities {
    private int affinity = 0;
    
    /**
     * Saves value to store affinity in respective class.
     * 
     * @return Returns int modifier value.
     */
    public int decorate() {
        return affinity;
    }
}
