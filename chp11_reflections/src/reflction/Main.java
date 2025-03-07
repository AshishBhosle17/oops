package reflction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Emp {
    int id;
    String name;
    double sal;

    public Emp(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Emp emp = new Emp(9, "Ashish", 25000);

        System.out.println("Methods:");
        
        Method methods[] = emp.getClass().getMethods();
        
        for (Method method : methods) {
            System.out.println(method.getName()); // Print method names only
        }

        System.out.println("\nConstructors:");
        Constructor<?> constructors[] = emp.getClass().getConstructors();
        
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("\nFields:");
        Field fields[] = emp.getClass().getDeclaredFields(); // Use getDeclaredFields()
        
        for (Field field : fields) {
            System.out.println(field.getName() + " of type " + field.getType());
            
        }
    }
}