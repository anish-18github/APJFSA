//Q.2 Write a program to show multithreading in java.

package lab10;

//Class that extends Thread to create a new thread
class  Multithread extends Thread {

	String threadName;
	
//	Constructor to set thread name
	 Multithread(String name){
		threadName = name;
	}
	
//	Override the thread method to define the Thread's behavior
	@Override
	public void run() {
		
		// Loop to print the thread's running status
		for (int i = 1; i < 5; i++) {
			System.out.println(threadName+ " is running " +i);
			try {
				
				// Thread sleeps for 1000 milliseconds (1 second).
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				// Handle the interruption of the thread
				System.out.println(threadName + " is interrupted.");
			}
		}
		// Print when the thread has finished running
		System.out.println(threadName+ " has finished running.");
		
	}
}

//Main class to test multithreading
 public class MyThread{
	public static void main(String[] args) {
//		create two thread instances
		 Multithread thread1 = new  Multithread("Thread1");
		 Multithread thread2 = new  Multithread("Thread2");

//		start the thread
		thread1.start();
		thread2.start();
		
//	Main thread also print message
		for (int i = 1; i < 5; i++) {
			System.out.println("Main is running " +i);
			try {
				
				// Main thread sleeps for 1000 milliseconds (1 second)
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				// Handle the interruption of the main thread
				System.out.println("Main thread is interrupted.");
			}
		}
		
		// Print when the main thread has finished running
		System.out.println("Main thread has finished running.");
	}
}

