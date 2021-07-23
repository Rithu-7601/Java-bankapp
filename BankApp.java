import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Account acc = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.create account");
			System.out.println("2. Deposit");
			System.out.println("3. withdraw");
			System.out.println("4. Balance");
			System.out.println("5. exit");
			
			System.out.println("enter an option");
			int opt = sc.nextInt();
			System.out.println("------------------------------");
			
			switch(opt) {
			case 1:
				if( acc == null) {
					System.out.println("enter accno: ");
					long accno = sc.nextLong();
					
					System.out.println("enter name: ");
					String name = sc.next();
					
					System.out.println("enter initial deposit ");
					float amount = sc.nextFloat();		
					
					acc = new Account(accno, name, amount);
					System.out.println("account opened");
					
					
					}
				
				else {
					System.out.println("acc is already created");
				}
			break;
			
			case 2:
				if(acc != null) {
					System.out.println("Enter amount to deposit: ");
					float amt = sc.nextFloat();
					acc.deposit(amt);
				}
				else {
					System.out.println("create account first");
				}
				
				break;
			case 3:
				if(acc != null) {
					System.out.println("Enter amount to withdraw: ");
					float amt = sc.nextFloat();
					acc.withdraw(amt);
				}
				else {
					System.out.println("create account first");
				}
				
				break;
			case 4:
				if(acc != null) {
					acc.getDetails();
				}
				else {
					System.out.println("create account first");
				}
				break;
			case 5:
				System.out.println("**bye bye**");
				sc.close(); //scanner closing
				System.exit(0); //to terminate applicatn
				break;
			default:
				System.out.println("invalid, try again");
				
			}//switch
			
			System.out.println("------------------------------");
			
			
		}//while

	}

}
