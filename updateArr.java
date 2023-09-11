package Collections;

import java.util.ArrayList;
import java.util.List;

public class updateArr {
//	Write a Java program to update specific array element by given elemen
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>  list_col= new ArrayList<String>();
		list_col.add("red");
		list_col.add("Geen");
		list_col.add("yellow");
		System.out.println(list_col);
		list_col.set(2, "Pink");
		list_col.set(1, "Blue");
		System.out.println(list_col);
	}

}
