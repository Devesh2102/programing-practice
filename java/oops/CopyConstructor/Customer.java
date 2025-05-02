class Customer{
	String name;
	int age;
	String address;
	int phone;

	Customer(){
	}
	
	Customer(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	Customer(Customer customer){
		this.name = customer.name;
		this.age = customer.age;
		this.address = customer.address;
	}

	Customer(Customer customer, int phone){
		this.name = customer.name;
		this.age = customer.age;
		this.address = customer.address;
		this.phone = phone;
	}

	Customer(Customer customer1, Customer customer2){
		this.name = customer1.name;
		this.age = customer2.age;
		this.address = customer1.address;
	}


	
	public Customer getCustomer(){
		return this;
	}
}