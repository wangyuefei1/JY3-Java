public class Test1 
{
	public static void main(String[] args) 
	{
		String [] str = new String[]
		/*str[0] = "ͳ";
		str[1] = "��";
		str[2] = "һ";
		str[3] = "��";
		str[4] = "��";
		str[5] = "��";
		str[6] = "��";
		str[7] = "��";*/
		{"ͳ","��","һ","��","��","��","��","��","��","��","��","��","��","��","��","λ","��"};
		for(int i=0;i<str.length;i++ )
		{	
			//System.out.print(str[i]);
			if(str[i]=="��")
				{
					System.out.print(i);
				}	
		}
	}
}