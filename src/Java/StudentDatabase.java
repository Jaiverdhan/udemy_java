package Java;

public class StudentDatabase {

	public static void main(String[] args) {
		Student s1 = new Student("15446445", "Jaiverdhan");
		s1.setemail();
		s1.setUserID();
		s1.setphone("65494589");
		System.out.println(s1.getphone());
		s1.pay(100);
	}
}	
class Student{
	private int iD = 100;
	String SSN;
	String name;
	String email; 
	String userID;
	private String phone;
	private String city;
	private String State;
	int balance = 1000; 
	
	public Student(String SSN , String name){
		this.SSN = SSN;
		this.name = name;
		iD++;
		System.out.println("Student "+name+ " Successfully registered");
		
	}
	public void setemail() {
		email = name+ "@gmail.com";
		System.out.println(email);
	}
	public void setUserID() {
		int random = (int) (Math.random() *1000);
		userID = iD +"" + random + SSN.substring(0,4);
		System.out.println("Your userID is " +userID );
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getphone() {
		return phone;
	}
	public void pay(int amount) {
		balance = balance - amount;
		cheakBalance();
	}
	public void cheakBalance() {
		System.out.println("Balance "+balance);
	}
}

