import java.util.Scanner;	
public class Ifelse
{
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print ("请输入成绩:");
	int x = scanner.nextInt();
	if (x>100||x<0){
		System.out.println("super man");
		}
		else if (x>=90&&x<=100){
		System.out.println("优秀");
		}
		else if(x>=80&&x<90){
		System.out.println("良好");
		}
		else{
		System.out.println("不及格");}		
	}
}