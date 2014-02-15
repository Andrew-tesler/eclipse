

public class Volunteer extends Person{
	
	
	private Certification _certification;
	private String _startDate;
	
	private final String _empty = "--";
	
	public Volunteer() {
		this._certification = new Certification();
		this._startDate = this._empty;
	}
	
	
	public Volunteer(Person other,Certification certification,String start) {
		super (other);
		this._certification = certification;
		this._startDate = start;
	}
	
	public Certification getCertification() {
		return this._certification;
	}

	public String getDate() {
		return this._startDate;
	}
	
	public String toString () {
		String message = super.toString();
		message += "Volunteer\n";
		message += "Start date:\t"+getDate()+"\n";
		message += "Certification\n";
		message += getCertification();
		return  message;
	}
}
