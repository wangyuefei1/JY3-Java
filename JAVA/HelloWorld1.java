import java.util.*;
public class HelloWorld1
{	
	public static void main( String[] args)
	{
	 int age1 = 23;
	 int age2 = 24;
	 System.out.println(age1+age2);
	 long  num= 12345678901l;
	 float num1= 3.1415926f;
	 double num2= 1234567890.0987654321;
	 Random random = new Random();
	 int num3 = random.nextInt(26);
	 char c = (char)('A'+ num3);
	 System.out.println(c);
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入一个数字:");
	int num4 = scanner.nextInt();
	System.out.println(num4 * num4);
	int num5 = 100;
	String num6 = Integer.toBinaryString(num5);
	System.out.println(num6);
	String num7 = Integer.toHexString(num5);
	System.out.println(num7);
	double x = 2 * 10 * 384;
	System.out.println(Math.sqrt(x));
	}


}