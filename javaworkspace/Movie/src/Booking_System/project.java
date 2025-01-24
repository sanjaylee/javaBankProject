package Booking_System;

import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieBookingSystem system = new MovieBookingSystem();
        Scanner scanner = new Scanner(System.in);
       

        System.out.println("Welcome to the Movie Booking System!");
     
        boolean start=true;
        while (start) {
            System.out.println("\nMenu:");
            System.out.println("1. Show Movies");
            System.out.println("2. Book Movie");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            

            switch (choice) {
                case 1:
                    system.showMovies();
                    break;

                case 2:
                	 System.out.print("Enter Your Name to book: ");
                	 String yname=scanner.nextLine();
                	 
                    System.out.print("Enter Movie Name to book: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter number of seats: ");
                    int seats = scanner.nextInt();
                    scanner.nextLine();

                    MovieBookingSystem obj=new MovieBookingSystem();
                    System.out.println(obj.snack);
                    System.out.print("Do You Want combo pack Snacks ADD 380 Rupes,pls Say(Yes/No)");
                    String snack=scanner.nextLine();
                  
				try {
					system.bookMovie( yname,name, seats,snack);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    break;

                case 3:
                	System.out.print("Enter your Name :");
                	String checkname=scanner.nextLine();
                	System.out.print("Enter movie Name :");
                	String moviename=scanner.nextLine();
                	
                    system.showBooking(checkname,moviename);
                    break;

                case 4:
                	
                	 System.out.println("Thank you for using the Movie Booking System!");
                	 start=false;
                	 scanner.close();
                	 
                     break;   
                    

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


	}


