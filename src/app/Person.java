package app;

/**
 * This Person class represents a person
 * with first and last names.
 */
public class Person {
	private String firstName = "Mark";
	private String lastName = "Reha";
	
	/**
	 * Constructor for Person class object with
	 * the given first and last names.
	 * @param firstName, the first name of the person.
	 * @param lastName, the last name of the person.
	 */
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * Constructor for Person class object
	 * as a copy of another Person object.
	 * @param person, the person object to be copied.
	 */
	public Person(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
	}
	
	/**
	 * Method to retrieve the
	 * first name of the person.
	 * @return, the first name of the person.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Method to retrieve the
	 * last name of the person.
	 * @return, the last name of the person.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Method to compare this Person object 
	 * to another object for equality.
	 * @param other, the object to compare to this person.
	 * @return true if objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object other) {
		if(other == this) {
			System.out.println("I am here in other == this");
			return true;
		}
		if(other == null) {
			System.out.println("I am here in other == null");
			return false;
		}
		if(getClass() != other.getClass()) {
			System.out.println("I am here in getClass() != other.getClass()");
			return false;
		}
		Person person = (Person)other;
		return (this.firstName == person.firstName && this.lastName == person.lastName);
	}
	
	/**
	 * Method to provide a string representation
	 * of the Person object.
	 * @return a string representing the Person object.
	 */
	@Override
	public String toString() {
		return "My class is " + getClass() + " " + this.firstName + " " + this.lastName;
	}
}
