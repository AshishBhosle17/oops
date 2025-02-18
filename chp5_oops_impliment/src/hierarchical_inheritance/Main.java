package hierarchical_inheritance;

class Company {
	String name = "TCS";
	
	void showComp() {
		System.out.println(name);
	}
}

class Emp extends Company {
	int id = 9;
	String name = "Ashish";
	
	void showEmp() {
		System.out.println(id);
		System.out.println(name);
	}
}

class Accountant extends Company {
	double sal = 20000;
	
	void showAcc () {
		System.out.println(sal);
	}
}
public class Main {
	public static void main(String[] args) {
		
		Accountant ob = new Accountant();
		ob.showComp();
		ob.showAcc();
		
		Emp emp = new Emp();
	    emp.showComp();
	    emp.showEmp();
		
	}

}
