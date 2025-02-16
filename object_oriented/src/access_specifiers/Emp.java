package access_specifiers;

public class Emp {
	public String name = "Ashish"; // anywhere 
	private int id = 9; // only within the class
	protected String address = "Kandivali"; //package & extended child class of another package
	double sal = 91375; // only within package 
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(address);
		System.out.println(sal);
	}
	
	public static void main(String[] args) {
		Emp ob = new Emp();
		System.out.println(ob.name);
		System.out.println(ob.address);
		System.out.println(ob.sal);
		
		ob.displayInfo();
	}
	
}


