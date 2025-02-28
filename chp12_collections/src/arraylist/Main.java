package arraylist;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Emp emp1 = new Emp(1, "Tom" , 25000);
		Emp emp2 = new Emp(2, "Jerry" , 30000);
		Emp emp3 = new Emp(3, "Harry" , 35000);
		Emp emp4 = new Emp(4, "Petter" , 40000);
		
		ArrayList <Emp> emps = new ArrayList<Emp>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		
		OpsImpliment imp=new OpsImpliment();
		// CRUD Ops
		imp.insertData(emps); // Data Inserted
		imp.showData();
		
		System.out.println("--------------------");
		imp.updateData(2, "Perry"); // updating Jerry to Perry
		imp.showData();
		
		System.out.println("--------------------");
		imp.deleteData(2); // deleting Perry
		imp.showData();
		
		System.out.println("--------------------");
		imp.searchData(1); // Print id=1, Tom 
		
		
	
		
	}

}
