package lab4;

public class Person {
	//atribute
	private String name, email;
	
	//gettere
	String getName() {
		return name;
	}
	String getEmail() {
		return email;
	}
	
	//settere
	void setName(String newName) {
		this.name=newName;
	}
	void setEmail(String newEmail) {
		this.email=newEmail;
	}
}
