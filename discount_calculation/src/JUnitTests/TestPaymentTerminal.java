package JUnitTests;

import org.junit.BeforeClass;
import org.junit.Test;

import discount_calculation.PaymentTerminal;
import junit.framework.Assert;

public class TestPaymentTerminal {
	
	private static PaymentTerminal pay;
	
	@BeforeClass
	public static void tests(){
		pay = new PaymentTerminal();
	}
	
	@Test
	public void testCalcTotal1(){
	    float res = pay.calcTotal(25.30f,15);	    
	    Assert.assertTrue(res == 284.625f);
	}
	
	@Test
	public void testCalcTotal2(){
	    float res = pay.calcTotal(21.50f,5);	    
	    Assert.assertTrue(res == 107.5f);
	}
	
	
	@Test
	public void testGetPrice4(){
	    float res = pay.getPrice(4);	    
	    Assert.assertTrue(res == 21.50f);	    
	}	
	
	@Test
	public void testGetPrice1(){
	    float res = pay.getPrice(1);	    
	    Assert.assertTrue(res == 12.50f);	    
	}		
	
}
