import java.util.*;
public class unit311
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ�����֣�");
		int x = scanner.nextInt();
		int a,b,c,d,e;
		if (x/10000 >=1)
		{
			System.out.print("��λ��");
			a = x/10000;
			b = x/1000 %10;
			c = x/100 %10;
			d = x/10 %10;
			e = x%10;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.print(e);
		}
		else if (x/1000 >=1)
		{
			System.out.print("��λ��");
			b = x/1000 ;
			c = x/100 %10;
			d = x/10 %10;
			e = x%10;
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.print(e);
		}
		else if (x/100 >=1)
		{
			System.out.print("��λ��");
			c = x/100 ;
			d = x/10 %10;
			e = x%10;
			System.out.println(c);
			System.out.println(d);
			System.out.print(e);
		}
		else if (x/10 >=1)
		{
			System.out.print("��λ��");
			d = x/10;
			e = x%10;
			System.out.println(d);
			System.out.print(e);
		}
		else
		{
			System.out.print("һλ��");
			e = x%10;
			System.out.print(e);
		}
	}
}