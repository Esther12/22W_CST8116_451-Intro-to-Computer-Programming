import java.util.Scanner;

public class Shipment {
	private Package package1; 
		private Package package2; 
		private String message;
		Scanner input = new Scanner(System.in);
		public void inputPackages( Package a, Package b){
			package1 = a;
			package2 = b;
		}
		public void calculateCost(){
			double price1 =3.0;
			double price2 =3.0;
			if(package1.calcVolume() >1){
				price1 += (package1.calcVolume() -1.0);
			}
			if(package2.calcVolume() >1){
				price2 += (package2.calcVolume() -1.0);
			}
			double time =0;
			String msg="";
			if(price1 == price2){
				msg="The first package is the same cost as the second package";
			}else{
				if(price1 >price2){
					time = Math.floor(price1 /price2);
					if(time <2.0){
						msg="The first package is slightly more then the second package";
					}else if(time<3.0){
						msg="The first package is twice then the second package";
					}else if(time<3.0){
						msg="The first package is triple then the second package";
					}else if(time<3.0){
						msg="The first package is quadruple then the second package";
					}else{
						msg="The first package is "+time+"x then the second package";
					}
				}else{
					time = Math.floor(price2 /price1);
					if(time <2.0){
						msg="The second package is slightly more then the first package";
					}else if(time<3.0){
						msg="The second package is twice then the first package";
					}else if(time<3.0){
						msg="The second package is triple then the first package";
					}else if(time<3.0){
						msg="The second package is quadruple then the first package";
					}else{
						msg="The second package is "+time+"x then the first package";
					}
				}
				
			}
			this.message = "Package 1 will cost $"+ price1+"\n" +"Package 2 will cost $"+price2+"\n" +msg;
		}
		public void display(){
			System.out.println(this.message);
		}
	public Shipment(){
		package1 = new Package();
		package2 = new Package();
		inputData();
		package1.displayDimensions("First");
		package2.displayDimensions("Second");
		calculateCost();
		display();
	}
	public void inputData(){
		System.out.println("Enter first package dimensions");
		System.out.print("Enter height: ");
		package1.inputHeight(input.nextDouble());
		System.out.print("Enter width: ");
		package1.inputWidth(input.nextDouble());
		System.out.print("Enter length: ");
		package1.inputLength(input.nextDouble());
		System.out.println("Enter Second package dimensions");
		System.out.print("Enter height: ");
		package2.inputHeight(input.nextDouble());
		System.out.print("Enter width: ");
		package2.inputWidth(input.nextDouble());
		System.out.print("Enter length: ");
		package2.inputLength(input.nextDouble());
	}
  public static void main(String[] args)
	{
		System.out.println("Welcome to Yating Su's shipping calculator");
		new Shipment();
	}
}
