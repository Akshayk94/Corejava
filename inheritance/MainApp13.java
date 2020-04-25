class Employee
{
	void getEmployeeType()
	{
		System.out.println("DISPLAY EMPLOYEE TYPE");
	}
}

class PermenantEmployee extends Employee
{
	void getEmployeeType()
	{
		System.out.println("HELLO... I AM PERMENANT EMPLOYEE");
	}
}

class ContractEmployee extends Employee
{
	void getEmployeeType()
	{
		System.out.println("HELLO... I AM CONTRACT BASED EMPLOYEE");
	}
}

class EmployeeSimulator
{
	void showType(Employee e)
	{
		e.getEmployeeType();
	}
}

class MainApp13
{
	public static void main(String[] args)
	{
		EmployeeSimulator es1=new EmployeeSimulator();
		es1.showType(new PermenantEmployee());
		es1.showType(new ContractEmployee());
	}
}