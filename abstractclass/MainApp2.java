abstract class Demo1
{
	abstract void test();
}

class Sample1 extends Demo1
{
	void test()
	{
		System.out.println("TEST METHOD");
	}
	void display()
	{
		System.out.println("DISPLAY METHOD");
	}
}

class MainApp2
{
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1();
		s1.test();
		s1.display();
	}
}