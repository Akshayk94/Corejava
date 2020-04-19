import java.util.Scanner;

class Seller  //SUPERCLASS
{
	//5000 Rs
	void getProductPrice(double price)
	{
		System.out.println("PRODUCT PRICE IS "+price);
	}
}

class Amazon extends Seller
{
	//10% discount 4500Rs
	void getProductPrice(double price)
	{
		double updatedprice=price-(price*0.1);
		System.out.println("UPDATED PRICE OF PRODUCT IS "+updatedprice);
	}
}

class Flipkart extends Seller
{
	//20% discount 4000Rs
	void getProductPrice(double price)
	{
		double updatedprice=price-(price*0.2);
		System.out.println("UPDATED PRICE OF PRODUCT IS "+updatedprice);
	}
}

class MainApp7
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);

		System.out.println("SELECT PLATFORM");
		System.out.println("1: AMAZON");
		System.out.println("2: FLIPKART");

		int choice=sc1.nextInt();

		if(choice==1)
		{
			Amazon a1=new Amazon();
			a1.getProductPrice(5000);
		}
		else if(choice==2)
		{
			Flipkart f1=new Flipkart();
			f1.getProductPrice(5000);
		}
	}
}