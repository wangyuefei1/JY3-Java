import java.util.*;
 public class unit43 
{
	public static void main(String[] args) 
	{
		int[] array = new int[]{1,6,2,3,9,4,5,7,8};
		int[] newarr = bullueSort(array);
		System.out.print(Arrays.toString(newarr));
	}
	public static int[]  bullueSort(int[] array)
	{
	     for(int i=0;i<array.length-1;i++)
	     {
			for(int j=0;j<array.length-1-i;j++)
			{
				if (array[j]>array[j+1])
				{
				int temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				}
			}
	     } 
	     return array;
	}
}
