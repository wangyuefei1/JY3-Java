import java.util.*;
public class WhileDemo1
{
	public static void main(String[] args)
	{
	   Scanner scanner = new Scanner(System.in);
	   while(true)
		{
		   System.out.print("������һ������:");
		   int num = scanner.nextInt();
			if(num == -1)
			{
				 break;
			}
		}

	}

}