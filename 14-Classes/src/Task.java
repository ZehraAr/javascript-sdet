public class Task {

		public static void main(String[] args) {
			Students student1 = new Students("Mike", 17, 'M', 2016, "Java", "Cybertek University");
			student1.attendLecture();
			student1.attendLab();
			student1.submitAssignment();
			
			Students student2 = new Students("Karl", 18, 'M', 2016, "JavaScript", "Cybertek University");
			student2.attendLecture();
			student2.attendLab();
			student2.submitAssignment();
			
			Students student3 = new Students("John", 19, 'M', 2016, "TypeScript", "Cybertek University");
			student3.attendLecture();
			student3.attendLab();
			student3.submitAssignment();
		}

	}
		  


