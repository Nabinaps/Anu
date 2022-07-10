package inheri;

public class MainDriver 
{
	public static void main(String[] args) {
		Account a1=new SavingAccount();
		a1.accountNo=23456789012l;
		a1.bankName="State Bank Of India";
		a1.IFSC="SBIN00012234";
		SavingAccount s1=(SavingAccount) a1;
		s1.balance=10000000000l;
		s1.name="ANJALI";
		s1.print();
		s1.displaySavings();
		System.out.println("=====================================");
		Account a2=new CurrentAccount();
		CurrentAccount c1=(CurrentAccount) a2;
		a2.accountNo=9876543210l;
		a2.bankName="HDFC";
		a2.IFSC="HDF3456";
		c1.name="ANU";
		c1.amount=20394576867l;
		c1.print();
		c1.displayCurrent();
	}
}
class Account
{
	long accountNo;
	String IFSC;
	String bankName;
	void print()
	{
		
	}
}
class SavingAccount extends Account
{
	double balance;
	String name;
	
	void print()
	{
		System.out.println("Bankname is "+bankName);
		System.out.println("A/C number is "+accountNo);
		System.out.println("IFSC code is "+IFSC);
	}
	void displaySavings()
	{
		System.out.println("Account hoder name "+name);
		System.out.println("Account balance is "+balance);
	}
}
class CurrentAccount extends Account
{
	String name;
	double amount;
	void print()
	{
		System.out.println("Bankname is "+bankName);
		System.out.println("A/C number is "+accountNo);
		System.out.println("IFSC code is "+IFSC);
	}
	void displayCurrent()
	{
		System.out.println("Account hoder name "+name);
		System.out.println("Account balance is "+amount);
	}
	
}