package evalutionprogram;

public class FruitJuice {
	
	int product_code;
	String flavour;
	String pack_type;
	int product_size;
	int product_price;

  public FruitJuice()
  
  {
	  product_code = 29;
	  flavour = "Orange";
	  pack_type = "Pet Bottle";
	  product_size = 400;
	  product_price = 80;
  }
	    
	public void input() {
		
		System.out.println(" Product code : " +product_code);
		System.out.println(" flavour : " +flavour);
		System.out.println(" Pack type : " +pack_type);
		System.out.println(" Product size : " +product_size);
		System.out.println(" Product price : " +product_price);
		
		
		}
		
	public void discount() {
		product_price -= 10;
	}
	
	public void display() {
		

		System.out.println(" Product price with discount : " +product_price);

	
		
	}
	
	
     
	public static void main(String[] args) {
		FruitJuice obj = new FruitJuice();
		obj.input();
		obj.discount();
		obj.display();
		
		
		

	}

}
