package jan25lab;
/*
 *  A class HospitalService is given to you. Implement the following features in the class.
 Methods : public
 addHospital(): This method should receive hospital details as arguments and add to ArrayList
of type Hospital and return the generated hospital code.
Note : Hospital Code is not given as argument but it should be autogenerated while creating
object. It should start from 100.
getHospitals() : This method should return existing hospitals names and its codes in the form of
Map variable that contains Hospital Code as key (Integer) and Hospital name as Value (String).
getHospitalDetails() : This method should receive hospital code as argument and return the
matching object of hospital after searching in the ArrayList. Return null if object not found.
 */

import java.util.ArrayList;
import java.util.List;

public class HospitalService {
	int i=101;
	List<Hospital> hp = new ArrayList<Hospital>();
	@SuppressWarnings("rawtypes")
	public List addHospital(Hospital ab) {
		hp.add(ab);
		
		return hp;
		 
	 }
	

}
