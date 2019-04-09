import java.util.*;
public class even 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入一个数字:");
		int x = scanner.nextInt();
		if ((x%2) == 0)
		{
			System.out.print("输入的数字是偶数");
		}
		System.out.print(x);
	}
}
