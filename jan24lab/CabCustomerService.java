package jan24lab;
/*
 * Define the following in the class CabCustomerService and write logics in the following
methods:
private : Generic ArrayList to represent list of CabCustomers.
public : addCabCustomer() : Add the customer object parameter to the ArrayList
isFirstCustomer(): Check whether the customer object parameter is already existing in arrayList.
Note : If phone number of a customer matches with any of the phone numbers of the array list,
then consider it as a existing customer, otherwise consider the customer as new customer.
calculateBill() should calculate and return the customer bill based on following rules
1) if the customer is new return 0;
2) if the customer's travel distance is below or equal to 4 kms then return 80 (Rs).
3) if the customer travel distance is above 4 kms calculate bill 80 + 6 per each km.
Ex: Any distance for new customer return 0;
distance 4 return 80
 distance 6 return 80 + 6 * 6;
printBill() which should return the bill of the customer object parameter in the following format:
output : JOHN Please pay your bill of Rs.0.0
SMITH Please pay your bill of Rs.180.0
Note :
Assume one customer books only one cab at a time.
No charge for customer booking the cab for the first time.
Customer's phone number is key to test a new customer or old customer.
Distance should be treated as kilometers
 */
import java.util.*;
public class CabCustomerService {
 private ArrayList<CabCustomer> cab = new ArrayList<CabCustomer>();
	ArrayList<String> phn = new ArrayList<String>();
	public void addCabCustomer(CabCustomer cab1) {
		cab.add(cab1);
	}
	@SuppressWarnings("unlikely-arg-type")
	boolean isFirstCustomer(CabCustomer cab1){
		int cnt=0;
		for (CabCustomer cabCustomer : cab) {
			if(cabCustomer.getPhone().equals(cab1.getPhone())) {
				cnt++;
			}
		}
		return cnt==1;
	}
	double calculateBill(CabCustomer cab1) {
		double amt=0.0;
//		System.out.println(isFirstCustomer(cab1));
		if (isFirstCustomer(cab1)) {
			return 0.0;
		}if (cab1.getDistance()<=4) {
			amt= 80;
		}
		else {
			amt= 80+((cab1.getDistance()-4)*6);
		}
		return amt;
	}
	String printBill(CabCustomer cab1) {
		
		return  ""+cab1.getCustomerName() +" Please pay your bill of Rs."+calculateBill(cab1)+" ";
		
	}

}
