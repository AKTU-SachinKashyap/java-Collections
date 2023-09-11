package Collections;

import java.util.TreeSet;

public class retrieveRemo {
//	Write a Java program to retrieve and remove the first element of a tree set
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> Tree_num= new TreeSet<Integer>();
		TreeSet<Integer> Treeheadset = new TreeSet<Integer>();
		Tree_num.add(5);
		Tree_num.add(7);
		Tree_num.add(8);
		Tree_num.add(4);
		System.out.println("original tree_num"+ Tree_num);
		System.out.println("Removes the first elements (lowest) " + Tree_num.pollFirst());
		System.out.println("Tree set after removing first elements:" + Tree_num);
	}

}
