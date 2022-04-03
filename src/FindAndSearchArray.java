import java.util.Scanner;

public class FindAndSearchArray {
  public static void main(String[] args)
	
    {
      Scanner console = new Scanner(System.in);
      char choice;
      String charRandom;
      int chances = 5;
      String[] arr= {"v", "r", "t", "s", "G", "N", "a", "c"};
      do{
        if(chances<1){
          break;
        }
          chances --;
          System.out.print("Guess my mind! Input a character to see if it is in the array: ");
          charRandom = Character.toString(console.next().charAt(0));
          boolean result = false;
          for(String a: arr){
            if( a.equals(charRandom)){
              result = true;
              break;
            }
          }
          if(result){
            System.out.println("You Win!!");
          }else{
            System.out.println("Next time");
          }
          String display = "you have "+ chances +" times left.";
          System.out.println(display);
          System.out.print("Do you want to try again y/n? ");
          choice = console.next().charAt(0);
      }while(choice=='y' || choice == 'Y');
      System.out.println("Section ended.");
      /***
       * Out puts:
       * Guess my mind! Input a character to see if it is in the array: r
          You Win!!
          you have 4 times left.
          Do you want to try again y/n? y
          Guess my mind! Input a character to see if it is in the array: x
          Next time
          you have 3 times left.
          Do you want to try again y/n? e
          Section ended.
      */
  }  
}
