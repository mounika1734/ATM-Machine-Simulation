package atm;

public class atm {
	private double depositAmount;
	private double balance;
	private double withdrawAmount;


	public double getDepositAmount() {
		return depositAmount;
	}


	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getWithdrawAmount() {
		return withdrawAmount;
	}


	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}


	@Override
	public String toString() {
		return "atm [depositAmount=" + depositAmount + ", balance=" + balance + ", withdrawAmount=" + withdrawAmount
				+ "]";
	}
	


	

}
