package programs;

import java.util.Comparator;

public class Sort_Model implements Comparator
{
  public int compare(Object o1,Object o2)
  {
	  Car c1 = (Car)o1;
	  Car c2 = (Car)o2;
	  
	//return (int) c1.model.compareTo(c2.model);
	 // return (int)(c1.price-c2.price);
	  return c1.model.compareTo(c2.model);
	  
  }
}