import java.io.Serializable;

class Customer implements Serializable {
	private String customerId;
	private String customerName;
	private String customerAreaCode;
	private int numberOfUnitsConsumed;
	private double totalBill;

	

	Customer(String customerId, String customerName,  String customerAreaCode ,int numberOfUnitsConsumed , double bill ) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAreaCode = customerAreaCode;
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
		this.totalBill =bill;
	}

	public int getNumberOfUnitsConsumed() {
		return numberOfUnitsConsumed;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getCustomerAreaCode() {
		return customerAreaCode;
	}


	public double getTotalBill()  {
		return totalBill;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + customerId + ", CustomerName=" + customerName + ", CustomerAreaCode="
				+ customerAreaCode + ", NumberOfUnitsConsumed=" + numberOfUnitsConsumed + ", CustomerBill="
				+ totalBill + "]";
	}
}