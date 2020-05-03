package demopkg;

import testpkg.Master1;

public class MainApp2 extends Master1
{
	public static void main(String[] args) 
	{
		MainApp2 m1=new MainApp2();
		System.out.println("P VALUE IS "+m1.p);
		System.out.println("J VALUE IS "+m1.j);
	}
}
