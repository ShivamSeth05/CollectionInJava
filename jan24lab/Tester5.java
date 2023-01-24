package jan24lab;

import java.util.LinkedHashMap;
import java.util.Map;

//Program: 5
//Write a java program to convert a given array of Strings into a Map.
//A ArrayToMap class is given to you. Add the following method in the class:
//Implement the static method convertToMap(String[] names)
//This method must read the given array of names and insert them one by one into a
//Map<Integer,String> and returns this map as the output.
//Each name in the array is the value in the map. Insert Integer numbers as the key.
//The key in the map must start from 1 and be continuous without missing numbers in between.
//If the array is null, return null. If the array is empty, return an empty map.
//If the array contains null elements in between, ignore that element and add the non-null strings
//into the map. Do not insert a null value in the map.

public class Tester5 {
	class ArrayToMap{
		static  Map<Integer, String> convertToMap(String[] names){
			Map<Integer, String>ob=new LinkedHashMap<Integer, String>();
			int i=1;
			for (String string : names) {
				if(string==null)continue;
				ob.put(i, string);
				i++;
			}
			return ob;	
		}

	}

	public static void main(String[] args) {
		String[]ob = {"Shivam","vishal",null,"Raman",null};
		System.out.println(ArrayToMap.convertToMap(ob));

	}

}
