package singleton;

public class MainApp1 
{
	public static void main(String[] args) 
	{
		Gmail g1=Gmail.getAccount();
		g1.accessModules();
		
		Gmail g2=Gmail.getAccount();
		g2.accessModules();
		
		System.out.println(g1+"\t"+g2);
	}
}
