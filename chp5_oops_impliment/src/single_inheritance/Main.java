package single_inheritance;

class Dept {
	String name = "EXTC";
	int num = 99;
	
	void showDept() {
		System.out.println(name);
		System.out.println(num);
	}
}

class Student extends Dept {
	int id = 9;
	
	void showStudent() {
		System.out.println(id);
	}
}
public class Main {
	
	public static void main(String[] args) {
		Student ob = new Student();
		
		ob.showDept();
		ob.showStudent();
	}

}
