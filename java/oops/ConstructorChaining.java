class Emp {
	int id;
	String name;
	int age;
	double salary;
	
	Emp(){
		System.out.println("Object is created...");
	}
	Emp(int id){
		this();		// constructor called
		this.id = id;
	}
	Emp(int id, String name){
		this(id);
		this.name = name;
	}
	Emp(int id, String name, int age){
		this(id, name);
		this.age = age;
	}
	Emp(int id, String name, int age, double salary){
		this(id, name, age);
		this.salary = salary;
	}
	public void getEmp(){
		System.out.println("Employee id is: " + this.id);
		System.out.println("Employee name is: " + this.name);
		System.out.println("Employee age is: " + this.age);
		System.out.println("Employee salary is: " + this.salary);
	}

}

class ConstructorChaining {
	public static void main(String[] args) {
		Emp emp1 = new Emp(1, "Test1");
		Emp emp2 = new Emp(2, "Test2", 22);
		Emp emp3 = new Emp(3, "Test3", 24, 25000);

		System.out.println("=========================Employee 1==================================");
		emp1.getEmp();
		System.out.println("=========================Employee 2==================================");
		emp2.getEmp();
		System.out.println("=========================Employee 3==================================");
		emp3.getEmp();
	}
}
