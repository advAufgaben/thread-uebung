package deadlock;

public class AbheberMitLock extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			Main.sperre.lock();
			
			Main.kontostand = Main.kontostand - 500;
			System.out.println("Abheber hat 500 abgehoben" + "\r\n"
					+ "Kontostand: " + Main.kontostand);
			
			try {
				Thread.sleep(50);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			if(i > 8){
				break;
			}
			
		}
	}
	
}
