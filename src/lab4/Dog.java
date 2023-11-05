package lab4;

public class Dog {
	String name;
	String breed;
	
	Dog() {
		this.name="Pufi";
		this.breed="Bichon";
	}
	
	void get() {
		System.out.println("name: " + this.name);
		System.out.println("breed: " + this.breed);
	}
	
	void set(String x, String y) {
		this.name=x;
		this.breed=y;
	}
}
