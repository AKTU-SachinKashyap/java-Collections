package Collections;

import java.util.TreeSet;

public class treegerater { 
//	. Write a Java program to get the element in a tree set which is greater than or equal to the given element
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>tree_num = new TreeSet<Integer>();
		TreeSet<Integer>tree_num1 = new TreeSet<Integer>();
		
		tree_num1.add(11);  
		tree_num1.add(13);
		tree_num1.add(12);
		System.out.println(tree_num1);
		System.out.println(tree_num1.pollFirst());
		System.out.println(tree_num1);
	}

}
