package week1.day2;

public class Mobile {
	
	public void sendSms()
	{
		
		System.out.println("From oppo");
	}
	
	public long makeCall(long phno)
	{
		return phno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile= new Mobile();
		mobile.sendSms();
		mobile.makeCall(12345678901234243l);
	}

}
