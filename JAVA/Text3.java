 public class  Text3
{
	public static void main(String[] args) 
	{
		int oddsum = 0 ;
		int evensum = 0;
		String str = "123456789012";
		for (int i=0;i<str.length() ;i=i+2 )
		{
			char c1 = str.charAt(i);
			oddsum = oddsum+ c1-'0';
			
		}
		System.out.print(oddsum);
		for (int i=1;i<str.length() ;i=i+2 )
		{
			char c2 = str.charAt(i);
			evensum = evensum+ c2-'0';
			
		}
		System.out.print(evensum);
	}
}