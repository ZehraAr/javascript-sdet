
public class Students {

	public String name;
	public int age;
	public char gender;
	public int year;
	public String course;
	public String university;
	
	
	public Students(String name,int age,char gender,int year,String course,String university) {//there is no return type
		
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.year=year;
		this.course=course;
		this.university=university;
		
		
	}
	public void attendLecture() {
		System.out.println(name+" attended lecture");
	}
	public void submitAssignment() {
		System.out.println(name+" submitted assignment");
	}
	public void attendLab() {
		System.out.println(name+" attended lab");
	}


}
