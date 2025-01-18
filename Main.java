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
        System.out.println("\n--- Buy Car Details ---");
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
        System.out.println("\n--- Rental Car Details ---");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Rental Price per Day: $" + rentalPricePerDay);
    }
}

// Main Class to test the implementation
class CarManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to the Car Management System!");
            System.out.println("Do you want to 'buy' or 'rent' a car?");
            String carType = scanner.nextLine().trim().toLowerCase();

            System.out.print("Enter car make: ");
            String make = scanner.nextLine().trim();

            System.out.print("Enter car model: ");
            String model = scanner.nextLine().trim();

            switch (carType) {
                case "buy" -> {
                    System.out.print("Enter car price: ");
                    double price = scanner.nextDouble();
                    BuyCar buyCar = new BuyCar(make, model, price);
                    buyCar.displayDetails();
                }
                case "rent" -> {
                    System.out.print("Enter rental price per day: ");
                    double rentalPricePerDay = scanner.nextDouble();
                    RentalCar rentalCar = new RentalCar(make, model, rentalPricePerDay);
                    rentalCar.displayDetails();
                }
                default -> System.out.println("Invalid option. Please enter 'buy' or 'rent'.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred. Please check your input and try again.");
        } finally {
            scanner.close();
        }
    }
}
