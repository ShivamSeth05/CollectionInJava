package jan09;

import java.util.ArrayList;
import java.util.List;

class ListToArray{
	 static Object[] convertToArray(List<Integer> ob) {
		 System.out.println(ob.toArray().toString());
		 return ob.toArray();
	 }
}
public class Tester2 {

	public static void main(String[] args) {
		List<Integer>lo = new ArrayList<Integer>();
		lo.add(5);
		lo.add(54);
		lo.add(55);
		lo.add(54);
		lo.add(55);
		System.out.println(ListToArray.convertToArray(lo));
	}

}
