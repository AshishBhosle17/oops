package basics;

class Emp {
    
    String name;
    int id;
    double salary;
    String address;

    // Constructor
    public Emp(String name, int id, double salary, String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }

    // Method to display basic information
    public void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }

    // Overriding toString() to display all details
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + ", Address=" + address + "]";
    }

    // Main method to test the class
public static void main(String[] args) {
        Emp emp1 = new Emp("Ashish", 102, 50000, "101 complex");
        emp1.displayInfo();
        System.out.println(emp1.toString());
    }
}
