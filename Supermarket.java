package businessRegistry;

import java.util.Arrays;

public class Supermarket extends Business {
	private int numProducts;
	private double loyaltyUsers;
	private String[] lisDepartments;

	@Override
	public String toString() {
		String s = "Number of Products in Inventory: " + getNumProducts() 
					+ "\nPercentage of Clients as Loyalty Members: " + getLoyaltyUsers() 
					+ "\nList of Departments: " + Arrays.toString(getLisDepartments());
		return s;
	}
	
	public int getNumProducts() {
		return numProducts;
	}
	
	public double getLoyaltyUsers() {
		return loyaltyUsers;
	}
	
	public String[] getLisDepartments() {
		return lisDepartments;
	}
	
	public void setNumProducts(int numProducts) {
		this.numProducts = numProducts;
	}
	
	public void setLoyaltyUsers(double loyaltyUsers) {
		this.loyaltyUsers = loyaltyUsers;
	}
	
	public void setLisDepartments(String[] lisDepartments) {
		this.lisDepartments = lisDepartments;
	}
}
