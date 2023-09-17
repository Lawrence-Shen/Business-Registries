package businessRegistry;

import java.util.Arrays;

public class TravelPlaza extends Business{
	private String[] diningOptions;
	private String[] shoppingOptions;
	private boolean fuel;
	
	@Override
	public String toString() {
		String fuelBool;

		if(getFuel()) {
			fuelBool = "Yes";
		} else {
			fuelBool = "No";
		} 
		
		String s = "Restaurants in Plaza: " + Arrays.toString(getDiningOptions()) 
					+ "\nStores in Plaza: " + Arrays.toString(getShoppingOptions())
					+ "\nFuel Services: " + fuelBool;
		return s;
	}
	
	public String[] getDiningOptions() {
		return diningOptions;
	}
	
	public String[] getShoppingOptions() {
		return shoppingOptions;
	}
		
	public boolean getFuel() {
		return fuel;
	}
	
	public void setDiningOptions(String[] diningOptions) {
		this.diningOptions = diningOptions;
	}
	
	public void setShoppingOptions(String[] shoppingOptions) {
		this.shoppingOptions = shoppingOptions;
	}
	
	public void setFuel(boolean fuel) {
		this.fuel = fuel;
	}
}
