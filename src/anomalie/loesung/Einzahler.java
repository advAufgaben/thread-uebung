package anomalie.loesung;

public class Einzahler implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			Main.kontostandSperre.lock();
			Main.kontostand = Main.kontostand + 500;
			System.out.println("Einzahler hat 500 eingezahlt" + "\r\n" +
					"Kontostand: " + Main.kontostand);
			
			Main.kontostandSperre.unlock();
			try {
				Thread.sleep(50);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
