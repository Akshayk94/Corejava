class Demo1
{
	void test()
	{
		System.out.println("TEST METHOD");
	}	
}

class Sample1 extends Demo1
{
	void display()
	{
		System.out.println("DISPLAY METHOD");
	}
}

class MainApp10
{
	public static void main(String[] args)
	{
		
		Demo1 d2=new Sample1();//upcasting
		d2.test();

		Demo1 d1=new Demo1();

		if(d1 instanceof Sample1)
		{
			Sample1 s1=(Sample1)d1;
		}
		else
		{
			System.out.println("PROPERTIES ARE NOT AVAILABLE");
		}
	}
}
