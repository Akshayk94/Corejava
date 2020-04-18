class Demo1
{
	void display(String name)
	{
		System.out.println("WELCOME "+name);
	}


	String display(String msg1,String msg2)
	{
		String s1=msg1+msg2;

		return s1;
	}
}

class MainApp3
{
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		d1.display("JAVA");
		String result=d1.display("CORE","JAVA");
		System.out.println(result);
	}
}