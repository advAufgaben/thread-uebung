package deadlock;

import java.util.concurrent.locks.ReentrantLock;

/*
 * Wieso kommt es hierbei zum Deadlock?
 * 
 * Wie kann man den Deadlock auflösen?
 */

public class Main {
	
	public static int kontostand = 10_000;
	public static ReentrantLock sperre = new ReentrantLock();
	
	public static void main(String[] args) {
		Thread abheber = new AbheberMitLock();
		Thread einzahler = new Thread(new EinzahlerMitLock());
		abheber.start();
		einzahler.start();
	}
	
}
