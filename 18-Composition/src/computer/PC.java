package computer;

public class PC {
	private Case theCase;
	private Monitor theMonitor;
	private Motherboard theMotherboard;
	
	
	public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
	
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.theMotherboard = theMotherboard;
	}


	public Case getTheCase() {
		return theCase;
	}


	public Monitor getTheMonitor() {
		return theMonitor;
	}


	public Motherboard getTheMotherboard() {
		return theMotherboard;
	}
	
	
	

}
