package user_defined;

class Emp {
	int id;
	String name;
	double sal;
	String add;
	
	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	void meth() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
	}
	
}
public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp(9, "Ashish", 20000);
		emp.meth();
		System.out.println(emp.add);
	}

}
