
public class Main {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.speak();
		
		Cat c1=new Cat();
		c1.speak();
		
		Bird b1=new Bird();
		b1.speak();//we have three objects but we want to make one object and see the same result.
		//it is polymorphism
		
//		Animal a1=new Dog();//reference=Animal  object=Dog
//		a1.speak();
//		
//		Animal a2=new Cat();
//		a2.speak();
//		
//		Animal a3=new Bird();
//		a3.speak();
		
		Animal a=new Dog();
		a.speak();
		
		a=new Cat();
		a.speak();
		
		a=new Bird();
		a.speak();
	}

}
