
/**
 *  Animal is an abstract class. It's speak()
 *  method is abstract and meant to be implemented in 
 *  Animal subclasses, such as Cow, Cat, Sheep.
 *  
 *  @author Melissa Liao
 */
public abstract class Animal {
	
	
	protected String kind; // Cow, pig, cat, etc.

    /**
     * Animal() default constructor
     */
    public Animal()  {  }

    /**
     * toString() method overrides the Object toString() method.
     */
    public String toString() {
        return "I am a " + kind + " and I go " + speak() +
        		"\n" + "I eat " + eat();
    }

    /**
     * speak() returns an appropriate String representing
     * the way a certain kind of animal speaks. It is 
     * implemented in the Animal subclasses.
     */
    public abstract String speak();   // Abstract method
    
    /**
     * eat() returns an appropriate String representing what the animal eats.
     * It is implemented in the Animal subclasses.
     */
    public abstract String eat();   // Abstract method

    /** 
     * main() creates instances of Animal subclasses and invokes
     * their speak() methods, illustrating inheritance and 
     * polymorphism.
     */
	public static void main(String[] args) {
		Animal animal = new Cow();
        System.out.println(animal.toString());
        animal = new Cat();
        System.out.println(animal.toString());
        animal = new Sheep();
        System.out.println(animal.toString());
        
        // Invokes doATrick() method through Trainable interface
        // implemented in Animal subclasses: Cat and Sheep.
        Trainable pet = new Cat();
        System.out.println(pet.doATrick());
        pet = new Sheep();
        System.out.println(pet.doATrick());     
        
        // Invokes preysOn() method by casting Animal class type to Wolf class
        // Wolf class is implemented with Predator interface and validates if 
        // Animal subclasses are animals that wolf preys on.
		animal = new Wolf();
        System.out.println(animal.toString());
        System.out.println("I prey on Cows: " + ((Wolf) animal).preysOn(new Cow()));
   		System.out.println("I prey on Cats: " + ((Wolf) animal).preysOn(new Cat()));
        System.out.println("I prey on Sheeps: " + ((Wolf) animal).preysOn(new Sheep()));   

	}

}
