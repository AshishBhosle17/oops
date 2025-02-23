package obj_cloning;

class Emp implements Cloneable {
	int id;
	String name;
	double sal;
	String address;
	
	public Emp(int id, String name, double sal, String address) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Emp emp = new Emp(9, "Ashish", 20000, "Kandivali");
		
		Emp empClone=(Emp) emp.clone();
		System.out.println(empClone);
	}

}
