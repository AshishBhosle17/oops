package para_constructor;

class Hobbies {
	String h1;
	String h2;
	// parameterised constructor 
	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
	
	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}
	
	
}
public class Main {
	public static void main(String[] args) {
		
		Hobbies ob = new Hobbies("coding", "riding");
		System.out.println(ob);
	}

}
