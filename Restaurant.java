package businessRegistry;

import java.util.Arrays;

public class Restaurant extends Business {
	private boolean driveThru;
	private boolean mobileOrdering;
	private String[] lisMeals;
	private int rating;
	private int numSeats;
	
	@Override
	public String toString() {
		String driveThruBool;
		String mobileOrderBool;
		
		//Getting string for if the restaurant has drive thru
		if(getDriveThru()) {
			driveThruBool = "Yes";
		} else {
			driveThruBool = "No";
		}
		
		//Getting string for if restaurant has mobile ordering
		if(getMobileOrdering()) {
			mobileOrderBool = "Yes";
		} else {
			mobileOrderBool = "No";
		}
		
		//Printing the string
		String s = "Drive Thru: " + driveThruBool 
					+ "\nMobile Ordering: " + mobileOrderBool 
					+ "\nList of Entrees: " + Arrays.toString(getLisMeals()) 
					+ "\nRestaurant Rating: " + getRating() 
					+ "\nNumber of seats in Restaurant: " + getNumSeats();
		return s;
	}
	
	/**
	 * Gets boolean for if restaurant has a drive thru
	 * 
	 * @return driveThru The boolean for if restaurant has a drive thru
	 */
	public boolean getDriveThru() {
		return driveThru;
	}
	
	/**
	 * Gets boolean for if restaurant has a mobile ordering
	 * 
	 * @return driveThru The boolean for if restaurant has mobile ordering
	 */
	public boolean getMobileOrdering() {
		return mobileOrdering;
	}
	
	/**
	 * Gets list of restaurant meals
	 * 
	 * @return lisMeals List of restaurant meals
	 */
	public String[] getLisMeals() {
		return lisMeals;
	}
	
	/**
	 * Gets the restaurant's rating
	 * 
	 * @return rating The restaurant's rating
	 */
	public int getRating() {
		return rating;
	}
	
	/**
	 * Gets the number of seats in the restaurant
	 * 
	 * @return numSeats The number of seats in the restaurant
	 */
	public int getNumSeats() {
		return numSeats;
	}
	
	/**
	 * Sets the boolean for if restaurant has a drive thru
	 * 
	 * @param driveThru The boolean for if restaurant has a drive thru
	 */
	public void setDriveThru(boolean driveThru) {
		this.driveThru = driveThru;
	}
	
	/**
	 * Sets boolean for if restaurant has a mobile ordering
	 * 
	 * @param mobileOrdering The boolean for if restaurant has mobile ordering
	 */
	public void setMobileOrdering(boolean mobileOrdering) {
		this.mobileOrdering = mobileOrdering;
	}
	
	/**
	 * Sets list of restaurant meals
	 * 
	 * @param lisMeals List of restaurant meals
	 */
	public void setLisMeals(String[] lisMeals) {
		this.lisMeals = lisMeals;
	}
	
	/**
	 * Sets the restaurant's rating
	 * 
	 * @param rating The restaurant's rating
	 * @throws IllegalBusiness If rating is less than 1 or greater than 5
	 */
	public void setRating(int rating) throws IllegalBusiness {
		if (rating < 1 || rating > 5) {
			throw new IllegalBusiness("Rating Must be Between 1 and 5!");
		}
		this.rating = rating;
	}
	
	//Throws IllegalBusiness if number of seats is less than 1
	public void setNumSeats(int numSeats) throws IllegalBusiness{
		if (numSeats < 1) {
			throw new IllegalBusiness("Number of Seats cannot be less than 1!");
		}
		this.numSeats = numSeats;
	}		
}
