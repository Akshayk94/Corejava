abstract class Company
{
	abstract void getCompanyType();
}

class ProductBased extends Company
{
	void getCompanyType()
	{
		System.out.println("PRODUCT BASED COMPANY");
	}
}

class ServiceBased extends Company
{
	void getCompanyType()
	{
		System.out.println("SERVICE BASED COMPANY");
	}
}
class MainApp3
{
	public static void main(String[] args)
	{
		ProductBased p1=new ProductBased();
		p1.getCompanyType();

		ServiceBased s1=new ServiceBased();
		s1.getCompanyType();
	}
}