import java.util.*;
public class IfElse1
{
	public static void main(String[] args)
	{
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("请输入要购买的数量:");
	 int x = scanner.nextInt();
	 int price = 6;
	 int z = 6;
	 if(x<1){
	    System.out.print("不卖");
	 }else if(x > 1){
		 z = price + (x-1)*(price/2);
	    System.out.print("应付:" + z);
	 }else {
	 System.out.print("应付:" + z);
	 }
	}
}