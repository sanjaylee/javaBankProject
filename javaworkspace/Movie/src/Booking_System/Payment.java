package Booking_System;

import java.util.concurrent.TimeUnit;

public class Payment {
	
	public static boolean processPayment(double amount) throws InterruptedException {
		
		System.out.println("Processing payment of "+amount+".......");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("payment successful !");
		return true;
	}

}
