import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args)
	{
    class IsLeap{
      private int year;
      private int number_of_days;
      public IsLeap(int i, int j) {
        this.year = i;
        this.number_of_days=j;
      }
      public String Output(){
        if(number_of_days !=366){
          if((year%400 ==0)|| ((year%4 == 0) &&(year%100 !=0))){
            return "this year is a leap year";
          }else{
            return "this year is not a leap year";
          }
        }else{
            return "this year is a leap year";
        }
      }
    }
    int y;
    int number;
    Scanner console = new Scanner(System.in);
    System.out.print("Insert the year you want to test:  ");
    y = Character.getNumericValue(console.next().charAt(0));
    System.out.print("Do you know how many days in that year? if so insert the value, otherwise insert 0:  1970");
    number = Character.getNumericValue(console.next().charAt(0));
    IsLeap caseTest = new IsLeap(y, number);
    System.out.println(caseTest.Output());
  }
}
