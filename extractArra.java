package Collections;

import java.util.ArrayList;
import java.util.List;

public class extractArra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to extract a portion of a array list.
		List<String> list_Strings = new ArrayList<String>(); 
		list_Strings.add("Red");
		list_Strings.add("White");
		list_Strings.add("Yellow");
		System.out.println(list_Strings);
		List<String> sub_List = list_Strings.subList(0, 2);
		System.out.println("List of first three elements: "+ sub_List);;
		
	}

}
