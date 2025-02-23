package try_catch;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hi there");
		
		try {
			int n = 10/0;
			System.out.println(n);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
