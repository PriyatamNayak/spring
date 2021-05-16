package co.edureka.spring.core.model;

public class User {
	private String firstName;
	private String lastName;

	public User() {
		System.out.println("---inside zero argument constructor ---");
	}

	public User(String firstName, String lastName) {
		System.out.println("--- inside 2 argument constructor ---");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("### inside setFirstName() method ###");
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("### inside setLastName() method ###");
	}

	@Override
	public String toString() {
		return "User [First Name= " + firstName + " |LastName= " + lastName + "]";
	}
}
