public class Moneysum 
{
	public static void main(String[] args) 
	{
		double x = 30000;
		double sum = 0;
		for (int i = 1;i<=10 ;i++ )
		{
			sum = sum+x;
			x = x + (x*0.06);
		}
		System.out.print(sum);
	}
}
