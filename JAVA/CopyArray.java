import java.util.*;
public  class  CopyArray
{
	public static void main(String[] args) 
	{
		int[] Array1= new int[]{1,7,9,11,13,15,17,19};
		int[] Array2= new int[]{2,4,6,8,10};
		int[] newArray = new int[Array1.length+Array2.length];
		System.arraycopy(Array1,0,newArray,0,Array1.length);
		System.arraycopy(Array2,0,newArray,Array1.length,Array2.length);
		/*System.out.print(Arrays.toString(newArray));*/
		int[] newArr = bubbleSort(newArray);
		System.out.print(Arrays.toString(newArr));
	}
	public static int[] bubbleSort(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
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
