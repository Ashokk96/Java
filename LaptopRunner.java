class LaptopRunner{
	public static void main(String[] args)
	{
	System.out.println("main:ongoing");
    Laptop.displayDetails();
	Laptop.size="medium";
	Laptop.price=25.006d;
	Laptop.weight=12;
    Laptop.colour="black";
		
	String[] company={"dell","hp","lenovo"}	;
	Laptop.brand=company;
	Laptop.displayDetails();
	System.out.println("main:ended");
		
	}
	
}