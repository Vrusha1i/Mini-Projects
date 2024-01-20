import java.util.Scanner;

public class BankAccount {

	private int customerId;
	private String customerName;
	private double balance;
	private double prevtransaction;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getPrevtransaction() {
		return prevtransaction;
	}
	public void setPrevtransaction(double prevtransaction) {
		this.prevtransaction = prevtransaction;
	}
	
	public BankAccount(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	@Override
	public String toString() {
		return "BankAccount [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	void deposite(double amount) {
		
		if(amount!=0) {
			balance+=amount;
			prevtransaction=amount;
		}
		
	}
	void withdraw(double amt) {
		if(amt!=0&& balance>amt) {
			balance-=amt;
			prevtransaction=-amt;
		}else if(balance<amt) {
			System.out.println("bank balance is insuficient");
		}
	}
	
	void getprevtransaction() {
		if(prevtransaction>0) {
			System.out.println("Deposited"+prevtransaction);
		}else if(prevtransaction<0) {
			System.out.println("withdraw"+Math.abs(prevtransaction));
		}
		else {
			System.out.println("no transaction");
		}
	}
	
	void menu() {
		Scanner sc=new Scanner(System.in);
		char option;
		System.out.println("enter your Id"+customerId);
		System.out.println("enter your name"+customerName);
		System.out.println("a) check your balance");
		System.out.println("b) Deposite Amount");
		System.out.println("c) withdraw Amount");
		System.out.println("d) get your transaction");
		System.out.println("e) exit");
		boolean b=true;
		while(b) {
			
		
		System.out.println("choose your option");
		option=sc.next().charAt(0);
		
		
			
			switch(option) {
			case'a':
				System.out.println("Your balance is"+balance);
				break;
				
			case 'b':
				System.out.println("Enter amount that you deposited");
				double amtd=sc.nextDouble();
				deposite(amtd);
				break;
				
			case'c':
				System.out.println("enter amount that you withdraw");
				double amtw=sc.nextDouble();
				withdraw(amtw);
				break;
				
			case 'd':
				System.out.println("your prev transaction");
				getPrevtransaction();
				break;
				
			case 'e':
				System.out.println("...........");
				break;
				
				default:
					System.out.println("choose correct option");
					b=false;
					break;
					
			}
			
		}
	
		
	}
}
