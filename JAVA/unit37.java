import java.util.*;
public class unit37
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数字：");
		int x = scanner.nextInt();
		if(x%5==0&&x%6==0)
		{
			System.out.print("能被5和6整除");
		}
			else if (x%5==0&&x%6!=0)
			{
				System.out.print("能被5整除");
			}
			else if (x%5!=0&&x%6==0)
			{
				System.out.print("能被6整除");
			}
			else{
				System.out.print("不能被5和6整除");
			}
	}
}
