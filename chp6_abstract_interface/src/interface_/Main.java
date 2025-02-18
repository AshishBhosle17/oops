package interface_;

interface Company {
	
	void displayWork();
	void entryTime();
}

class Emp implements Company {
	

	@Override
	public void displayWork() {
		// TODO Auto-generated method stub
		System.out.println("Ui work");
		
	}

	@Override
	public void entryTime() {
		// TODO Auto-generated method stub
		System.out.println("9 am");
		
	} 
	 
	

}
public class Main {
	public static void main(String[] args) {
		 Emp emp =new Emp();
		 
		 emp.displayWork();
		 emp.entryTime();
	}

}
