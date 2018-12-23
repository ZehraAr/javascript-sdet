
public class StaticClass {

	public static void main(String[] args) {
		
		StaticTest static1=new StaticTest("Instance-1");
		System.out.println(static1.getName()+" is instance number "+static1.getNumInstance());
        
		StaticTest static2=new StaticTest("Instance-2");
		System.out.println(static2.getName()+" is instance number "+static2.getNumInstance());
	}

}
