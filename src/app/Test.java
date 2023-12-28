package app;

/**
 * This Test class demonstrates the Person objects
 * and their methods.
 */
public class Test {

	/**
	 * The main method is the entry point of the
	 * program. We create Person objects, perform 
	 * equality tests and output the equality to the user.
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create new Person objects.
		Person person1 = new Person("Justine", "Reha");
		Person person2 = new Person("Brianne", "Reha");
		Person person3 = new Person(person1);
		
		// Test object equality.
		if(person1 == person2)
			System.out.println("These persons are identical using ==");
		else
			System.out.println("These persons are not identical using ==");
		
		// Test object equality.
		if(person1.equals(person2))
			System.out.println("These persons are identical using equals()");
		else
			System.out.println("These person are not identical using equals()");
		
		// Test Copy constructor.
		if(person1.equals(person3))
			System.out.println("These copied person is identical using equals()");
		else
			System.out.println("These copied person is not identical using equals()");
		
		// Print the objects.
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3);
	}
}
