/**
 * Predator is an interface.
 * It's preysOn() method is meant to be implemented
 * in Animal subclasses that preys on small animals.
 * 
 * @author Melissa Liao
 *
 */
public interface Predator {
	
	/**
	 * @param a is an Animal class type. User must input an Animal subclass.
	 * @return a boolean.
	 */
	public static boolean preysOn(Animal a) {
		return a instanceof Animal;
	}

}
