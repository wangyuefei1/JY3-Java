import java.util.Scanner;
public class Practice
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int size = 10;
		int page = total%size==0 ? total/size:total/size+1;
		System.out.println(page);

		int x = 4;
		int y = f(x);
		System.out.println(y);

		int x1 = 8;
		int y1 = chu(x1);
		System.out.println(y1);
		
		int x2 = 10;
		int y2 = jia(x2);
		System.out.println(y2);
	}
	public static int f(int x)
	{
		int a = x * x - 2 * x + 4;
		return a;
	}
	public static int chu(int z)
	{
		int b = z%3;
		return b;
	}
	public static int jia(int w)
	{
		int c = w++;
		return c;
	}
}