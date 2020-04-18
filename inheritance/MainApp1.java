class Calculator
{
	void addition(int no1,int no2)//2
	{
		System.out.println("ADDITION IS "+(no1+no2));
	}

	void addition(int n1,double n2)//2
	{
		System.out.println("ADDITION IS "+(n1+n2));
	}

	void addition(double n1,int n2)//2
	{
		System.out.println("ADDITION IS "+(n1+n2));
	}

	void addition(int no1,int no2,int no3)//3
	{
		System.out.println("ADDITION IS "+(no1+no2+no3));
	}
}

class MainApp1
{
	public static void main(String[] args)
	{
		Calculator c1=new Calculator();
		c1.addition(20,30);
		c1.addition(40,30,80);


		c1.addition(20,30.25);  //2nd method
		c1.addition(10.25,80);	//3rd method
	}
}