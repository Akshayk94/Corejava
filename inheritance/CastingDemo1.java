class CastingDemo1
{
	public static void main(String[] args)
	{
		int a=10;      		//MATCHING INFO
		double b=20.50;    //MATCHING INFO

		System.out.println("A VALUE IS "+a);
		System.out.println("B VALUE IS "+b);

		System.out.println("******************************");

		int c=(int)40.20;  //narrowing
		double d=60;       //widening  
		System.out.println("C VALUE IS "+c);
		System.out.println("D VALUE IS "+d);
	}
}