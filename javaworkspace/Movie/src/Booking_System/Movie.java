package Booking_System;



public class Movie {
	private int id;
	private String name;
	private String genre;
	private Double rating ;
	private int availableSeats =100;
	private Double ticketPrice;
    private String showTime;
	public Movie(int id, String name, String genre, Double rating, 
			 Double ticketPrice,String showTime) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	
		this.ticketPrice = ticketPrice;
		this.showTime = showTime;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


	public String getShowTime() {
		return showTime;
	}


	
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}


	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genre=" + genre + ", rating=" + rating + ", availableSeats="
				+ availableSeats + ", ticketPrice=" + ticketPrice + ", showTime=" + showTime + "]";
	}


	

	
}
