public class App {  
        public static void main(String args[]) { 
       boolean trueOrFalse= false;
       int number1 = 1;
       double number2 = 2.25;
       byte number3 = 127;
       float number4 = 2;
       long number5 = 333;
       short number6 = -32768;
       System.out.println(trueOrFalse);//false
       System.out.println(number1);//1
       System.out.println(number2);//2.25
       System.out.println(number3);//127
       System.out.println(number4);//2.0
       System.out.println(number5);//333
       System.out.println(number6);//-32768
       
       class Speak{
            private String name;
            private String data;
            public Speak(String name, String data){
                this.name = name;
                this.data = data;
            }
            public String PrintInLine(){
                return this.name+" wants to say "+this.data;
            }
        }
        Speak text = new Speak("John", "Hello world!");// Jone and Hello world!(name and data) are reference variable, 
        System.out.println(text.PrintInLine());//John wants to say Hello world!
        int[] arr1 ={1, 3,5};
        int[] arr2 ={1, 3,5};
        if (arr1 == arr2)
                System.out.println("Same");
         else
                System.out.println("Not same");
      
       }
    }
   
    
