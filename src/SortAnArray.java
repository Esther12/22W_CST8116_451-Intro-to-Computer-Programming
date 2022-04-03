import java.util.Arrays;

public class SortAnArray {

  public static void main(String[] args)
	{
		int[] intArr = {1, 5, 7, 8 , 10};
		String[] stringArr = {"v", "d", "t", "z", "g"};
    System.out.println("Original integer Array is: ");
		System.out.println(Arrays.toString(intArr));
		System.out.println("Original string Array is: ");
		System.out.println(Arrays.toString(stringArr));
		//sort the arrays
		Arrays.sort(intArr);
		Arrays.sort(stringArr);
		System.out.println("*************************** ");
		System.out.println("Sorted integer Array is: ");
		for(int i=0; i<intArr.length; i++){
			System.out.println(intArr[i]);
		}
		System.out.println("Sorted string Array is: ");
		int current =0;
		while(current<stringArr.length){
			System.out.println(stringArr[current]);
			current++;
		}
	}
	/***
	 * out puts:
	 * Original integer Array is: 
			[1, 5, 7, 8, 10]
			Original string Array is: 
			[v, d, t, z, g]
			*************************** 
			Sorted integer Array is: 
			1
			5
			7
			8
			10
			Sorted string Array is: 
			d
			g
			t
			v
			z
 */
}
