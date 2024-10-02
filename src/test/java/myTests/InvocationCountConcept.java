package myTests;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	
	@Test(invocationCount = 10,priority = 1)
	public void paymentTest() {
		int count =0;
		System.out.println(count + ":" + "Payment Test");
		count++;
	}
	
	@Test(invocationCount = 10,priority = 2)
	public void clearCache() {
		System.out.println("Clear Cache");
	}

}
