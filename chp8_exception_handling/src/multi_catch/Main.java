package multi_catch;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hi there");
		
		try {
			int [] arr = {1,2,3};
			System.out.println(arr[5]); //ArrIndexOutofBounds Exception
			
			int n = 10 / 0;
			System.out.println(n); // Arithmetic Exception
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("execute");
		}
	}

}
