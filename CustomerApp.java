import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerApp {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		List<Customer> customerlist=new ArrayList<>();
		int i=1;
		String customerId;
		String customerName;
		String customerAreaCode=null;
		int numberOfUnitsConsumed;
		double bill;
		while(i==1) {
			System.out.println("Customer "+(customerlist.size()+1)+" details");
			System.out.print("Id : ");
			customerId=sc.next();
			System.out.print("Name : ");
			customerName=CustomerValidation.validation();
			System.out.print("Area Code : ");
			customerAreaCode=CustomerValidation.validatecode();
			System.out.print("Number of units consumed : ");
			numberOfUnitsConsumed=CustomerValidation.validatenumber();
			bill=CustomerUtility.calculateTotalBill(numberOfUnitsConsumed);
			customerlist.add(new Customer(customerId,customerName,customerAreaCode,numberOfUnitsConsumed,bill));
			System.out.println("Customer "+customerlist.size()+" details enrolled");
			System.out.println("If you want to add new Customer enter 1 \n else enter any other number");			
			i=CustomerValidation.validatenumber();			
		}
		CustomerUtility.display(customerlist);
		
		System.out.println("---------------------------");
		
		CustomerUtility.sort(customerlist);
		System.out.println("---------------------------");

		System.out.println("Enter the area code to be searched \n");
		sc.nextLine();
		String AreaCode=sc.nextLine();
		CustomerUtility.search(AreaCode,customerlist);
		System.out.println("---------------------------");

        System.out.println();
		CustomerUtility.serializeObject(customerlist);
		
		List<Customer> readObjects = CustomerUtility.readObjects();
		System.out.println(readObjects);
		System.out.println("---------------------------");

        System.out.println();

		CustomerUtility.groupBy(customerlist );
	

		
		
	}


}