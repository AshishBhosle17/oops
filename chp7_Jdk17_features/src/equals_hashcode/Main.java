package equals_hashcode;

import java.util.Objects;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}

}

public class Main {
	public static void main(String[] args) {

		Emp emp1 = new Emp(9, "Ashish", 20000);
		Emp emp2 = new Emp(9, "Ashish", 20000);

		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));

	}

}
