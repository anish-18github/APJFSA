//Q.1 Create an abstract class Animal and an abstract method makesound () and inherit Animal in Dog class and implement abstract method. (Abstract class can contain non-abstract methods also).

package lab10;

//Dog class inheriting from Animal
//This class provides a specific implementation for the makesound method
public class Dog extends Animal {

	// Implementing the abstract method
	// This method provides the sound that a dog makes
	@Override
	void makesound() {
		System.out.println("wooof!");
	}
	
	public static void main(String[] args) {
		
		// Create an instance of Dog
		Dog dog = new Dog();
		
		// Call the non-abstract method from the Animal clas
		dog.eat();
		
		// Call the implemented abstract method from the Dog class
		dog.makesound();
}

}
