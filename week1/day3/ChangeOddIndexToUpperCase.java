package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		String abc=test.toLowerCase();
		String upper="";
		char[] arr= test.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if (i%2!=0)
			{
				System.out.print(Character.toUpperCase(arr[i]));
				
			}
			if (i%2==0)
			{
				System.out.print(arr[i]);
			}
			
		}

	}

}
