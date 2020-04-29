package Factory;
import java.util.Random;

import Decorator.Animals;
import Decorator.Crops;
import Decorator.Currency;
import Decorator.Farmer;

public abstract class Farm {
    private Animals animal = new Animals();
    private Crops crops = new Crops();
    private Farmer farmer = new Farmer();
    private Currency curr = new Currency();
    
    public Animals getAnimals() {
        return animal;
    }
    
    public void setAnimals(Animals animal) {
        this.animal = animal;
    }

    public Crops getCrops() {
        return crops;
    }
    
    public void setCrops(Crops crops) {
        this.crops = crops;
    }
    
    public Farmer getFarmer() {
        return farmer;
    }
    
    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }
    
    public Currency getCurrency() {
        return curr;
    }
    
    public void setCurrency(Currency curr) {
        this.curr = curr;
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
}
