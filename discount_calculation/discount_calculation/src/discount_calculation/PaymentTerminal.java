package discount_calculation;

public class PaymentTerminal {

	private float price;
	
	public void printItemsList(){
		System.out.println("Choose item: "+"\n1 Pen"+"\n2 Highlighter"+"\n3 Pencil"+"\n4 Marker pen");   //write line	
	}
	
	public float getPrice(int n){
		
		switch (n){
			case 1:
				price = 12.50f;
				System.out.println("You,ve chosen Pen. It's price is: "+ price +" rub.");
				break;				
			case 2:
				price = 25.99f;
				System.out.println("You,ve chosen Highlighter. It's price is: "+ price +" rub.");
				break;				
			case 3:
				price = 9.00f;
				System.out.println("You,ve chosen Pencil. It's price is: "+ price +" rub.");
				break;				
			case 4:
				price = 21.50f;
				System.out.println("You,ve chosen Marker pen. It's price is: "+ price +" rub.");
				break;
			}                     		
	    return price; //return price value
	}
	
	public void calcTotal(float a, int b)                 //get total price
	{
		float sum;
		sum =a * b;  //multiplication of price by number                                 
		if (sum < 250){
			System.out.println("No discount. Total price: " + sum + " rub.");  //write total price with no discount   
		}
		else{
			System.out.println("Discount price: " + sum*0.75 + " rub.");  //write total price with no discount   
		}
	}	
	
}
