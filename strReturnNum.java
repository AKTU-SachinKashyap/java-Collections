package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class strReturnNum {

//	Write a method that takes a string and returns the number of unique characters in the string. It is expected that a string with the same character sequence may be passed several times to the method. Since the counting operation can be time consuming, the method should cache the results, so that when the method is given a string previously encountered, it will simply retrieve the stored result. Use collections and maps where appropriate
	
	private Map<String, Integer> cache = new HashMap<>();
	
	public int countUniqueCharaters(String input) {
//		chek if the result is already cached
		if(cache.containsKey(input)) {
			return cache.get(input);
		}
		
//		Calculate the unique character count
		int uniqueCount = calculateUniqueCharacters(input);
		
		cache.put(input, uniqueCount);
		
		return uniqueCount;
	}
	
	private int calculateUniqueCharacters(String input) {
		Set<Character> uniqueChars = new HashSet<>();
		for(char c: input.toCharArray()) {
			uniqueChars.add(c);
		}
		return uniqueChars.size();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strReturnNum counter = new strReturnNum();
		String string1 = "hello";
		String string2 = "world";
		String string3 = "hello";
		
		int count1 = counter.countUniqueCharaters(string1);
		System.out.println("Unique characters in " + string1 + " ':" + count1);
		
		int count2 = counter.countUniqueCharaters(string2);
		System.out.println("Unique characters in ' " + string2 + "' :" + count2);
		
		int count3 = counter.countUniqueCharaters(string3);
		System.out.println("Unique characters in ' "+ string3 + "' :"+count3);
		}

}
