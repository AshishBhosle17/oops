package vector;

import java.util.Iterator;
import java.util.Vector;

public class OpsImplement implements Operations {
	
	Vector<Emp> db=new Vector<Emp>();

	@Override
	public void insertData(Vector<Emp> emp) {
		// TODO Auto-generated method stub
		db.addAll(emp);
		System.out.println("data added..");
		
	}

	@Override
	public void updateData(int id, String name) {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			
			if (emp.getId() == id) {
				emp.setName(name);
				System.out.println("Data updated");
				
			}
		}
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			
			if (emp.getId() == id) {
				iterator.remove();;
				System.out.println("Data deleted..");
				
			}
		}
		
		
	}

	@Override
	public void searchData(int id) {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator=db.iterator();
		
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			
			if(emp.getId()==id) {
				System.out.println("Data found");
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
