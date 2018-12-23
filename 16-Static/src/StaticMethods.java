
public class StaticMethods {//one java file has only one public class

	public static void main(String[] args) {
	
      Abc.show1();
      Abc.show4();
      
      Abc x=new Abc();//we have to create object to use instance method
      x.show2();
      x.show1();//I will ask
      x.show4();//I will ask
      
      
      
      
      }

}

class Abc{
	public static void show1() {
		System.out.println("Hi1");
		//show2();//you can not run instance method from static method
		//show4();//you can call from static method
		
	}
	
	public void show2() {//instance method
		System.out.println("Hi2");
		show1();//you can call static method  from instance method
		
	}
	
	public void show3() {
		System.out.println("Hi3");
		show2();
		show1();
	}
	
	public static void show4() {
		System.out.println("hi4");
	}
}

