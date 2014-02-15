/**
 * Date class for date implementation
 * 
 * @author Andrew
 *
 */
public class Date {
	
	private int _day;
	private int _month;
	private int _year;
	
	private boolean _set;
	
	// Initialize new Date with empty values
	public Date() {
		this._day=0;
		this._month=0;
		this._year=1970;

		this._set = true;
	}
	
	/**
	 * Set values for date must be between 0-31 for day
	 * 0-12 for month
	 * 
	 * @param day  of the month.
	 * @param month  number. 
	 * @param year  number.
	 */
	public Date(int day,int month,int year) {
		// Test if day is between 0 - 31
		// If true set the day, if false set to zero
		if (day <= 31 &  day >= 0) 
			this._day = day;
		else 
			this._day = 0;
		// Test if month is between 0-12
		// If true set the month if false set to zero
		if (month <= 12 & month >= 0)
			this._month = month;
		else
			this._month = 0;
		//Set year
		this._year = year;	
		this._set = true;
	}
	
	
	

	/**
	 * Return String representation of date in the format DD/MM/YYYY
	 * TODO replace direct values to get... methods.
	 */
	public String toString() {
		String print="";
		// Print the day 
		if (this._day < 10 & this._day >= 1)
			print += "0"+this._day+"/";
		else if (this._day == 0) // If Day zero don't print it
			print += "";
		else 
			print += this._day+"/";
		
		if (this._month < 10 & this._month >= 1)
			print += "0"+this._month+"/";
		else if (this._month == 0) // If month zer don't print it
			print += "";
		else 
			print += this._month+"/";

		print += this._year;

		return print;
	}
	
	
	
	
}
