import java.util.*;
public class Login
{
	public static void main(String[] args)
	{
	   Scanner scanner = new Scanner(System.in);
	   char username = 'c';
	   char password = 'd';
		 System.out.println("请输入用户名：");
		 String inputname = scanner.next();
		 System.out.println("请输入密码：");
		 String inputpsw = scanner.next();
		char c1 =  inputname.charAt(0);
		char c2 =  inputpsw.charAt(0);
		if (username == c1 && password == c2)
		{
			System.out.print("登陆成功");
		}
	}

}