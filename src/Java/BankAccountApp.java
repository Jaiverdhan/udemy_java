package Java;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("840052475552", 1000);
		acc1.setName("Jaiverdhan");
		System.out.println(acc1.getName());
		acc1.deposit(200);
		acc1.withdraw(100);
		System.out.println(acc1.toString());
	}
}
class BankAccount{
	private int iD = 1000;
	private String accountnumber;
	private String aadhar;
	private String name;
	private int balance;
	
	public BankAccount(String aadhar, int balance) {
		this.aadhar = aadhar;
		this.balance = balance;
		iD++;
		setaccountnumber();
		
	}
	private void setaccountnumber() {
		int random = (int) (Math.random()*100);
		accountnumber = iD + "" + random + aadhar.substring(0,2);
		System.out.println("Your account number is "+accountnumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Deposit : "+amount);
		showBalance();
	}
	public void withdraw(int amount) {
		balance = balance - amount;
		System.out.println("Withdraw : "+amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance : "+balance );
	}
	public String toString() {
		return "[Name : " +name+ "]\n[Account number : "+accountnumber+"]\n[Balance : "+balance+"]";
	}
}

