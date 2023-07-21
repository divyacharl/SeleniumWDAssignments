package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] strArray=test.split(" ");
		
		char[] charArray;
		for(int i=0;i<strArray.length;i++)
		{
			if(i%2!=0)
			{
				
				charArray=strArray[i].toCharArray();
				//System.out.println(charArray.length);
				for(int j=charArray.length-1;j>=0;--j)
				{
				System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}
			else if(i%2==0)
			{
				System.out.print(strArray[i]+" ");
			}
		}

	}

}
