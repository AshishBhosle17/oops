package finalize;

class Student {
	int id;
	String name;
	String dept;
	int percent;
	
	public Student(int id, String name, String dept, int percent) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", percent=" + percent + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Obj deleted");
	}
	
}
public class Main {
	public static void main(String[] args) {
		
		Student ob = new Student(9, "Ashish", "EXTC" , 70);
		ob =null;
		System.gc();
		
	}

}
