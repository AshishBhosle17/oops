package final_keyword;

final class Student {
	final int id = 9;
	final String name = "Ashish";
	
	final void showInfo() {
		System.out.println(id);
		System.out.println(name);
	}
}

public class Main {
	public static void main(String[] args) {
		Student ob = new Student();
		
		System.out.println(ob.id);
		System.out.println(ob.name);
		ob.showInfo();
	}

}
