

public class Certification {
	
	private String _CertificationName;
	private String _CertificationDate;
	private int _certificationId;
	
	private final String _empty = "--";
	// Constructors
	
	/**
	 * Empty constructor
	 */
	public Certification() {
		this._CertificationName = this._empty;
		this._CertificationDate = this._empty;
		this._certificationId = 0;
	}
	
	/**
	 *  Construct Certification with given name, initialize all other values to empty.
	 * @param Certification name.
	 */
	public Certification(String name) {
		this._CertificationName = name;
		this._CertificationDate = this._empty;
		this._certificationId = 0;
		
	}
	
	/**
	 * Construct Certification with given name and date, initialize all other values to empty.
	 * @param name Certification name.
	 * @param date Certification Date.
	 */
	public Certification (String name, String date) {
		this._CertificationName = name;
		this._CertificationDate = date;
		this._certificationId = 0;
	}
	
	/**
	 * Construct Certification with given name, date and id.
	 * @param name Certification name.
	 * @param date Certification date.
	 * @param id Certification id.
	 */
	public Certification (String name, String date, int id) {
		this._CertificationName = name;
		this._CertificationDate = date;
		this._certificationId = id;
	}
	

	
	/**
	 * Get Certification Name
	 * @return Name of the certification.
	 */
	public String getName() {
		return this._CertificationName;
	}
	
	/**
	 * Get Certification date.
	 * @return Certification Date
	 */
	public String getDate() {
		return this._CertificationDate;
	}
	
	/**
	 * Get Certification id.
	 * @return Certification id.
	 */
	public int getId() {
		return this._certificationId;
	}
	
	/**
	 * Set Certification Name.
	 * @param name Certification name.
	 */
	public void setName(String name) {
		this._CertificationName = name;
	}
	
	/**
	 * Set Certification Date.
	 * @param date Certification date.
	 */
	public void setDate(String date) {
		this._CertificationDate = date;
	}
	
	/**
	 * Set Certification id number.
	 * @param id
	 */
	public void setId(int id) {
		this._certificationId = id;
	}
	
	
	/**
	 * String to String
	 */
	public String toString() {
		String message = "";
		message += "Name:\t\t"+getName()+"\n"+"Date recived:\t"+getDate()+"\n"+"ID:\t\t"+getId()+"\n";
		return ""+message;
	}
}
