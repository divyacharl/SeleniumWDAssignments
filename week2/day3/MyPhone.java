package week2.day3;

public class MyPhone extends iPhone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			iPhone phone=new iPhone();
			phone.startApp();
			phone.increaseVolume();
			phone.shutDown();
			phone.makeCall();
			phone.sendSMS();
			
			MyPhone mine=new MyPhone();
			mine.startApp();
			mine.increaseVolume();
			mine.shutDown();
			mine.makeCall();
			mine.sendSMS();
	}

}
