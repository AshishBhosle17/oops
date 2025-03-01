package linked_list;

import java.util.LinkedList;

public interface Operations {
	
    void insertData(LinkedList<Emp> emps);
	
    void updateData(int id,String name);
    
    void deleteData(int id);
    
    void searchData(int id);
    
    void showData();

}
