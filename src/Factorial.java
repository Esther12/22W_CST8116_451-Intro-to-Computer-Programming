import java.util.Scanner;
public class Factorial {
  public static void main(String[] args)
	{
    class Cal{
      private int number;
      public Cal(int i) {
        this.number=i;
      }
      public int Output(){
        int value=1;
        for(int i=1; i<=number;i++){
          value = value*i;
        }
        return value;
      }
    }
    int number;
    Scanner console = new Scanner(System.in);
    System.out.print("Number you want to calculate: ");
    number = Character.getNumericValue(console.next().charAt(0));
    Cal caseTest = new Cal( number);
    System.out.println("result is "+caseTest.Output());
  }
}
