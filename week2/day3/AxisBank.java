package week2.day3;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Axis deposit");
	}
	
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		BankInfo bank=new BankInfo();
		axis.deposit();
		bank.deposit();
	}

}
