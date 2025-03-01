package vector;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp(9, "Ashish", 25000);
		
		Emp emp1 = new Emp(1, "Jerry", 30000);
		Emp emp2 = new Emp(2, "Harry", 30000);
		Emp emp3 = new Emp(3, "Merry", 30000);
		
		Vector<Emp> emps = new Vector<Emp>();
		emps.add(emp);
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		
		OpsImplement imp = new OpsImplement();
		// CRUD OPS
		imp.insertData(emps);
		imp.showData();
		System.out.println("-----------------------");
		
		imp.updateData(9, "Tom");
		imp.showData();
		System.out.println("-----------------------");
		
		imp.deleteData(9);
		imp.showData();
		System.out.println("-----------------------");
		
		imp.searchData(2);
		
		
	}

}
