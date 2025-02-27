package arraylist;

import java.util.ArrayList;

interface Operations  {
	
	void insertData(ArrayList<Emp> e);
	void updateData(int id, String name);
	void deleteData(int id);
	void searchData(int id);
	void showData();

}
