package discount_calculation;

import java.util.Scanner;

public class Customer {	
	
	private int item;
	private int number;
	
	public int chooseItem(){
		Scanner sc = new Scanner(System.in);   //scanner		
		item = sc.nextInt();                   //read line 
		return item;
	}
	
	public int setNumber()                 //number input
	{			
		Scanner sc = new Scanner(System.in);             //scanner
		System.out.println("Enter number of items: ");	 //write line
		number = sc.nextInt();                                //read line
		return number;                                        //return value
	}	
}
