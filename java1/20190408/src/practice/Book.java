package practice;

public class Book {
	 public	static void main(String[] args)
	 { 
		Books book1 = new Books();
		book1.name = "Java编程思想";
		book1.page = 687;
		book1.author = "Bruce Eckel";
		book1.money = 25.0;
		book1.isCollection = true;
		System.out.println("书名: " + book1.name);
		System.out.println("页数: " + book1.page);
		System.out.println("作者: " + book1.author);
		System.out.println("价格: " + book1.money);
		book1.read();
		boolean result = book1.getCollection();
		if(result == true)
		{
			System.out.println("已收藏");
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
		 System.out.println("看书");
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
