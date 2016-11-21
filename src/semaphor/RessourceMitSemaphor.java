package semaphor;

import java.util.concurrent.Semaphore;

public class RessourceMitSemaphor {
	public Semaphore semaphor;
	private String name;
	
	public RessourceMitSemaphor(String name, int anzahlErlaubterThreads){
		super();
		this.name = name;
		this.semaphor = new Semaphore(anzahlErlaubterThreads);
	}
	
	public String getName(){
		return name;
	}
}
