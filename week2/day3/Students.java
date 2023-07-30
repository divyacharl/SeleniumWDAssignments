package week2.day3;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println(name+id);
	}
	public void getStudentInfo(String email,long phno)
	{
		System.out.println(email+phno);
	}
	
	
	public static void main(String[] args) {
		
		Students stud=new Students();
		stud.getStudentInfo(12);
		stud.getStudentInfo(12, "divya");
		stud.getStudentInfo("divya@gmail.com", 1234567890);
		
		
	}

}
