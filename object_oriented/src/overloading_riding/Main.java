package overloading_riding;

class Account {
	
	double getSal(double sal, int bonus) {
		return sal + bonus;
		
	}
	
	double getSal(double sal) {
		return sal;
	}
	
	double getSal(double sal, float tax, int bonus) {
		return sal - tax + bonus;
	}
}
public class Main {
	public static void main(String[] args) {
		Account ob = new Account();
		System.out.println(ob.getSal(10000, 1000, 2000 ));
	}

}
