package composition_aggregation;

class Teacher {
	String name ="Ashish"; //composition
	int id = 9;
	String hobby = "coding"; // aggregation
	
	void showInfo() { // composition meth
		System.out.println("aggregate name: " + name);
		System.out.println("id: " + id);
	}
	
	void hobbyInfo() { //aggregation meth
		System.out.println("composite hobby: " + hobby);
	}	
}

class Faculty { //obj of topmost class
	Teacher teacher = new Teacher();
}

public class Main {
	public static void main(String[] args) {
		
		Faculty faculty = new Faculty();
		faculty.teacher.showInfo();
		faculty.teacher.hobbyInfo();
	}

}
