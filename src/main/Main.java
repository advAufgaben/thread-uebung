package main;

/*
 * Warum ist der Endstand nicht immer 10.000?
 */
public class Main {
	
	public static int kontostand = 10_000;
	
	public static void main(String[] args) throws InterruptedException {
		Thread abheber = new Abheber();
		Thread einzahler = new Thread(new Einzahler());
		abheber.start();
		einzahler.start();
		
		
		/*
		 * warten, dass Threads fertig werden
		 */
		abheber.join();
		einzahler.join();
		
		/*
		 * Endstand ausgeben
		 */
		System.out.println("Endstand: " + kontostand);
	}
	
}
