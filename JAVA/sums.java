import java.util.*;
public class  sums
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("����һ������:");
		int a = scanner.nextInt();
		int b,c,d,e,sum;
		e = a/1000;
		d = a/100 %10;
		c = a/10 %10;
		b = a%10;
		sum = b+c+d+e;
		System.out.print(sum);
	}
}
