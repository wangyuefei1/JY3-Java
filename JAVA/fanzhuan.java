 public class fanzhuan  
{
	public static void main(String[] args) 
	{
		int a = 56123;
		int b = 0;
		while (a!=0)
		{
			b = a%10;
			a = a/10;
			System.out.print(b);
		}
	}
}
