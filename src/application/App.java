package application;

public class App {

	public static void main(String[] args) {
		/* All classes in Java has an ultimate super class called
		 * Object.  In the base Java language package.
		 * Has methods like toString, and several thread methods.
		 * So every Java class has a toString method, based on the 
		 * Object methods.  When you write a toString method and use
		 * @Override, you are actually overriding the Object toString
		 * method.
		 */
		
		Object o1 = getAnimal();
		System.out.println(o1);
	}
	
	public static Object getAnimal() {
		return new Cat();
	}

	/* Used a lot for older APIs, which can return some kind of object
	 * which you have to cast to the correct typel
	 */
	
}
