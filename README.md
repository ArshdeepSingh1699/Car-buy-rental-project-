# Car-buy-rental-project-
This Java code demonstrates concepts of object-oriented programming such as abstraction, encapsulation, inheritance, and polymorphism through a car management system.

1. **Abstract Class Car**:
    - This abstract class represents a generic car with attributes `make` and `model`.
    - It has a constructor to initialize these attributes and getters to retrieve their values.
    - It contains an abstract method `displayDetails()` that must be implemented by any subclass.

2. **Class BuyCar**:
    - This class inherits from `Car` and represents a car that can be bought.
    - It has an additional attribute `price`.
    - It overrides the `displayDetails()` method to display details specific to a car that is bought, including the price.

3. **Class RentalCar**:
    - This class also inherits from `Car` and represents a car that can be rented.
    - It has an additional attribute `rentalPricePerDay`.
    - It overrides the `displayDetails()` method to display details specific to a car that is rented, including the rental price per day.

4. **Main Class CarManagementSystem**:
    - This class contains the `main` method to run the program.
    - It prompts the user to enter details about the car they are either buying or renting.
    - Depending on the input, it creates an instance of either `BuyCar` or `RentalCar` and displays the car details using the overridden `displayDetails()` method.

In summary, this code provides a simple car management system that leverages object-oriented programming principles to manage and display details of cars that are either bought or rented.
