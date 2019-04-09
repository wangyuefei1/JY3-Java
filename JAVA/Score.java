import java.util.*;
public class Score
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您的成绩：");
		int x = scanner.nextInt();
		switch (x/10)
		{
		case 10:
			System.out.print("您的成绩为：A");
			break;
		case 9:
			System.out.print("您的成绩为：B");
			break;
		case 8:
			System.out.print("您的成绩为：C");
			break;
		case 7:
			System.out.print("您的成绩为：D");
			break;
		case 6:
			System.out.print("您的成绩为：E");
			break;
		case 5:
			System.out.print("您的成绩为：F");
			break;
		default:
			System.out.print("不及格");	
		}

	}
}
