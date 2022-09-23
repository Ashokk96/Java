class Laptop{
static String size;
static double price;
static int weight;
static String colour;
static String[] brand;

static void displayDetails(){

System.out.println(size);
System.out.println(price);
System.out.println(weight);
System.out.println(colour);	
if (brand!=null)	{
	for(int position=0;position<brand.length;position++)
	{
	String ref=brand[position];
    System.out.println(ref+" "+position);	
		
		}
	}
	else{
	System.out.println("array is null");	
		
	}
	
}
}







