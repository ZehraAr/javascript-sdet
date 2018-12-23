
public class Main {

	public static void main(String[] args) {
		
//		dog1.name="Bubbly";
//		dog1.age=5;
//		dog1.breed="Poodle";
//		dog1.color="White";
//		
//		System.out.println(dog1.name+":"+dog1.age+":"+dog1.breed+":"+dog1.color);
//		Dog dog1=new Dog();
//		dog1.bark();
//		dog1.eat();
//		dog1.wagTail();
//		
//		System.out.println("----------");
//		
//		Dog2 dog=new Dog2();
//		System.out.println(dog.name+":"+dog.age+":"+dog.breed+":"+dog.color);
//		
//		Dog2 dog2=new Dog2();
//		System.out.println(dog2.name+":"+dog2.age+":"+dog2.breed+":"+dog2.color);
//		
//		Dog2 dog3=new Dog2("Rusty",20,"Bulldock","Brown");
//		System.out.println(dog3.name+":"+dog3.age+":"+dog3.breed+":"+dog3.color);

        TaskConstructors student1=new TaskConstructors("Mike",25,'M',2017,"Java");
        student1.attendLecture();
        student1.attendLab();
        student1.submitAssignment();
        
        TaskConstructors student2=new TaskConstructors("Smith",30,'M',2016,"JavaSC");
        student2.attendLecture();
        student2.attendLab();
        student2.submitAssignment();
        
	}

}
