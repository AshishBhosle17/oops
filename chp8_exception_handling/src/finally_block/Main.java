package finally_block;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hi there");
		
		try {
			int n= 10/0;
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Err");
		}
		finally {
			System.out.println("Finally");
			System.out.println("The end");
		}
	}

}
