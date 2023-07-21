package week1.day3;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		for(int i=0;i<data.length;i++)
		{
			if(i==data.length-2)
{
		System.out.print("The second largest number is : "+data[i]);
}
		}

	}

}
