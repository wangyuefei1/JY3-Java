import java.util.*;
public class BullueSort
{
	public static void main(String[] args)
	{
		int[] nums = {11,13,15,12,14};
		int[]newarr = bullueSort(nums);
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