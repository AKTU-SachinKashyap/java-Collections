package Collections;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h_Set = new HashSet<String>();
		h_Set.add("red");
		h_Set.add("yellow");
		h_Set.add("Black");
		System.out.println(h_Set);
		h_Set.clear();
		System.out.println(h_Set);
	}

}
