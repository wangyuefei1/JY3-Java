import java.util.*;
public class  large 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入两个数字:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if (x>y)
		{
			System.out.print(x);
		}
		else if (x<y)
		{
			System.out.print(y);
		}
	}
}
