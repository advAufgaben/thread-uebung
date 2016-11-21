package semaphor;

/*
 * Könnte die Semaphorvariable in der Klasse RessourceMitSemaphor auch statisch sein? Was für Auswirkungen hätte dies?
 *
 */
public class Main {
	
	public static RessourceMitSemaphor ressource1 = new RessourceMitSemaphor("Donuts", 2);
	public static RessourceMitSemaphor ressource2 = new RessourceMitSemaphor("Aktenregal", 2);
	
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++){
			Thread thread = new RessourcenNutzer(ressource1, i);
			thread.start();
		}
		for(int i = 4; i <= 6; i++){
			Thread thread = new RessourcenNutzer(ressource2, i);
			thread.start();
		}
	}
	
}
