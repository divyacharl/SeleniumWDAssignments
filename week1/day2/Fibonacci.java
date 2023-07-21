package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int firstNum=0;
		int secondNum=1;
		int sum=0;
		//String series="";
		for(int i=0;i<range;i++)
		{
			//sum=firstNum+secondNum;
		if(i==0)
		{
			sum=0;
		}
		
		System.out.print(sum+",");
			firstNum=secondNum;
			secondNum=sum;
			sum=firstNum+secondNum;
			
		}
	}

}
