/**
 * Class can create an instance of a farm and updates that instance based on number of ticks.
 */

package Meditator;
import java.util.Random;
import Decorator.Currency;
import Factory.AnimalFarm;
import Factory.CropFarm;
import Factory.FarmFactory;
import Factory.HybridFarm;

public class WorldGenerator {
    private String farmType = "";
    private CropFarm crops = new CropFarm();
    private AnimalFarm animals = new AnimalFarm();
    private HybridFarm hybrid = new HybridFarm();
    private Currency curr = new Currency();
    private int farmerAffinity = 0;
    private int affinChoice = 0;
    private int plantAffinity = 0;
    private int animalAffinity = 0;
    private String daytime = "";
    private int count = 0;
    
    /**
     * Farm instance holds data related to all farm types while
     * special instances of farm types are defined as types that
     * CAN be defined depending on what type of farm is generated.
     */
    public void generateFarm() {
        FarmFactory farm = new FarmFactory();
        String choice = farm.makeFarm(randFarm()).randFarm();
        if(choice.equals("Crop")) {
           plantAffinity = crops.getCrops().getCropAffinity();
           farmerAffinity = crops.getFarmer().getFarmerAffinity();
           farmType = "Crop";
        }
        else if (choice.equals("Animal")) {
            animalAffinity = animals.getAnimals().getAnimalAffinity();
            farmerAffinity = animals.getFarmer().getFarmerAffinity();   
            farmType = "Animal";
        }
        else if (choice.equals("Hybrid")) {
            plantAffinity = hybrid.getCrops().getCropAffinity();
            animalAffinity = hybrid.getAnimals().getAnimalAffinity();
            farmerAffinity = hybrid.getFarmer().getFarmerAffinity();  
            farmType = "Hybrid";
            
        }
    }
    
    public String randFarm() {
        String choice = "";
        Random r = new Random();
        int randInt = r.nextInt(3) + 1;
        if (randInt == 1) {
            choice = "Crop";
        }
        else if (randInt == 2) {
            choice = "Animal";
        }
        else {
            choice = "Hybrid"; 
        }
        return choice;
    }
    
    public void printInitial() {
        if (count% 2 == 0) {
            System.out.println("Ticks" + count);
            daytime = "Daytime";
            count++;
        }
        else {
            daytime = "Nightime";
            count++;
        }
        
        updateCurrency();
        
        System.out.println("----------------------------------");
        System.out.println("This is a " + farmType + " Farm\n");
        if (farmType.equals("Crop")) {
            System.out.println("Occuring at: " + daytime);
            System.out.println("Farmer has a crop affinity of: " + farmerAffinity);
            System.out.println("Crops have growth affinity of: " + plantAffinity);
            System.out.println("Currency: " + curr.getCurrency());
            System.out.println("Number of crops: " + crops.getCrops().getNumCrops());
        }
        else if (farmType.equals("Animal")) {
            System.out.println("Occuring at: " + daytime);            
            System.out.println("Farmer has an animal-handling affinity of: " + farmerAffinity);    
            System.out.println("Animals have a production affinity of: " + animalAffinity);
            System.out.println("Currency: " + curr.getCurrency());
            System.out.println("Number of animals: " + animals.getAnimals().getNumAnimals());
        }
        else {
            if (affinChoice == 2) {
                System.out.println("Farmer has an animal-handling affinity of: " + farmerAffinity);  
            }
            else {
                System.out.println("Farmer has a crop affinity of: " + farmerAffinity); 
            }
            System.out.println("Occuring at: " + daytime);          
            System.out.println("Animals have a production affinity of: " + animalAffinity);
            System.out.println("Crops have growth affinity of: " + plantAffinity);
            System.out.println("Currency: " + curr.getCurrency());
            System.out.println("Numer of crops: " + crops.getCrops().getNumCrops());
            System.out.println("Number of animals: " + animals.getAnimals().getNumAnimals());           
        }
        System.out.println("----------------------------------");
    }
    
    public void updateState() {
        updateCurrency();
        if(farmType.equals("Crop")) {
            updateCrops();
        }
        else if (farmType.equals("Animal")) {
            updateAnimals();
        }
        else if (farmType.equals("Hybrid")) {
            updateCrops();
            updateAnimals();             
        }
    }
    
    public void updateAnimals() {
        if (count % 4 == 0) {
            if (farmType.equals("Animal")) {
                animals.getAnimals().setNumAnimals(animals.getAnimals().getNumAnimals()+2);
            }
            else if (farmType.equals("Hybrid")) {
                hybrid.getAnimals().setNumAnimals(hybrid.getAnimals().getNumAnimals()+2);                 
            }
        }
    }
    
    public void updateCrops() {
        if (farmType.equals("Hybrid")) {
            hybrid.getCrops().setNumCrops(hybrid.getCrops().getNumCrops() + 10);                
        }
        else if (farmType.equals("Crop")) {
            crops.getCrops().setNumCrops(crops.getCrops().getNumCrops() + 10);    
        }
        if (count % 3 == 0) {
            System.out.println("Crops harvested.");
            crops.getCrops().setNumCrops(0);  
            curr.setCurrency(curr.getCurrency()+500);
        }
    }
    
    public void disasterAnimals() {
        if (count % 9 == 0) {
            if(farmType.equals("Crop")) {
                crops.getCrops().setNumCrops(crops.getCrops().getNumCrops()-10);
            }
            else if (farmType.equals("Animal")) {
                animals.getAnimals().setNumAnimals(animals.getAnimals().getNumAnimals()-3);
            }
            else if (farmType.equals("Hybrid")) {
                hybrid.getCrops().setNumCrops(hybrid.getCrops().getNumCrops()-3);
                hybrid.getAnimals().setNumAnimals(hybrid.getAnimals().getNumAnimals()-3);
            }
        }
    }
    
    /**
     * Only occurs in daytime. (ticks % 2 == 0)
     */
    public void updateCurrency() {
        // Upgrade to passive currency every few cycles based
        // on farmer and crop or animal affinity.
        double modFCurr = 0;
        double modCCurr = 0;
        double modACurr = 0;
         if (count % 2 == 0) {
            if (count % 6 == 0) {
                if(farmType.equals("Crop")) {
                    modFCurr = ((farmerAffinity*100)/4);
                    modCCurr = ((plantAffinity*100)/4);
                    curr.setCurrency(modFCurr+modCCurr+curr.getCurrency());
                }
                else if (farmType.equals("Animal")) {
                    modFCurr = ((farmerAffinity*100)/4);
                    modACurr = ((animalAffinity*100)/4);
                    curr.setCurrency(modFCurr+modACurr+curr.getCurrency());
                }
                else if (farmType.equals("Hybrid")) {
                    modFCurr = ((farmerAffinity*100)/4);
                    modCCurr = ((plantAffinity*100)/4);
                    modACurr = ((animalAffinity*100)/4);                   
                    curr.setCurrency(modACurr + modFCurr + modCCurr+ curr.getCurrency());
                }
            }
            curr.setCurrency(curr.getCurrency()+100);
         }
    }

}
