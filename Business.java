package businessRegistry;

public class Business {
	private int registrationNumber;
	FranchiseOwner owner = new FranchiseOwner();
	private int year;
	private double dailySales;
	private double annualSales;
	
	@Override
	public String toString() {
		String s = "Registration Number: " + getRegistrationNumber()
					+ "\nYear Business Opened: " + getYear() 
					+ "\nAverage Dollar Amount of Daily Sales: " + getDailySales() 
					+ "\nAverage Dollar Amount of Annual Sales: " + getAnnualSales() 
					+ "\n\n" + owner.toString();
		return s;
	}
	
	/**
	 * Gets the business' registration number
	 * 
	 * @return registrationNumber The business' registration number
	 */
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	
	/**
	 * Gets the year that the business opened its doors
	 * 
	 * @return year The year the business opened
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Gets the business' daily sales
	 * 
	 * @return dailySales The daily sales
	 */
	public double getDailySales() {
		return dailySales;
	}
	
	/**
	 * Gets the business' annual sales
	 * 
	 * @return annualSales The annual sales
	 */
	public double getAnnualSales() {
		return annualSales;
	}
	
	/**
	 * Gets the business' Franchise Owner Object
	 * 
	 * @return owner The business' Franchise Owner Object
	 */
	public FranchiseOwner getFranchiseOwner() {
		return owner;
	}
	
	/**
	 * Sets the business' registration number
	 * 
	 * @param registrationNumber The business' registration number
	 */
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	/**
	 * Sets the year the business opened
	 * 
	 * @param year The year the business opened
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Sets the business' daily sales
	 * 
	 * @param dailySales the business' daily sales
	 * @throws IllegalBusiness If the daily sales entered is 0
	 */
	public void setDailySales(double dailySales) throws IllegalBusiness{
		if (dailySales == 0) {
			throw new IllegalBusiness("Daily Sales cannot be 0!");
		}
		this.dailySales = dailySales;
	}
	
	/**
	 * Sets the business' annual sales
	 * 
	 * @param annualSales the business' annual sales
	 * @throws IllegalBusiness If the annual sales entered is 0
	 */
	public void setAnnualSales(double annualSales) throws IllegalBusiness{
		if (annualSales == 0) {
			throw new IllegalBusiness("Annual Sales cannot be 0!");
		}
		this.annualSales = annualSales;
	}
	
	/**
	 * Uses the FranchiseOwner's setters to set its attributes
	 * Sets the owner's name, age, and number of years they have been in the industry
	 * 
	 * @param name The owner's name
	 * @param age The owner's age
	 * @param businessYears The number of year the owner's been in the industry
	 * @throws IllegalBusiness If the owner's age is less than 18, or if number of years in industry is over 110
	 */
	public void setFranchiseOwner(String name, int age, int businessYears) throws IllegalBusiness{
		this.owner.setName(name);
		this.owner.setAge(age);
		this.owner.setBusinessYears(businessYears);
	}
}
