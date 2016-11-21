package komplexes.deadlock;

public class Schreiber2 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(10);
			Main.stiftSperre.lock();
			System.out.println("Schreiber2 hat Stift gesperrt");
			Thread.sleep(10);
			Main.papierSperre.lock();
			System.out.println("Schreiber2 hat Papier gesperrt");
			Thread.sleep(10);
			
			System.out.println("Schreiber2 schreibt");
			this.schreiben();
			
			Thread.sleep(10);
			Main.stiftSperre.unlock();
			System.out.println("Schreiber2 hat Stift entsperrt");
			Thread.sleep(10);
			Main.papierSperre.unlock();
			System.out.println("Schreiber2 hat Papier entsperrt");
			Thread.sleep(10);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void schreiben() {
		//benutze Ressource stift und papier
	}
}
