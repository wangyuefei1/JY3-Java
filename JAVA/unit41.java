 import java.util.*;
 public class unit41 
{
	public static void main(String[] args) 
	{
		int[] array = new int[]{10,20,30,40,50};
		int[] array1 = new int[array.length];
		System.out.println(Arrays.toString(array));
		System.arraycopy(array,0,array1,0,array.length);
		System.out.println(Arrays.toString(array1));

	}
}
