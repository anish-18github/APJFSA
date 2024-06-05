package Lab5;

public class Citizen extends Person{
	private String citizenship;

	
	public Citizen(String firstName, String lastName, String citizenship) {
		super(firstName, lastName);
		this.citizenship = citizenship;
	}


	public String getCitizenship() {
		return citizenship;
	}


//	public void setCitizenship(String citizenship) {
//		this.citizenship = citizenship;
//	}
//	
	
}
