//This program stores data related to a Commerce Company, which operates a variety of
//businesses, including restaurants, supermarkets, and roadside travel plazas. It allows for 
//the reading and setting of business data
package businessRegistry;

import java.util.ArrayList;

public class Registry {
	//Holds all Business Types
	private static ArrayList<Business> businessCollection = new ArrayList<>();
	
	/**
	 * Adds a Business object to the businessCollection array
	 * 
	 * @throws IllegalBusiness
	 */
	public static void addBusiness() throws IllegalBusiness{
		Business business = new Business();
		businessCollection.add(business);
	}
	
	/**
	 * Prints the businessCollection array
	 */
	public static void printRegistry() {
		for(Business b: businessCollection) {
			System.out.println(b);
			System.out.println();
		}
	}
	
	/**
	 * Calculates the average of each Business object's dailySales
	 * 
	 * @return the average of the daily sales
	 */
	public static double averageDailySales() {
		double sum = 0;
		
		for(Business b: businessCollection) {
			sum += b.getDailySales();
		}
		
		double averageDailySales = sum/businessCollection.size();
		return averageDailySales;
	}
	
	/**
	 * Calculates the average of each Business object's annualSales
	 * 
	 * @return the average of annual sales
	 */
	public static double averageYearlySales() {
		double sum = 0;
		
		for(Business b: businessCollection) {
			sum += b.getAnnualSales();
		}
		
		double averageYearlySales = sum/businessCollection.size();
		return averageYearlySales;
	}
	
	/**
	 * Testing assignment/exception code
	 * Tests for getter methods built into .toString() methods
	 * 
	 * @param args
	 * @throws IllegalBusiness
	 */
	public static void main(String[] args) throws IllegalBusiness{
		//Creating 3 Business objects to test averageDailySales and averageAnnualSales
		//Only the Business in index[1] will be used for rest of methods/attributes
		addBusiness();
		addBusiness();
		addBusiness();
		//Creating Subclass objects to test setters/toString/Exceptions
		Restaurant mcDonalds = new Restaurant();
		Supermarket loblaws = new Supermarket();
		TravelPlaza eatonCenter = new TravelPlaza();

		//businessCollection.get(0).setDailySales(0);  //Exception for $0
		businessCollection.get(1).setDailySales(4000);
		businessCollection.get(2).setDailySales(2000);
		System.out.println(averageDailySales());
		
		//businessCollection.get(0).setAnnualSales(0); //Exception for $0
		businessCollection.get(1).setAnnualSales(6000);
		businessCollection.get(2).setAnnualSales(15000);
		System.out.println(averageYearlySales());
		
		businessCollection.get(1).setRegistrationNumber(23456);
		businessCollection.get(1).setYear(1999);
		businessCollection.get(1).owner.setName("Lawrence");
		//businessCollection.get(1).owner.setAge(12); //Exception for age less than 18
		businessCollection.get(1).owner.setAge(20);
		//businessCollection.get(1).owner.setBusinessYears(2000); //Exception for over 110 years
		businessCollection.get(1).owner.setBusinessYears(20);
		System.out.println(businessCollection.get(1));
		System.out.println();
		
		//Testing Restaurant Class code 
		mcDonalds.setDriveThru(true);
		mcDonalds.setMobileOrdering(false);
		mcDonalds.setLisMeals(new String[] {"Big Mac", "Cheeseburger", "Happy Meal"});
		//mcDonalds.setRating(16); //Exception: Rating must be between 1 and 5
		mcDonalds.setRating(1);
		//mcDonalds.setNumSeats(0); //Exception: Cannot have less than 1 seat
		mcDonalds.setNumSeats(200);
		System.out.println(mcDonalds);
		System.out.println();
		
		//Testing Supermarket Class code
		loblaws.setLisDepartments(new String[] {"Grocery", "Meat", "Produce"});
		loblaws.setLoyaltyUsers(2000);
		loblaws.setNumProducts(100);
		System.out.println(loblaws);
		System.out.println();
		
		//Testing TravelPlaza Class code
		eatonCenter.setDiningOptions(new String[] {"Thai Express", "Starbucks", "Manchu Wok"});
		eatonCenter.setFuel(false);
		eatonCenter.setShoppingOptions(new String[] {"H&M", "Nordstrom", "Apple Store"});
		System.out.println(eatonCenter);
		System.out.println();
		
		System.out.println("***TESTING PringRegistry***");
		printRegistry();
	}

}
