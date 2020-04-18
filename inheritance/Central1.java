class Central1
{
	//method overloading

	public static void main(String[] args) //standard main method
	{
		System.out.println("FIRST MAIN METHOD");

		//call external main methods
		main(20);
		main(30.25);
	}

	public static void main(int args) //EXTERNAL METHOD
	{
		System.out.println("SECOND MAIN METHOD");
	}

	public static void main(double args) //EXTERNAL METHOD
	{
		System.out.println("THIRD MAIN METHOD");
	}
}