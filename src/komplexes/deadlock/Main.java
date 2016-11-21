package komplexes.deadlock;

import java.util.concurrent.locks.ReentrantLock;

/*
 * Kommt es hierbei zum Deadlock? Wenn ja, warum?
 */

/* b
 * Wie könnte man den entstandenen Deadlock theorethisch auflösen?
 */
public class Main {
	
	public static Ressource papier = new Ressource();
	public static Ressource stift = new Ressource();
	
	public static ReentrantLock papierSperre = new ReentrantLock();
	public static ReentrantLock stiftSperre = new ReentrantLock();
	
	public static void main(String[] args) {
		Thread schreiber1 = new Schreiber1();
		Thread schreiber2 = new Schreiber2();
		
		schreiber1.start();
		schreiber2.start();
	}
	
}
