package abstract_;

abstract class Company {
	
	static String name = "AB";
	
	static void displayInfo() {
		System.out.println(name);
	}
	
	void showInfo() {
		System.out.println("details");
	}
	
	abstract void showsSal();
}

class Emp extends Company {

	@Override
	void showsSal() {
		// TODO Auto-generated method stub
		System.out.println("salary: 27000");
		
	}
	
	
}
public class Main {
	public static void main(String[] args) {
		
		Emp emp =  new Emp();
		
		Company.displayInfo();
		emp.showInfo();
		emp.showsSal();
	}
	
	

}
