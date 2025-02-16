package overloading_riding;
// overloading
class Account {
	// meth with same name diff parameters within same class
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

class Manager extends Account{
	 @Override
	double getSal(double sal, float tax, int bonus) {
		// TODO Auto-generated method stub
		return super.getSal(sal, tax, bonus);
	}
	
}

class Emp extends Account{
	@Override
	double getSal(double sal) {
		// TODO Auto-generated method stub
		return super.getSal(sal);
	}
}

public class Main {
	public static void main(String[] args) {
		// obj of topmost class
		Account ob = new Account();
		System.out.println(ob.getSal(10000, 1000, 2000 ));
		
		Manager m = new Manager();
		System.out.println(m.getSal(100, 10, 20));
		
		Emp emp = new Emp();
		System.out.println(emp.getSal(200));
		
  }

}
