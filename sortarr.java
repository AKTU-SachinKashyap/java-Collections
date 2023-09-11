package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortarr {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to sort a given array list
		
		List<String> list_col = new ArrayList<String>();
		list_col.add("Red");
		list_col.add("yellow");
		list_col.add("blue");
		System.out.println(list_col);
		Collections.sort(list_col);
		System.out.println(list_col);
		
	}

}
