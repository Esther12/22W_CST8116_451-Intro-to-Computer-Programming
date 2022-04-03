public class Package {
  private double length;
  private double width;
  private double height;
  public void Packages(double length, double width, double height)
	{
    	this.length = length;
      this.width = width;
      this.height = height;
	}
  public Package() {
      this.length = 1.0;
      this.width = 1.0;
      this.height = 1.0;
  }
  public void inputLength( double length){
      this.length =length;
  }
  public void inputWidth(double width){
    this.width = width;
  }
  public void inputHeight(double height){
    this.height = height;
  }
  public void displayDimensions(String name){
    double val = calcVolume();
    System.out.println("The"+name+" Dimensions: length "+this.length+", width "+ this.width+", height "+ this.height +" Volume = "+val);
  }
  public double calcVolume(){
    return this.height*this.width*this.length;
  }
}
