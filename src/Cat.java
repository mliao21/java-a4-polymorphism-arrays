/**
 * 
 * Cat is a subclass of Animal.
 * 
 * @author Melissa Liao
 * 
 */
public class Cat extends Animal implements Trainable {

    /**
     * Cat() constructor sets its kind variable
     */
    public Cat() {
        kind = "cat";
    }

    /**
     * speak() implements the Animal speak() method. 
     * When a cat speaks it says meow.
     */
    public String speak() {
        return "meow";
    }
    
    /**
     * eat() implements the Animal eat() method. 
     * A cat eats mice.
     */
    public String eat() {
        return "mice";
    }
    
    /**
     * doATrick() implements the Trainable interface doATrick() method. 
     * A cat can hang from the drapes.
     */
    public String doATrick() {
        return "I do tricks. I can hang from the drapes";
    }
}