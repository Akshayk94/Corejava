package products;

import java.util.Scanner;

public class ProductSimulator //UTILIZATION LAYER
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("SELECT PRODUCT CATEGORY");
		System.out.println("1: ELECTRONICS\t\t 2: COMPUTER");
		int choice=sc1.nextInt();
		
		System.out.println("Enter the product name");
		String name=sc1.next();
		
		System.out.println("Enter the product price");
		double price=sc1.nextDouble();
		
		System.out.println("Enter the product qty");
		int qty=sc1.nextInt();
		
		Product p1=null;
		if(choice==1)
		{
			p1=new ElectronicsProducts(name,price,qty);
		}
		else if(choice==2)
		{
			p1=new ComputerProducts(name,price,qty);
		}
		
		p1.getProductBill();
	}
}
