package jan24lab;
/*
* Program: 7
Three classes are given to you,
CabCustomer
CabCustomerService
CabCustomerServiceTester
Define the following in the class CabCustomer
private : custId int, customerName String, pickupLocation String,dropLocation String, distance
int,phone String
Generate Getter/Setter for the all fields.
Implement the default constructor.
Implement/Generate the parameterized constructor in the order as defined above, i.e.,
custId,Name,Pickup,Drop,Distance,Phone
Define the following in the class CabCustomerService and write logics in the following
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
A class CabCustomerServiceTester is given with main() where you can create various objects
and test them.

*/
public class CabCustomerServiceTester {
	public static void main(String[] args) {
		
		
			CabCustomer cabCustomer = new CabCustomer(101, 15, "shivam", "hyd", "vns", "8055847113");
			CabCustomerService sc = new CabCustomerService();
			sc.addCabCustomer(cabCustomer);
			System.out.println(sc.printBill(cabCustomer));
			CabCustomer cabCustomer1 = new CabCustomer(102, 14, "vishal", "hyd", "vns", "8055847113");
			sc.addCabCustomer(cabCustomer1);
			System.out.println(sc.printBill(cabCustomer1));
		
//		cabCustomer.getDropLocation();
	}

}
