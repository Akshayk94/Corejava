class Parent
{
	void parentProperty()
	{
		System.out.println("PARENT PROPERTY");
	}
}

class Child extends Parent
{
	void childProperty()
	{
		System.out.println("CHILD PROPERTY");
	}
}
class MainApp12
{
	public static void main(String[] args)
	{
		Child c1=new Child();  //matching info
		c1.parentProperty();
		c1.childProperty();

		System.out.println("**********************************");

		Parent p1=new Child();//upcasting
		p1.parentProperty();

		System.out.println("***********************************");

		Child ch1=(Child)p1; //downcasting
		ch1.parentProperty();
		ch1.childProperty();
	}
}