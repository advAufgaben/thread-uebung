package komplexes.deadlock;

public class Schreiber1 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(10);
			Main.papierSperre.lock();
			System.out.println("Schreiber1 hat Papier gesperrt");
			Thread.sleep(10);
			Main.stiftSperre.lock();
			System.out.println("Schreiber1 hat Stift gesperrt");
			Thread.sleep(10);
			
			System.out.println("Schreiber1 schreibt");
			this.schreiben();
			
			Thread.sleep(10);
			Main.papierSperre.unlock();
			System.out.println("Schreiber1 hat Papier entsperrt");
			Thread.sleep(10);
			Main.stiftSperre.unlock();
			System.out.println("Schreiber1 hat Stift entsperrt");
			Thread.sleep(10);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void schreiben(){
		//benutze Ressource stift und papier
	}
}
