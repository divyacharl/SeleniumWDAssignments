package week1.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		
		String[] arr=text.split(" ");
		for(int i=0;i<arr.length;i++)
		
		{
			for(int j=i+1;j<arr.length;j++) {
				//System.out.println(arr[i]+" "+arr[j]);
				if(arr[i].equals(arr[j]))
				{
					count=count+1;
					
				}
				
				if(count>0)
					{
						arr[j]=arr[j].replaceAll("[a-zA-Z]", "");
						System.out.print(arr[j]);
						count=0;
					}
			
			}
				if(count==0)
				{
					System.out.print(arr[i]+" ");
				}
				
			
			
		}
		
	}

}
