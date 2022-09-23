class ToothpasteRunner{
	public static void main(String[] paste)
	
	{
	Toothpaste.setName("max white");
	Toothpaste.setColor("red");
	Toothpaste.setPrice(650.50d);
	Toothpaste.setWeight(150);
	Toothpaste.setMftDate("25/09/2022");
	Toothpaste.setExpDate("25/09/2023");
	Toothpaste.setAvailable(true);
	Toothpaste.setFlavour("mint");
	Toothpaste.setTransport("lorry");
	Toothpaste.setSize('m');
	Toothpaste.setPackSize("big");
	Toothpaste.setPackColor("blue");
	Toothpaste.setCompanyName("colgate");
	Toothpaste.setContactNumber(9964238903l);
	Toothpaste.setSmellIsGood(true);
	
	
	String ref=Toothpaste.getName();
	System.out.println(ref);
	
	
	String ref1=Toothpaste.getcolor();
	System.out.println(ref1);
	
	
	double ref2=Toothpaste.getprice();
	System.out.println(ref2);
	
	
	int ref3=Toothpaste.getWeight();
	System.out.println(ref3);
	
	
	String ref4=Toothpaste.getmftdate();
	System.out.println(ref4);
	
	
	String ref5=Toothpaste.getexpdate();
	System.out.println(ref5);
	
	
	boolean ref6=Toothpaste.isavailable();
	System.out.println(ref6);
	
	
	String ref7=Toothpaste.getflavour();
	System.out.println(ref7);
	
	
	String ref8=Toothpaste.gettransport();
	System.out.println(ref8);
	
	
	char ref9=Toothpaste.getsize();
	System.out.println(ref9);
	
	
	String ref10=Toothpaste.getpacksize();
	System.out.println(ref10);
	
	
	String ref11=Toothpaste.getpackcolor();
	System.out.println(ref11);
	
	
	String ref12=Toothpaste.getcompanyname();
	System.out.println(ref12);
	
	
	long ref13=Toothpaste.getcontactnumber();
	System.out.println(ref13);
	
	
	boolean ref14=Toothpaste.isgood();
	System.out.println(ref14);
	
	

	
	

	
	
	
	}	
}