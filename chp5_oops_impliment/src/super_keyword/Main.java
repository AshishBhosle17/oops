package super_keyword;

class Company{
	String companyName="AB";
	
	void displayInfo() {
		System.out.println("desc");
	}
}

class Emp extends Company {
	
	 void display() {
		// TODO Auto-generated method stub
		 System.out.println(super.companyName);
		 super.displayInfo();
	}
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.display();
	}

}
