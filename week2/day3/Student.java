package week2.day3;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("studentName");
	}
	public void studentDept()
	{
		System.out.println("studentDept");
	}
	public void studentId()
	{
		System.out.println("studentId");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
		
		stud.deptName();
		
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
	}

}
