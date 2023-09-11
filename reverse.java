package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_String= new ArrayList<String>();
		list_String.add("red");
		list_String.add("yellow");
		list_String.add("Pink");
		System.out.println(list_String);
		Collections.reverse(list_String);
		System.out.println(list_String);
	}

}
