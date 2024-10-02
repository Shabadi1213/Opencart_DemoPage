package myTests;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	int age;
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void makePayment() {
		System.out.println("Payment");
		int i = 9/2;
		
		ExpectedExceptionConcept obj = null;
		obj.age = 20;
	}

}
