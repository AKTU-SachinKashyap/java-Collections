package Collections;

import java.util.LinkedList;

public class linkedlist {
//	Write a Java program to insert some elements at the specified position into a linked list

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fru_list = new LinkedList<String>();
		fru_list.add("Mulberry");
		fru_list.add("Guava");
		fru_list.add("papaya");
		System.out.println(fru_list);
		LinkedList <String> new_fru_list =new LinkedList<String>();
		new_fru_list.add("water");
		new_fru_list.add("Pineapple");
		fru_list.addAll(2, new_fru_list);
		System.out.println(fru_list);
	}

}
