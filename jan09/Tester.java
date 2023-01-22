/*
 * Program: 1
Write a Java program to convert Array to List.
A class called ArrayToList is given to you.
Add a static method: convertToList(String[] inputArray) : This method takes an array of strings
as an argument. It should convert the given array to a list of Strings and return this list.
Note that the length of the list must be the same as that of the array.
Return null for errors a null array or an empty list for an empty array.
A Class called Tester with the main method is given to you. Use this class to test your solution

 */
package jan09;

import java.util.Arrays;
import java.util.List;

class ArrayToList {
	static List<String> convertToList(String[] inputArray){
		return Arrays.asList(inputArray);

	}
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ob [] = {"10","20","30","40","50"};
		System.out.println(ArrayToList.convertToList(ob));

	}


}
