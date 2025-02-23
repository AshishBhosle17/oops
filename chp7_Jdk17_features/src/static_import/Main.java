package static_import;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		
		out.println("HI there");
		out.println("Ashish here.");
		
		// System.out.println("min " + Math.min(60,102));
		// instead we can write, 
		out.println("min: " + min(60,102));
	}

}
