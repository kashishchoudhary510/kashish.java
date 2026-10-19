//Single Inheritance — Vehicle and Car//
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    String model = "Fortuner";

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car c = new Car();

        c.start();       // Inherited method
        c.displayCar();  // Car's own method
    }
}

//Multilevel Inheritance — Person, Employee, and Manager//


class Person {
    String name = "Rahul";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department = "IT";

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.displayPerson();   // Inherited from Person
        m.displayEmployee(); // Inherited from Employee
        m.displayManager();  // Manager's own method
    }
}


// Hierarchical Inheritance — Shape, Circle, and Rectangle//


class Shape {
    String color = "Blue";

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius = 5.0;

    void area() {
        System.out.printf("Circle area: %.2f%n",
                          Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    double length = 4.0;
    double width = 3.0;

    void area() {
        System.out.printf("Rectangle area: %.2f%n",
                          length * width);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle:");
        c.displayColor(); // Inherited from Shape
        c.area();

        System.out.println("\nRectangle:");
        r.displayColor(); // Inherited from Shape
        r.area();
    }
}

