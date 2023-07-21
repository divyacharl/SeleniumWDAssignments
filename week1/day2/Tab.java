package week1.day2;

public class Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Mobile mob=new Mobile();
			mob.sendSms();
			mob.makeCall(45967506850598264l);
			long l=mob.makeCall(45967506850598264l);
			System.out.println(l);
			System.out.println(mob.makeCall(45967506850598264l));

	}

}
