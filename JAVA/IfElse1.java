import java.util.*;
public class IfElse1
{
	public static void main(String[] args)
	{
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("������Ҫ���������:");
	 int x = scanner.nextInt();
	 int price = 6;
	 int z = 6;
	 if(x<1){
	    System.out.print("����");
	 }else if(x > 1){
		 z = price + (x-1)*(price/2);
	    System.out.print("Ӧ��:" + z);
	 }else {
	 System.out.print("Ӧ��:" + z);
	 }
	}
}