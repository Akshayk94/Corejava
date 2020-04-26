interface Master1
{
	void test();
}

class Demo1 implements Master1
{
	public void test()
	{
		System.out.println("TEST METHOD");
	}
}


class MainApp5
{
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		d1.test();
	}
}