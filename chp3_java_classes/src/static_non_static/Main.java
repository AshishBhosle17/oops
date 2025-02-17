package static_non_static;

class Static {
	
	static String dept = "EXTC";
	String name ="Ashish";
	
	static void staticMeth() {
		System.out.println("Static meth: " + dept);
	}
	
	void nonStaicMeth() {
		System.out.println("non static: " + name);
	}
	
}
public class Main {
	
	public static void main(String[] args) {
		System.out.println(Static.dept); // static var called
		Static.staticMeth(); // Static meth called
		
		Static ob = new Static();
		System.out.println(ob.name); // NS var call
		ob.nonStaicMeth(); //NS meth called
		
	}
}
