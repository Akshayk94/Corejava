package singleton;

public class Gmail 
{
	static int count=0;
	static Gmail g1;
	private Gmail()
	{
		System.out.println("GMAIL ACCOUNT CREATED");
		count++;
	}
	
	void accessModules()
	{
		System.out.println("1: GOOGLE DRIVE");
		System.out.println("2: GOOGLE PHOTOS");
		System.out.println("3: GOOGLE MAPS");
	}
	
	static Gmail getAccount()
	{
		
		if(count==0)
		{
			g1=new Gmail();
		}
		return g1;
	}
}
