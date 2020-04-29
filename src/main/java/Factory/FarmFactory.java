/**
 * Uses a factory pattern to create a 
 */

package Factory;

public class FarmFactory {

    public Farm makeFarm(String farmType) {
        if (farmType.equals("Crop")) {
           return new CropFarm();
        }
        else if (farmType.equals("Animal")) {
            return new AnimalFarm();
        }
        else if (farmType.equals("Hybrid")) {
            return new HybridFarm();
        }
        else return null;
    }  
    
}
