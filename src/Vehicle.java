public class Vehicle {
  public static void main(String[] args)
	{
    class Auto{
      private int no_of_seats;
      private int no_of_wheels;
      public Auto(int i, int j) {
        this.no_of_seats = i;
        this.no_of_wheels = j;
      }
      public String Output(String a){
        return a +" has "+no_of_seats +" seats and "+no_of_wheels+ " wheels";
      }
    }
    Auto Motorcycle = new Auto(2,2);
    Auto Car = new Auto(5,4);
    System.out.println(Motorcycle.Output("Motorcycle"));
    System.out.println(Car.Output("Car"));
	}
}

