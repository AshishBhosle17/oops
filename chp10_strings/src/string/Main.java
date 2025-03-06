package string;

public class Main {
	public static void main(String[] args) {
		
		String s1 = "Hello Ashish";
		String s2 = " How are u?";
		
		System.out.println(s1.length()); // 12
		System.out.println(s1.concat(s2)); // Hello Ashish How are u?
		System.out.println(s1.charAt(6)); // A
		System.out.println(s1.compareTo(s2)); //40
		System.out.println(s1.contentEquals(s2)); //false
		System.out.println(s1.replace("L", "m"));
		System.out.println(s2.trim());
	}

}
