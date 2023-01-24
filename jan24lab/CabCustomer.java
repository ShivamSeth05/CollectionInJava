package jan24lab;
/*
 * Define the following in the class CabCustomer
private : custId int, customerName String, pickupLocation String,dropLocation String, distance
int,phone String
Generate Getter/Setter for the all fields.
Implement the default constructor.
Implement/Generate the parameterized constructor in the order as defined above, i.e.,
custId,Name,Pickup,Drop,Distance,Phone
 */
public class CabCustomer {
	private int custId,distance;
	private String customerName,pickupLocation,dropLocation,phone;

	public CabCustomer(int custId, int distance, String customerName, String pickupLocation, String dropLocation,
			String phone) {
		super();
		this.custId = custId;
		this.distance = distance;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.phone = phone;
	}

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
