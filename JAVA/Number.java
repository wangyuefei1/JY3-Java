public class Number 
{
	public static void main(String[] args) 
	{


		for (int i=100;i<=999;i++ )
		{
			int hun = i/100;
			int ten = i/10 %10;
			int num = i%10;
			double sum = Math.pow(hun,3)+Math.pow(ten,3)+Math.pow(num,3);
			if (i == sum)
			{
				System.out.println(i);
			}
		}
	}
}
