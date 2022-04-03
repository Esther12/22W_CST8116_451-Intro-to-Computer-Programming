import java.util.Arrays;

public class AverageValue {
  public static void main(String[] args)
	{
      int[] arr = {1, 4, 7, 3, 8, 44, 99};
      int result =0;
      System.out.println("The array");
      System.out.println(Arrays.toString(arr));
      for(int i=arr.length-1; i >=0; i--){
        result += arr[i];
      }
      result = result/arr.length;
    	System.out.println("The Average of the array");
      System.out.println(result);
	}
}
