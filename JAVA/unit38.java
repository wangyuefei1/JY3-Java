import java.util.*;
public class unit38
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入年份：");
		int x = scanner.nextInt();
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
		{
			System.out.print("闰年");
		}
		else{
			System.out.print("不是闰年");
		}
	}
}