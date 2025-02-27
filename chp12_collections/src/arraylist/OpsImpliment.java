package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class OpsImpliment implements Operations  {
	
	ArrayList<Emp> db = new ArrayList<Emp>();

	@Override
	public void insertData(ArrayList <Emp> emp) {
		// TODO Auto-generated method stub
		db.addAll(emp);
		System.out.println("data inserted");
		
	}

	@Override
	public void updateData(int id, String name) {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			
			if (emp.getId()== id) {
				emp.setName(name);
				System.out.println("data updated...");
			}
			
		}
		
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			
			if (emp.getId()==id) {
				iterator.remove();
				System.out.println("data deleted !!");
				
			}
		}
		
	}

	@Override
	public void searchData(int id) {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator= db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getId() == id) {
				System.out.println("data found");
				System.out.println(emp);
			}
			
		}
		
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			
			System.out.println(emp);
		}
		
	}
	
}
