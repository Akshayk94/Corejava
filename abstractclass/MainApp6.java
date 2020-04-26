interface FlightService
{
	void bookTicket();

	void cancelTicket();
}

class AirAsia implements FlightService
{
	public void bookTicket()
	{
		System.out.println("BOOK TICKET FOR Rs 25000");
	}

	public void cancelTicket()
	{
		System.out.println("CANCEL TICKET");
	}
}

class Indigo implements FlightService
{
	public void bookTicket()
	{
		System.out.println("BOOK TICKET FOR Rs 20000");
	}

	public void cancelTicket()
	{
		System.out.println("CANCEL TICKET");
	}
}


class MainApp6
{
	public static void main(String[] args)
	{
		FlightService fs1=new AirAsia(); //upcasting
		fs1.bookTicket();
		fs1.cancelTicket();

		System.out.println("**********************");

		FlightService fs2=new Indigo(); //upcasting;
		fs2.bookTicket();
		fs2.cancelTicket();

	}
}