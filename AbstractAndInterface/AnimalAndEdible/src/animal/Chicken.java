package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
   @Override
    public String makeSound(){
        return "Chicken: o O o O...";
    }
    @Override
    public String howToEat(){
       return "Chicken could be fried";
    }
}
