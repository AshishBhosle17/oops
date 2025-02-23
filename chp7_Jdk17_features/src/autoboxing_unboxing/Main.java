package autoboxing_unboxing;

public class Main {
	public static void main(String[] args) {
		
		int a=10;
		
		Integer b=a; //auto-boxing
		System.out.println(b);
		
		int c=b; //auto-unboxing
		System.out.println(c);
	}

}
