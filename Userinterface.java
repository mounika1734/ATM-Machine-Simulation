package atm;

import java.util.Scanner;

public class Userinterface {
	private static int status;

	public static void main(String [] args) {
		AtmImplementation imp1=new AtmImplementation();
		Scanner scan=new Scanner (System.in  );
		int atmnumber=123456;
		int atmpin=123;
		System.out.println("Enter the atm number");
		int atm2=scan.nextInt();
		System.out.println("Enter the pin");
		int atmpin2=scan.nextInt();
		if(atmnumber == atm2 && atmpin == atmpin2) {
			while(true) {
			System.out.println(" 1.view balance \n 2.withdraw amount \n 3. Deposit amount \n 4. view mini statement \n 5.exit");
			System.out.println("Enter choice");
			int ch=scan.nextInt();
			if(ch==1) {
				imp1.viewBalance();
			}
			
			else if(ch==2) {
				System.out.println("Enter amount withdraw");
				double withdrawAmount=scan.nextDouble();
				imp1.withdrawAmount(withdrawAmount);
				 
			}
			else if(ch==3) {
				System.out.println("Enter amount deposit");
				double depositAmount=scan.nextDouble();
				imp1.depositAmount(depositAmount);
				
			}
			else if(ch==4) {
				imp1.vieewminiStatement();
				
			}
			else if(ch==5) {
				System.out.println("collect card");
				System.exit(status);
				
			}
			}
			
			
			
			
			
		}
		else {
			System.out.println("Entered incrooect number and password");
		}
		
	}

}
