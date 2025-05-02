class Main{
	public static void main(String [] args){
		Customer customer1 = new Customer("Test1", 23, "test_address1");	
		Customer customer2 = new Customer("Test2", 26, "test_address2");
		Customer customer3 = new Customer("Test3", 24, "test_address3");
		
		Customer customer4 = new Customer(customer1);
		Customer customer5 = new Customer(customer3, 1234567890);
		Customer customer6 = new Customer(customer3, customer5);

		Customer customer1_details = customer1.getCustomer();
		Customer customer2_details = customer2.getCustomer();
		Customer customer3_details = customer3.getCustomer();
		Customer customer4_details = customer4.getCustomer();
		Customer customer5_details = customer5.getCustomer();
		Customer customer6_details = customer6.getCustomer();

		System.out.println("Customer1 name is: " + customer1_details.name);
		System.out.println("Customer2 name is: " + customer2_details.name);
		System.out.println("Customer3 name is: " + customer3_details.name);
		System.out.println("Customer4 name is: " + customer4_details.name);
		System.out.println("Customer5 name is: " + customer5_details.name);
		System.out.println("Customer6 name is: " + customer6_details.name);

	}	
}