package Factory;

import Decorator.Animals;

public class AnimalFarm extends Farm { 
    public Animals getAnimals() {
        return super.getAnimals();
    }
}
