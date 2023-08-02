package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			list1.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			list2.add(b[i]);
		}
		
		//System.out.println(list1);
		//System.out.println(list2);
	for(int k=0;k<list1.size();k++)
	{
		for(int l=0;l<list2.size();l++)
		{
			if(list1.get(k)==list2.get(l))
			{
				System.out.println(list1.get(k));
			}
		}
	}
	}

}
