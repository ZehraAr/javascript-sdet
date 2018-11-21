
public abstract class Animal {
	
	private String name;

	public Animal(String name) {
		this.name = name;
	}
    
	public abstract void eat();
	public abstract void breathe();
	
	public String getName() {//because we will retrieve from other class
		return name;
	}//this is concrete class
	
	

}
