/**
 * 
 * Cow is a subclass of Animal.
 * 
 * @author Melissa Liao
 * 
 */
public class Cow extends Animal {

    /**
     * Cow() constructor sets its kind variable
     */
    public Cow() {
        kind = "cow";
    }

    /**
     * speak() implements the Animal speak() method. 
     * When a cow speaks it says moo.
     */
    public String speak() {
        return "moo";
    }
    
    /**
     * eat() implements the Animal eat() method. 
     * A cow eats hay.
     */
    public String eat() {
        return "hay";
    }
}