package semaphor;

public class RessourcenNutzer extends Thread {
	
	RessourceMitSemaphor ressource;
	int nr;
	
	public RessourcenNutzer(RessourceMitSemaphor ressource, int nr) {
		this.ressource = ressource;
		this.nr = nr;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(100);
			ressource.semaphor.acquire();
			System.out.println("Nutzer " + nr + " hat " + ressource.getName() + " gesperrt");
			Thread.sleep(100);
			
			
			
			Thread.sleep(100);
			ressource.semaphor.release();
			System.out.println("Nutzer " + nr + " hat " + ressource.getName() + " entsperrt");
			Thread.sleep(100);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
