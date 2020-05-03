package beans;

public class MainApp1 
{
	public static void main(String[] args) 
	{
		BankAccount b1=new BankAccount();
		b1.setAccountNumber("SB15566");
		b1.setCustomerName("SACHIN");
		b1.setAccountBalance(25000.25);
		
		
		String accno=b1.getAccountNumber();
		String name=b1.getCustomerName();
		double accbalance=b1.getAccountBalance();
		
		System.out.println("ACCOUNT NO IS "+accno);
		System.out.println("CUSTOMER NAME IS "+name);
		System.out.println("ACCOUNT BALANCE IS "+accbalance);
	}
}
