import java.util.*;
public class unit37
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ�����֣�");
		int x = scanner.nextInt();
		if(x%5==0&&x%6==0)
		{
			System.out.print("�ܱ�5��6����");
		}
			else if (x%5==0&&x%6!=0)
			{
				System.out.print("�ܱ�5����");
			}
			else if (x%5!=0&&x%6==0)
			{
				System.out.print("�ܱ�6����");
			}
			else{
				System.out.print("���ܱ�5��6����");
			}
	}
}