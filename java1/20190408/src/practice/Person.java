package practice;

public class Person {
	public Person(String num,String name,char sex,int age,String id,String address,
	              boolean ismarry,String phonenum,String name1)
	{
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.address = address;
		this.id = id;
		this.ismarry = ismarry;
		this.phonenum = phonenum;
		this.name1 = name1;
	}

		String num;
		String name;
		char sex;
		int age;
		String id;
		String address;
		boolean ismarry;
		String phonenum;
		String name1;
		public boolean getmarry(Person aperson)
		{
			MarryHouse marryhouse = new MarryHouse();
			boolean getmarry= marryhouse.marry(this , aperson);
			return getmarry;
		}
		public static void main(String[] args) {
			Person boy = new Person("1234567","阿萨德",'男',23,"123456","中国",false,"12345","");
			Person girl = new Person("12345678","阿斯顿",'女',23,"1234567","中国",false,"123456","");
			boolean marry = boy.getmarry(girl);
			System.out.print(marry);
		}
}
class MarryHouse
{
	public boolean marry(Person p1,Person p2) 
	{
		if (p1.sex != p2.sex)
		{
			if (p1.age>=20 && p2.age>=22 && p1.sex =='男'|| p2.age>=20 && p1.age>=22 && p1.sex=='女')
			{
				if(!p1.ismarry && !p2.ismarry)
				{
					p1.ismarry = true;
					p2.ismarry = true;
					return true;
				}
			}
		}
		return false;
	}
}