package pojo;

class Pojo {
	private String name;
	private double sal;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
public class Main {
	
	public static void main(String[] args) {
		
		Pojo ob = new Pojo();
		// void return type will not be in print statement.
		ob.setId(9);
		ob.setName("Ashish");
		ob.setSal(10000);
		
		System.out.println(ob.getName());
		System.out.println(ob.getId());
		System.out.println(ob.getSal());
	}
	

}
