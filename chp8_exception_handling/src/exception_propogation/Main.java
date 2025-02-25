package exception_propogation;

import java.io.IOException;

class A{
	
	void meth1() throws IOException {
		IOException io = new IOException();
		throw io;
	}
}

class B{
	
	void meth2() throws IOException {
		A ob = new A();
		ob.meth1();
	}
}

public class Main {
	public static void main(String[] args) {
		B ob2 = new B();
		
		try {
			ob2.meth2();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
