
public class Honda extends Car{
	
	private Engine engine;
	
	public Honda(String color,int maxSpeed,Engine engine) {
		super(color,maxSpeed);
		this.engine=engine;
	}
	public void startHonda() {
		engine.start();
	}
	
	
	

}
