package apjfsa;
import java.util.Stack;
public class City {
  String name;
 private double literacypercentage;

public City(String name, double literacyPercentage) {
    this.name = name;
    this.literacypercentage = literacyPercentage;
}

public String getName() {
    return name;
}

public double getLiteracyPercentage() {
    return literacypercentage;
}

@Override
public String toString() {
    return name + " - " + literacypercentage + "%";
}




public static void main(String[] args) {
    Stack<City> stack = new Stack<>();

    // Push cities with their literacy percentages onto the stack
    stack.push(new City("Telangana", 66.54));
    stack.push(new City("Kerala", 95.12));
    stack.push(new City("Andhra Pradesh", 72.67));
    stack.push(new City("Madhya Pradesh", 70.21));

    // Print the stack
    System.out.println("Cities in the stack:");
    System.out.println(stack);


    // Example of retrieving the top city based on literacy percentage
    City topCity = stack.peek();
    if (topCity != null) {
        System.out.println("Top city based on literacy percentage: " + topCity.getName());
    }

    // Example of searching for a city in the stack
    String searchCity = "Andhra Pradesh";
    for (City city : stack) {
        if (city.getName().equalsIgnoreCase(searchCity)) {
            System.out.println(searchCity + " found in the list with literacy percentage: " + city.getLiteracyPercentage());
            break;
        }
    }
}
}