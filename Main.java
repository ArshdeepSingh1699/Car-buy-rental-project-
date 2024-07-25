import java.util.Scanner;

// Abstract Class Car demonstrating Abstraction
abstract class Car {
    private String make;
    private String model;
    
    // Constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    // Getters and Setters demonstrating Encapsulation
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    // Abstract method
    public abstract void displayDetails();
}

// Class BuyCar demonstrating Inheritance and Polymorphism
class BuyCar extends Car {
    private double price;
    
    // Constructor
    public BuyCar(String make, String model, double price) {
        super(make, model);
        this.price = price;
    }
    
    // Overriding the abstract method
    @Override
    public void displayDetails() {
        System.out.println("Buy Car Details:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Price: $" + price);
    }
}

// Class RentalCar demonstrating Inheritance and Polymorphism
class RentalCar extends Car {
    private double rentalPricePerDay;
    
    // Constructor
    public RentalCar(String make, String model, double rentalPricePerDay) {
        super(make, model);
        this.rentalPricePerDay = rentalPricePerDay;
    }
    
    // Overriding the abstract method
    @Override
    public void displayDetails() {
        System.out.println("Rental Car Details:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Rental Price per Day: $" + rentalPricePerDay);
    }
}

// Main Class to test the implementation
public class CarManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car type (buy/rent): ");
        String carType = scanner.nextLine();

        System.out.println("Enter car make: ");
        String make = scanner.nextLine();

        System.out.println("Enter car model: ");
        String model = scanner.nextLine();

        if (carType.equalsIgnoreCase("buy")) {
            System.out.println("Enter car price: ");
            double price = scanner.nextDouble();
            BuyCar buyCar = new BuyCar(make, model, price);
            buyCar.displayDetails();
        } else if (carType.equalsIgnoreCase("rent")) {
            System.out.println("Enter rental price per day: ");
            double rentalPricePerDay = scanner.nextDouble();
            RentalCar rentalCar = new RentalCar(make, model, rentalPricePerDay);
            rentalCar.displayDetails();
        } else {
            System.out.println("Invalid car type.");
        }

        scanner.close();
    }
}
