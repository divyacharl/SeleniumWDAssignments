package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "ABCDE";
		
char[] ch = s.toCharArray();
        
        for(int i=s.length()-1;i>=0;i--) {
            System.out.print(ch[i]);
        }
        

	}

}
