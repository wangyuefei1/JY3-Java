import java.util.*;
public class unit39
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("���������ĳɼ���");
		int x = scanner.nextInt();
		if (x>=90&&x<=100)
		{
			System.out.print("���ĳɼ�Ϊ:A");
		}
			else if (x>=80&&x<90)
		{
			System.out.print("���ĳɼ�Ϊ:B");
		}
			else if (x>=70&&x<80)
		{
			System.out.print("���ĳɼ�Ϊ:C");
		}
			else if (x>=60&&x<70)
		{
			System.out.print("���ĳɼ�Ϊ:D");
		}
			else if (x>=0&&x<60)
		{
			System.out.print("���ĳɼ�Ϊ:E");
		}
			else
		{
			System.out.print("��ӡ�ɼ���Ч");
		}
	}
}
