package practice;

public class Book {
	 public	static void main(String[] args)
	 { 
		Books book1 = new Books();
		book1.name = "Java���˼��";
		book1.page = 687;
		book1.author = "Bruce Eckel";
		book1.money = 25.0;
		book1.isCollection = true;
		System.out.println("����: " + book1.name);
		System.out.println("ҳ��: " + book1.page);
		System.out.println("����: " + book1.author);
		System.out.println("�۸�: " + book1.money);
		book1.read();
		boolean result = book1.getCollection();
		if(result == true)
		{
			System.out.println("���ղ�");
		}
		double sum = book1.buy(10);
		System.out.print(sum);
		
	 }
}
class Books{
	 String name;
	 int page;
	 double money;
	 String author;
	 boolean isCollection;
	 public void  read() 
	 {
		 System.out.println("����");
	 }
	 public boolean getCollection()
	 {
		return isCollection; 
	 }
	 public double buy(int nums)
	 {
		 return money*nums;
	 }
}