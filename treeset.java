package Collections;

import java.util.TreeSet;

public class treeset {
//	Write a Java program to get the element in a tree set which is greater than or equal to the given element
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>tree_num = new TreeSet<Integer>();
		TreeSet<Integer>Treeheadset =new TreeSet<Integer>();
		
		tree_num.add(12);
		tree_num.add(11);
		tree_num.add(34);
		tree_num.add(15);
		System.out.println(tree_num.ceiling(30));
		System.out.println(tree_num.ceiling(24));
	}

}
