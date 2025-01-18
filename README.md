This Java code demonstrates concepts of object-oriented programming such as abstraction, encapsulation, inheritance, and polymorphism through a car management system with a user-friendly command-line interface (CLI).


Abstract Class Car:

• This abstract class represents a generic car with attributes make and model.

• It has a constructor to initialize these attributes and getters to retrieve their values.

• It contains an abstract method displayDetails() that must be implemented by subclasses.


Class BuyCar:

• This class inherits from Car and represents a car that can be bought.

• It has an additional attribute price.

• It overrides the displayDetails() method to display details specific to a car that is bought, including the price.



Class RentalCar:

• This class inherits from Car and represents a car that can be rented.

• It has an additional attribute rentalPricePerDay.

• It overrides the displayDetails() method to display details specific to a car that is rented, including the rental price per day.



Main Class CarManagementSystem:

• This class contains the main method to run the program.

• It prompts the user to choose a car type (buy or rent) and enter details like make, model, and price or rental price per day.

• Depending on the input, it creates an instance of either BuyCar or RentalCar.

• It uses the overridden displayDetails() method to display the relevant car details in a user-friendly format.

• Implements error handling for invalid car types or incorrect inputs.



Additional Features of the Convenient CLI Code:

1. Enhanced Usability:

Clear prompts guide the user through the input process.

Handles invalid inputs (e.g., non-numeric prices) with appropriate messages.



2. Simplified Logic:

Focuses on concise and readable code by minimizing repetitive structures.

Ensures easy adaptability for adding new car types or features in the future.



3. Streamlined Output:

Displays results in a clean and formatted manner for better readability.
