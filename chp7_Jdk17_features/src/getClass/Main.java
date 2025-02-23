package getClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
	
}
public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp(9, "ashish", 125000);
		Method method[] = emp.getClass().getMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
		}
		
		Constructor constructor[]=emp.getClass().getConstructors();
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
			
		}
		
		Field field[] = emp.getClass().getFields();
		for (int i = 0; i < field.length; i++) {
			System.out.println(field[i]);
		}
	}

}
