import java.util.*;
public class unit38
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int x = scanner.nextInt();
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
		{
			System.out.print("����");
		}
		else{
			System.out.print("��������");
		}
	}
}