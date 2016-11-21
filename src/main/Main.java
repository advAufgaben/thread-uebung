package main;

public class Main {
	
	public static int kontostand = 10_000;
	
	public static void main(String[] args) {
		Thread abheber = new Abheber();
		Thread einzahler = new Thread(new Einzahler());
		abheber.start();
		einzahler.start();
	}
	
}
