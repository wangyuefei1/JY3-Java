import java.util.*;
public class unit39
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您的成绩：");
		int x = scanner.nextInt();
		if (x>=90&&x<=100)
		{
			System.out.print("您的成绩为:A");
		}
			else if (x>=80&&x<90)
		{
			System.out.print("您的成绩为:B");
		}
			else if (x>=70&&x<80)
		{
			System.out.print("您的成绩为:C");
		}
			else if (x>=60&&x<70)
		{
			System.out.print("您的成绩为:D");
		}
			else if (x>=0&&x<60)
		{
			System.out.print("您的成绩为:E");
		}
			else
		{
			System.out.print("打印成绩无效");
		}
	}
}
