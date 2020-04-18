class Vehicle  //SUPERCLASS
{
	void registerVehicle(int registerId)
	{
		System.out.println("REGISTRATION SUCCESSS FOR ID "+registerId);
	}
}

class Bike extends Vehicle //SUBCLASS
{
	void registerVehicle(String bikeModel)
	{
		System.out.println("REGISTRATIION SUCCESSFUL FOR MODEL "+bikeModel);
	}
}

class MainApp4
{
	public static void main(String[] args)
	{
		Bike b1=new Bike();
		b1.registerVehicle(10258);
		b1.registerVehicle("PULSAR");
	}
}