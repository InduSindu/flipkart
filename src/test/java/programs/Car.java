package programs;

public class Car 
{
   String model;
   double price;

   
   public Car(String model, double price) 
   {
	
	this.model = model;
	this.price = price;
   }



    public String toString() 
    {
	return "Car [model=" + model + ", price=" + price + "]";
    }
   
   
}
