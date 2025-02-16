package pack2;

public class A extends access_specifiers.Emp {
	
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.address); // protected
		System.out.println(a.name); // public
	}

}
