package iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Emp {
	int id;
	String name;
	double sal;
	
	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}

public class Main {
	public static void main(String[] args) {
		
		Emp emp1 = new Emp(1, "Tom",  12000);
		Emp emp2 = new Emp(2, "Jerry", 12500);
		Emp emp3 = new Emp(3, "Harry", 15000);
		
		List<Emp> list=new ArrayList<Emp>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		
		// for each loop
		System.out.println("----For each loop----");
		for(Emp emps:list) {
			System.out.println(emps);
			
		}
		
		// iterator
		System.out.println("------Iterator--------");
		Iterator<Emp> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			Emp emp4 = (Emp) iterator.next();
			System.out.println(emp4);
			
		}
		
		// enumerator - using vector
		System.out.println("------Enumerator------");
		
		Vector<Emp> vector = new Vector<Emp>();
		vector.add(emp1);
		vector.add(emp2);
		vector.add(emp3);
		
		Enumeration<Emp> enumeration = vector.elements();
		
		while (enumeration.hasMoreElements()) {
			Emp emp4 = (Emp) enumeration.nextElement();
			System.out.println(emp4);
		}
		 
		// List Iterator
		System.out.println("----ListIterator (Backward Traversal)----");
		// Move cursor to end
        ListIterator<Emp> listIterator = list.listIterator(list.size()); 
		
		while (listIterator.hasPrevious()) {
			Emp emp4 = (Emp) listIterator.previous();
			System.out.println(emp4);
			
		}
	}

}
