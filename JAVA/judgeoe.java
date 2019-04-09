import java.util.*;
public class judgeoe
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您的成绩一个数字：");
		int x = scanner.nextInt();
		if (x%2==0)
		{
			System.out.print("偶数");
		}
			else
		{
			System.out.print("奇数");
		}
	}
}
