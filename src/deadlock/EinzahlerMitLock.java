package deadlock;

public class EinzahlerMitLock implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			Main.sperre.lock();
			
			Main.kontostand = Main.kontostand + 500;
			System.out.println("Einzahler hat 500 eingezahlt" + "\r\n" +
					"Kontostand: " + Main.kontostand);

			try {
				Thread.sleep(50);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			while(i > 1){
				int x = i*5;
				x = x * x;
			}
			
			Main.sperre.unlock();
		}
	}
	
}
