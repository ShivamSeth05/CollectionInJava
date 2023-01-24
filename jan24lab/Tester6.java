package jan24lab;

import java.util.HashMap;
import java.util.Map;

/*
 * Program: 6
A class MapCharacterOccurrence is given to you. Implement the following features in the class.
Implement the method getOccurrences(String): this method should count each character
occurrences in the given string and return it as a Map.
Here store each character as key, and its occurrences count as value.
Spaces should be treated as underscore (_)
Count the Occurrence of Upper case and lower case characters separately.
If the string is empty,then return null
Ex:- input: Hello World
output:{H=1, e=1, l=3, o=2, _=1, W=1, r=1, d=1}
Hint : create Reference Of LinkedHashMap.
A class Tester is given to you with a main method. Create MapCharacterOccurrence objects here
and test its methods with various inputs.
 */
public class Tester6 {
	static Map<Character, Integer> MapCharacterOccurrence(String inputString)//ShivamSii
	{
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();//ShivamSii
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			}
			else {
				charCountMap.put(c, 1);
			}
		}
		return charCountMap;
	}
	public static void main(String[] args) {
		System.out.println(Tester6.MapCharacterOccurrence("ShivamSeth"));

	}

}
