import java.util.*;
public class Score
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("���������ĳɼ���");
		int x = scanner.nextInt();
		switch (x/10)
		{
		case 10:
			System.out.print("���ĳɼ�Ϊ��A");
			break;
		case 9:
			System.out.print("���ĳɼ�Ϊ��B");
			break;
		case 8:
			System.out.print("���ĳɼ�Ϊ��C");
			break;
		case 7:
			System.out.print("���ĳɼ�Ϊ��D");
			break;
		case 6:
			System.out.print("���ĳɼ�Ϊ��E");
			break;
		case 5:
			System.out.print("���ĳɼ�Ϊ��F");
			break;
		default:
			System.out.print("������");	
		}

	}
}
