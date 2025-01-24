package Booking_System;

public class Booking {
	private int id=1;
	private String name;
	private String yname;
	private int seats;
	private double totalAmount;
	private String showTime;
	private String snack2;
	public Booking(int id, String name, String yname, int seats, double totalAmount, String showTime, String snack2) {
		super();
		this.id = id;
		this.name = name;
		this.yname = yname;
		this.seats = seats;
		this.totalAmount = totalAmount;
		this.showTime = showTime;
		this.snack2 = snack2;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the yname
	 */
	public String getYname() {
		return yname;
	}

	/**
	 * @param yname the yname to set
	 */
	public void setYname(String yname) {
		this.yname = yname;
	}

	/**
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * @param seats the seats to set
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the showTime
	 */
	public String getShowTime() {
		return showTime;
	}

	/**
	 * @param showTime the showTime to set
	 */
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	/**
	 * @return the snack2
	 */
	public String getSnack2() {
		return snack2;
	}

	/**
	 * @param snack2 the snack2 to set
	 */
	public void setSnack2(String snack2) {
		this.snack2 = snack2;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", name=" + name + ", yname=" + yname + ", seats=" + seats + ", totalAmount="
				+ totalAmount + ", showTime=" + showTime + ", snack2=" + snack2 + "]";
	} 
	
	


	
	
	
}

