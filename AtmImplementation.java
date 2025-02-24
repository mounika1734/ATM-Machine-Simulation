package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmImplementation implements  AtmInterface {
	atm Atm=new atm();
	Map<Double,String> ministmt=new HashMap<>();
	
	@Override
	public void viewBalance() {
		 System.out.println("Balance amount is:"+Atm.getBalance())	;	
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("deposit amount is:"+depositAmount)	;	
		Atm.setBalance(Atm.getBalance()+depositAmount);
		ministmt.put(depositAmount,"Deposited Successfully");
		viewBalance();
	
		
		
	}

	@Override
	
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount % 100==0) {
			if(withdrawAmount<=Atm.getBalance()) {
				System.out.println("collecct the cash"+withdrawAmount);
				Atm.setBalance(Atm.getBalance()- withdrawAmount);
				ministmt.put(withdrawAmount,"Amount withdrawn");
				viewBalance();
				
				
			}
			else {
				System.out.println("Insufficiient balance");
			}
		}
		else {
			System.out.println("Enter amount in terms of 100");
		}
		
	}

	@Override
	public void vieewminiStatement() {
		Set <Double> set=ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmt.get(d));
		}
		
	}

}
