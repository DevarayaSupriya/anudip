package apjfsa;
public class Person{
    // Instance variables
    String name;
    int age;

    // Constructor
    public Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {
        // Create an object of the Person class
        Person person1 = new Person("John", 30);

        // Call the displayInfo method to display information about the person
        person1.displayInfo();

    }
}
	


