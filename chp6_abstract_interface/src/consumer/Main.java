package consumer;

public class Main {
	
	public static void main(String[] args) {
		 
		Emp emp = new Emp();
		Manager man = new Manager();
		
		System.out.println(emp.salary(20000));
		System.out.println(man.salary(20000, 2000));
	}

}
