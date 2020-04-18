class Rbi //SUPERCLASS
{
	void displayrateOfIntrest()
	{
		System.out.println("INTREST RATE IS 5.50");
	}
}

class Hdfc extends Rbi //SUBCLASS
{
	//METHOD OVERRIDING
	void displayrateOfIntrest()
	{
		System.out.println("INTREST RATE IS 7.75");
	}
}

class MainApp5
{
	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD");

		Hdfc h1=new Hdfc();
		h1.displayrateOfIntrest();
	}
}