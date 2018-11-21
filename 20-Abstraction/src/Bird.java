
public abstract class Bird extends Animal{
    public Bird(String name) {
    	 super(name);
     }
	public void eat() {
		System.out.println(getName()+"is pecking");
	}
	
	public void breathe() {
		System.out.println("Breathe in,breathe out");
		
	}
	public abstract void fly();
}
