class Demo1  //superclass
{
	void test()
	{
		System.out.println("TEST METHOD");
	}
}

class Sample1 extends Demo1  //subclass
{
	void display()
	{
		System.out.println("DISPLAY METHOD");
	}
}

class MainApp8
{
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1(); //MATCHING INFO
		s1.test();   //SUPERCLASS
		s1.display();  //SUBCLASS

		//UPCASTING
		Demo1 d1=new Sample1(); //NON-MATCHING INFO
		d1.test();
	}
}