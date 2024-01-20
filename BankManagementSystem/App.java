
import java.util.Scanner;

public class App {
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id and name");
		int customerId=sc.nextInt();
		String cutomerName=sc.next();
		BankAccount obj=new BankAccount(customerId, cutomerName);
		
		obj.menu();
	}
	

}
