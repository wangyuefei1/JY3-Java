public class Test8
{
	public static void main(String[] args)
	{
	   String str = "692116851128";
	   int oddsum = 0 ;
	   int evensum = 0;
	   for (int i = 0;i<str.length();i+=2)
	   {
		char a = str.charAt(i);
		oddsum += a-'0';
	   }
		System.out.println(oddsum);
		for (int i = 1;i<str.length();i+=2)
	   {
		char b = str.charAt(i);
		evensum += b-'0';
	   }
		System.out.println(evensum);
		int sum1 = oddsum + evensum*3;
		System.out.println(sum1);
		int sum2 = 110%sum1;
		System.out.println(sum2);
		int sum3 = 10 - sum2;
		int sum = sum2%10;
		System.out.print(sum);
	}
}