package multilevel_inheritance;

class Company {
	String name = "TCS";
	int id = 200;
	
	void showComp() {
		System.out.println(name);
		System.out.println(id);
	}
}
class Dept extends Company {
	String name = "IT";
	
	void showDept() {
		System.out.println(name);
	}
}
class Emp extends Dept{
	String name = "Ashish";
	
	void showEmp() {
		System.out.println(name);
	}	
	
}
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		
		emp.showComp();
		emp.showDept();
		emp.showEmp();
	}

}
