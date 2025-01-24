package Booking_System;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MovieBookingSystem {
	private static int id = 0;
	private List<Movie> movies=new ArrayList<>();
	private List<Booking> booking= new ArrayList<>();
	Map<String,Integer> snack=new HashMap<String,Integer>();
		
	public MovieBookingSystem() {
		movies.add(new Movie(1,"leo","Action",6.5, 190.0,"10 pm"));
		movies.add(new Movie(2,"comali","comdey",8.5, 200.0,"1 am"));
		movies.add(new Movie(3,"jersey","motivational",9.5, 210.0,"10 am"));
		movies.add(new Movie(4,"96","romantic",8.5, 120.0,"11 pm"));
		
		
		snack.put("popcorn", 250);
		snack.put("ice cream", 100);	
		snack.put("water",30);
		
	}

	
	// show movies method 
	
	public void showMovies() {
		System.out.println("Available Movies:");
		for(Movie movie:movies) {
			System.out.println(movie);
		}
	}
	
	
	
	// bookmovie method
	public boolean bookMovie(String yname,String name,int seats,String snack2) throws InterruptedException {
		for(Movie movie :movies) {
			if(movie.getName().equals(name)) {

			
				if(seats>movie.getAvailableSeats()) {
					System.out.println("not enough seats available !..");
					return false;
				}
				double totalAmount = 0;
				if(snack2.equals("yes")){
					  System.out.println("Thank You :) ");
					
					 totalAmount=movie.getTicketPrice()*seats +380;
				
				} else if(snack2.equals("no")){
					  System.out.println("Thank You :)");
					  totalAmount=movie.getTicketPrice()*seats;
				}else {
					System.out.println("Enter the valid Answer");
				}
				
				boolean paymentSuccess=Payment.processPayment(totalAmount);
				String show=movie.getShowTime();
				
				
				
				if(paymentSuccess) {
                 
					//					 movie).bookSeats(seats);
				
					booking.add(new Booking(id,name,yname,seats,totalAmount, show,snack2));
					id++;
					
					System.out.println("BOOKING SUCCESSFUL !.");
					int balance=movie.getAvailableSeats()-seats;
					movie.setAvailableSeats(balance);
					return true;
				}else {
					System.out.println("Payment failed booking not completed");
					return false;
				}
			}
		}
		System.out.println("invalid movie id");
		return false;
	}

	
	
	
	// show booking method
   public void showBooking(String checkname, String moviename) {
	   for(Booking book:booking) {
		   if(checkname.equals(book.getYname())&& moviename.equals(book.getName())) {
			System.out.println(book);
		}else {
			System.out.println("invalid input");
		}
	
   }
}
}