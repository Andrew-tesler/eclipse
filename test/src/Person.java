
public class Person {
	private String _firstName;
	private String _familyName;
	private String _sex;

	
	// Constructors
	/**
	 * empty person constructor
	 */
	public Person() {
		_firstName = "";
		_familyName = "";
		_sex = "";
	}
	/**
	 * Constructor that represents Person Class. Sex must be "M" or "F" otherwize it will be "--"
	 * @param firstName String
	 * @param familyName String
	 * @param sex String 
	 */
	public Person(String firstName,String familyName ,String sex) {
		this._firstName = firstName;
		this._familyName = familyName;
		if (sex == "M" || sex == "F")
			this._sex = sex;
		else 
			this._sex = "--";
}
	
	/**
	 * 
	 * @param firstName String
	 * @param familyName String
	 */
	public Person (String firstName,String familyName) {
		this._firstName = firstName;
		this._familyName = familyName;
		this._sex = "--";
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
		
		return "FirstName:\t"+printName+"\nFamily Name:\t"+printFamily+"\nGender:\t\t"+printSex;
	}
	
	
}