import java.util.Scanner;

class Shop  //SUPERCLASS
{
	private void getShopType()
	{
		System.out.println("DISPLAY SHOP TYPE");
	}
}

class ComputerShop extends Shop
{
	//OVERRIDE
	void getShopType()
	{
		System.out.println("THIS IS COMPUTER SHOP");
	}
}

class SportsShop extends Shop
{
	//OVERRIDE
	void getShopType()
	{
		System.out.println("THIS IS SPORTS SHOP");
	}
}

class MainApp9
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("SELECT SHOP TYPE");
		System.out.println("1: COMPUTER SHOP");
		System.out.println("2: SPORTS SHOP");

		int choice=sc1.nextInt();


		Shop s1=null;

		if(choice==1)
		{
			s1=new ComputerShop();  //UPCASTING
		}
		else if(choice==2)
		{
			s1=new SportsShop();   //UPCASTING
		}

		s1.getShopType();

	}
}
