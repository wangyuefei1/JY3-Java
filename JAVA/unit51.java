 public class unit51 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int sum = JieCheng(n);
		System.out.println(sum);
	}
	public static int JieCheng(int n)
	{
		int sum = 1;
		for (int i=1;i<=n ;i++ )
		{
			sum = sum*i;
		}
		return sum;
	}
}
