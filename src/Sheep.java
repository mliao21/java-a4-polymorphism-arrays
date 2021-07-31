/**
 * 
 * Sheep is a subclass of Animal.
 * 
 * @author Melissa Liao
 * 
 */
public class Sheep extends Animal implements Trainable {

    /**
     * Sheep() constructor sets its kind variable
     */
    public Sheep() {
        kind = "sheep";
    }

    /**
     * speak() implements the Animal speak() method. 
     * When a sheep speaks it says baa.
     */
    public String speak() {
        return "baa";
    }
    
    /**
     * eat() implements the Animal eat() method. 
     * A sheep eats grass.
     */
    public String eat() {
        return "grass";
    }
    
    /**
     * doATrick() implements the Trainable interface doATrick() method. 
     * A sheep can jump in your dreams.
     */
    public String doATrick() {
        return "I do tricks. I can jump in your dreams";
    }
}