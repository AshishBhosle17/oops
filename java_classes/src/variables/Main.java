package variables;

class Emp {
	static String name ="Ashish";
	double sal;
	// constructor for global- obj creation and passing value to obj
	public Emp(double sal) {
		super();
		this.sal = sal;
	}
    
	void displayInfo(int id) {
		
		System.out.println(id);
	}
	
	
}
public class Main {
      public static void main(String[] args) {
    	  
    	  Emp emp = new Emp(1000);
    	  emp.displayInfo(9);
    	  
	
  }
}
