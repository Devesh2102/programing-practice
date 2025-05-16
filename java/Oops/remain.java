class Vehicle{
	String name;
	String color;
	
	public Vehicle(){
	}
	
	public Vehicle(String name){
		this.name = name;
	}
	
	public Vehicle(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
}

class Model{
	String name;
	int price;
	
	public Model(){
	}
	public Model(String name)
	{
		this.name = name;
	}
	public Model(int price)
	{
		this.price = price;
	}
	public Model(String name, int price){
		this.name = name;
		this.price = price;
	}
	public Model(int price, String name)
	{
		this.name = name;
		this.price = price;
	}
	Vehicle vehicle1 = new Vehicle("Volvo");
	Vehicle vehicle2 = new Vehicle("Suzuki", "White");
	Vehicle vehicle3 = new Vehicle("Volvo", "Black");
}

class Main{
	public static  void main(String [] args){
		Model model1 = new Model();
		Model model2 = new Model();
		Model model3 = new Model();
		Model model4 = new Model();
	}
}


	