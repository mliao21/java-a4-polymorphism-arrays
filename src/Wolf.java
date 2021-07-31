/**
 * 
 * Wolf is a subclass of Animal.
 * 
 * @author Melissa Liao
 * 
 */
public class Wolf extends Animal implements Predator {

    /**
     * Wolf() constructor sets its kind variable
     */
    public Wolf() {
        kind = "wolf";
    }

    /**
     * speak() implements the Animal speak() method. 
     * When a wolf speaks it says how-uul.
     */
    public String speak() {
        return "how-uul";
    }
    
    /**
     * eat() implements the Animal eat() method. 
     * A wolf eats deer.
     */
    public String eat() {
        return "deer";
    }
    
    /**
     * preysOn() implements the Predator interface preysOn() method. 
     * A wolf preys on cats and sheeps.
     * 
     * @param 	a is an Animal class type. User must input an Animal subclass.
     * @return 	a boolean. It returns to true if the Animal subclass is
     * 			either a Cat or Sheep. Otherwise, it will return to false.
     * 
     */
    public boolean preysOn(Animal a) {	
    	if (a instanceof Cat) return true;
    	else if (a instanceof Sheep) return true;
    	else {
    		return false;
    	}
    }
}