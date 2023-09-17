package BusinessRegistry;

public class FranchiseOwner {
	private String name;
	private int age;
	private int businessYears;

	@Override
	public String toString() {
		String s = "Franchise Owner Name: " + getName() 
					+ "\nOwner Age: " + getAge() 
					+ "\nNumber of Years Owner has been in this Industry: " + getBusinessYears();
		return s;
	}
	
	/**
	 * Gets the franchise owner's name
	 * 
	 * @return name The franchise owner's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the franchise owner's age
	 * 
	 * @return age The franchise owner's age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Gets the number of years franchise owner has been in the industry
	 * 
	 * @return businessYears The number of years franchise owner has been in the industry
	 */
	public int getBusinessYears() {
		return businessYears;
	}
	
	/**
	 * Sets the franchise owner's name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Sets the franchise owner's age
	 * 
	 * @param age The franchise owner's age
	 * @throws IllegalBusiness If franchise owner age is set to less than 18
	 */
	public void setAge(int age) throws IllegalBusiness{
		if (age < 18) {
			throw new IllegalBusiness("Franchise Owner Age cannot be less than 18!");
		}
		this.age = age;
	}
	
	/**
	 * Sets the number of years franchise owner has been in the industry
	 * 
	 * @param businessYears The number of years franchise owner has been in the industry
	 * @throws IllegalBusiness if The number of years franchise owner has been in the industry is set to over 110
	 */
	public void setBusinessYears(int businessYears) throws IllegalBusiness {
		if (businessYears > 110) {
			throw new IllegalBusiness("Owner cannot have Worked in the Industry for more than 110 Years!");
		}
		this.businessYears = businessYears;
	}
}
