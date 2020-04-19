class CastingDemo2
{
	public static void main(String[] args)
	{
		//2 bytes
		char ch1='A';
		char ch2='J';


		//4 bytes
		int x1=ch1;
		int x2=ch2;   //widening


		System.out.println("X1 VALUE IS "+x1);
		System.out.println("X2 VALUE IS "+x2);

		//4 bytes
		int x3=75;

		//2 bytes
		char ch3=(char)x3;  //narrowing

		System.out.println("CH3 VALUE IS "+ch3);
	}
}