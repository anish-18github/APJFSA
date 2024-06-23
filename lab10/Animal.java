//Q.1 Create an abstract class Animal and an abstract method makesound () and inherit Animal in Dog class and implement abstract method. (Abstract class can contain non-abstract methods also).
package lab10;

//Abstract class Animal
//This method provides a default implementation for eating behavior
 abstract class Animal {
	
	 // Non-abstract method
	// This method must be implemented by any subclass of Animal
	 public void eat() {
		 System.out.println("Dog is eating....");
	 }
	 
	// Abstract method
	abstract void makesound();

}




