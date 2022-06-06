
public class Wilder {
	// attributes
	private String firstname;
	private Boolean aware;
	
	//constructor
	public Wilder (String firstname, Boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	
	// getters
	public String getFirstname() {
		return this.firstname;		
	}
	
	public Boolean isAware() {
		return this.aware;
	}
	
	// setters
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setAware(Boolean aware) {
		this.aware = aware;
	}
	
	// instance methods
	public String whoAmI()  {
		if(this.aware) {
			return "Je m'appelle " + this.firstname + " et je suis aware";
		} else {
			return "Je m'apelle " + this.firstname + " et je ne suis pas aware";
		}
	}
}
