import java.util.Scanner;

public class Owner {
	protected String firstName;
	protected String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Owner() {
		super();
		this.firstName ="";
		this.lastName ="";
	}
	public Owner (String firstName, String lastName) {
		super();
	}
	@Override
	public String toString() {
		return "Owner [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public void display() {
		System.out.println(toString());
	}	
	public String getFullName() {
		return String.format("%s, %s", firstName, lastName);
	}

	
}
