import java.util.*;
public class unit36
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您的成绩一个数字：");
		int x = scanner.nextInt();
		switch (x)
		{
		case 1:
			System.out.print(1);
				break;
		case 5:
			System.out.print(5);
				break;
		case 10:
			System.out.print(10);
				break;
		default:
			System.out.print("none");
		}
	}
}
