import java.util.Arrays;

public class RevertInteger {
  public static void main(String[] args)
	{
    int[] arr={1, 5, 7, 8,  2};
    System.out.println("The original integer array "+Arrays.toString(arr));
    int[] newArr = new int[arr.length];
    for(int i = arr.length-1; i >=0; i--){
      newArr[arr.length-i-1] = arr[i];
    }
    System.out.println("the revert array "+Arrays.toString(newArr));
  // out puts:
  // The original integer array [1, 5, 7, 8, 2]
  // the revert array [2, 8, 7, 5, 1]
	}
}
