public class Practice01
{
	public static void main(String[] args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			System.out.print(j+"*"+i+"="+i*j+"\t");
		}
		System.out.println();
		double dis = getDistance(2,4,0,0);
	    System.out.print(dis);
	}
	public static double getDistance(int x1,int	x2,int y1,int y2)
	{
	  double dis = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
	   return dis;
	}
	
}