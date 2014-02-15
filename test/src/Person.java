

public class Person {
	private String _firstName;
	private String _familyName;
	private String _sex;
	private String _birthDay;
	private String _telephone;
	
	private final String _empty = "--";
	
	// Constructors
	/**
	 * empty person constructor
	 */
	public Person() {
		this._firstName = this._empty;
		this._familyName = this._empty;
		this._sex = this._empty;
		this._birthDay = this._empty;
		this._telephone = this._empty;
		
	}
	/**
	 * Constructor that represents Person Class. Sex must be "M" or "F" otherwise it will be "--"
	 * @param firstName String
	 * @param familyName String
	 * @param sex String 
	 */
	public Person(String firstName,String familyName ,String sex,String date,String telephone) {
		this._firstName = firstName;
		this._familyName = familyName;
		if (sex == "M" || sex == "F")
			this._sex = sex;
		else 
			this._sex = _empty;
		this._birthDay=date;
		this._telephone = telephone;
		
		
}
	/**
	 * Copy constructor
	 * @param other
	 */
	public Person(Person other) {
		this._firstName = other._firstName;
		this._familyName = other._familyName;
		this._sex = other._sex;
		this._birthDay = other._birthDay;
		this._telephone = other._telephone;
	}
	
	/**
	 * 
	 * @param firstName String
	 * @param familyName String
	 */
	public Person (String firstName,String familyName) {
		this._firstName = firstName;
		this._familyName = familyName;
		this._sex = this._empty;
		this._birthDay = this._empty;
		this._telephone = this._empty;
	}
	

	/**
	 * Set first Name
	 * @param name first name
	 */
	public void setFirstName (String name) {
		this._firstName = name;
	}
	
	/**
	 * Set Family Name
	 * @param family name
	 */
	public void setFamilyName (String family) {
		this._familyName = family;
	}
	
	/**
	 * set sex
	 * @param sex gender
	 */
	public void setSex (String sex) {
		this._sex = sex;
	}
	
	public void setDate (String date) {
		this._birthDay = date;
	}
	/**
	 * return First Name
	 * @return First Name
	 */
	public String getFirstName () {
		return this._firstName;
	}
	
	/**
	 * Returns family name
	 * @return family name
	 */
	public String getFamilyName() {
		return this._familyName;
	}
	
	/**
	 * Return Gender
	 * @return Sex
	 */
	public String getSex() {
		return this._sex;
	}
	
	public String getTelephone() {
		return this._telephone;
	}
	
	/**
	 * Print Person:
	 * First name:
	 * Family name:
	 * Sex name:
	 */
	public String toString() {
		String printName = getFirstName();
		String printFamily = getFamilyName();
		String printSex = getSex();
		// Format birth day.
		
		return "FirstName:\t"+printName+"\nFamily Name:\t"+printFamily+"\nGender:\t\t"+printSex+"\nBirth day:\t"+this._birthDay+"\n"+"Telephone:\t"+getTelephone()+"\n";
	}
	
	
}