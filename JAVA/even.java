import java.util.*;
public class even 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("����һ������:");
		int x = scanner.nextInt();
		if ((x%2) == 0)
		{
			System.out.print("�����������ż��");
		}
		System.out.print(x);
	}
}
