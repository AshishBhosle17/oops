package containment;

class Hobbies {
	String h1;
	String h2;
	
	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}

	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}	
	
}

class Address {
	String areaname;
	String cityname;
	public Address(String areaname, String cityname) {
		super();
		this.areaname = areaname;
		this.cityname = cityname;
	}
	@Override
	public String toString() {
		return "Address [areaname=" + areaname + ", cityname=" + cityname + "]";
	}
}

class Emp {
	int id;
	String name;
	
	Address address;
	Hobbies hobbies;
	
	public Emp(int id, String name, Address address, Hobbies hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + ", hobbies=" + hobbies + "]";
	}	
	
}
public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp(9, "Ashish" , new Address("Complex", "kandivali"), new Hobbies("coding", "coding"));
		
		System.out.println(emp.address);
		System.out.println(emp.hobbies);
		System.out.println(emp);
	}

}
