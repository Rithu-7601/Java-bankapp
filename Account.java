
public class Account {

	long accno;
	String name;
	float balance;
	public Account() {
		
		
	}
	public Account(long accno, String name, float balance) {
		
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
//	deposit method defenition
	void deposit(float amt) {
		this.balance +=	amt;
		System.out.println("Rs."+amt+ "Credited | Balance: "+this.balance);
		}
	
	//withdraw method function
	void withdraw(float amt) {
		if(this.balance >= amt) {
			this.balance -= amt;
			System.out.println("Rs. "+amt+"debited | Balance: "+this.balance);
		}
		else {
			System.out.println("error: insufficient balance");
		}	
	}
	
	//to show account details
	void getDetails() {
		
		System.out.println("accno: "+this.accno+ " name "+this.name+" Balance "+this.balance);
		
	}
	
}

