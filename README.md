# Java-OOP-Practice
A simple Java project to practice Object-Oriented Programming (OOP) concepts. This repository includes examples and exercises demonstrating key OOP principles such as encapsulation, inheritance, polymorphism, and abstraction. Ideal for beginners learning Java and OOP fundamentals.
------------------------------------------------------------------------------------------------------------------------

# ✨ Welcome to the Ultimate Guide to OOP in Java! ✨

Object-Oriented Programming (OOP) is a powerful paradigm that revolutionized software development. Instead of just writing sequences of instructions (like in *procedural programming*), OOP lets us model the real world by thinking in terms of **objects** and their interactions. Java was designed from the ground up with OOP in mind!

**Why OOP? 🤔**

* **Modularity:** Code is organized into self-contained objects.
* **Reusability:** Inheritance allows reusing code from existing classes.
* **Maintainability:** Easier to update and fix code within specific objects.
* **Scalability:** Easier to build large, complex systems.
* **Real-World Modeling:** Concepts map well to real-world entities.

> **Analogy:** Imagine building with LEGOs® (OOP) versus carving a statue from a single block of wood (Procedural). LEGOs are modular, reusable, and easier to modify!

---

## Level 1: Beginner 🔰 - Getting Started with Objects

At this level, we'll understand the absolute basics: what classes and objects are, and the first pillar of OOP.

### 1.1 What are Classes and Objects?

* **🔹 Class:** A **blueprint** or template for creating objects. It defines the properties (**fields** or attributes) and behaviors (**methods**) that all objects of that type will have.
    * *Analogy:* A `Car` blueprint defines that cars have a `color`, `model`, and can `drive()`.
* **🔹 Object:** An **instance** of a class. It's a concrete entity created from the class blueprint, existing in memory with its own state (values for its fields).
    * *Analogy:* `myBlueTesla` and `yourRedBMW` are specific objects created from the `Car` class blueprint.

```java
// 📄 Blueprint: The Car class
public class Car {
    // Fields (State/Attributes)
    String color;
    String model;
    int year;

    // Method (Behavior)
    public void drive() {
        System.out.println("Driving the " + color + " " + model + "... 🚗💨");
    }

    // --- Main method to create and use objects ---
    public static void main(String[] args) {
        // Create an object (instance) of Car
        Car myCar = new Car();
        myCar.color = "Blue";
        myCar.model = "Tesla Model S";
        myCar.year = 2024;

        // Create another object
        Car yourCar = new Car();
        yourCar.color = "Red";
        yourCar.model = "BMW X5";
        yourCar.year = 2023;

        // Call methods on objects
        myCar.drive();   // Output: Driving the Blue Tesla Model S... 🚗💨
        yourCar.drive();  // Output: Driving the Red BMW X5... 🚗💨
    }
}
```
# 1.2 🛠️ Constructors
** A constructor is a special method used to initialize a newly created object. It has the same name as the class and no return type.

Default Constructor: If you don't define any constructor, Java provides a hidden, no-argument default constructor.
Parameterized Constructor: Allows you to set initial values for fields when the object is created.
<!-- end list -->

```Java

public class Dog {
    String name;
    String breed;

    // 🐶 Parameterized Constructor
    public Dog(String dogName, String dogBreed) {
        System.out.println("Constructor called! Creating a dog...");
        name = dogName; // 'this.name = dogName;' is more explicit (see Intermediate)
        breed = dogBreed;
    }

    public void bark() {
        System.out.println(name + " says: Woof! 🐕");
    }

    public static void main(String[] args) {
        // Using the parameterized constructor
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        Dog anotherDog = new Dog("Lucy", "Poodle");

        myDog.bark();      // Output: Buddy says: Woof! 🐕
        anotherDog.bark(); // Output: Lucy says: Woof! 🐕
    }
}
```
## 1.3 The First Pillar: 🔐 Encapsulation

**Encapsulation** means bundling data (fields) and the methods that operate on that data within a single unit (the class).  
It also involves **data hiding** – restricting direct access to an object's internal state.

---

### 🔍 Why Use Encapsulation?

- ✅ **Protects data integrity**  
- 🔄 **Allows internal implementation to change without affecting external users**  
- 🔐 **Increases security**

---

### 🛠️ How to Achieve Encapsulation?

- Declare fields as `private` (accessible only within the class).
- Provide `public` methods:
  - **Getters** to retrieve data.
  - **Setters** to modify data with control and validation if needed.

---

### 🏦 Real-World Example: BankAccount

You don't want anyone just directly changing your bank balance!  
You need controlled methods like `deposit()` and `withdraw()`:

```Java

public class BankAccount {
    // 🔐 Private field - hidden from outside direct access
    private double balance;
    private String accountNumber;

    // Constructor
    public BankAccount(String accNum, double initialBalance) {
        this.accountNumber = accNum;
        // Basic validation in setter helps
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0.");
        }
    }

    // Getter for balance (Read-only access)
    public double getBalance() {
        return balance; // Provide controlled access
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter-like method for depositing (Controlled modification)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Setter-like method for withdrawing (Controlled modification)
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
            return true;
        } else if (amount > balance) {
            System.out.println("Withdrawal failed. Insufficient funds.");
            return false;
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("12345", 100.0);

        // Can't do this: myAccount.balance = 1000000; // Compile Error! 🚫 Encapsulation works!

        System.out.println("Account: " + myAccount.getAccountNumber()); // Use getter
        System.out.println("Initial Balance: $" + myAccount.getBalance()); // Use getter

        myAccount.deposit(50.0);
        myAccount.withdraw(30.0);
        myAccount.withdraw(150.0); // Fails
    }
}
```

# 📝 Mini-Quiz 1 ❓

1. What is the difference between a **class** and an **object**?  
2. Why is **encapsulation** important in OOP? Give an example.  
3. What is the purpose of a **constructor**?  

> _(Answers at the end of the guide)_

---

## 🧱 Level 2: Intermediate - Building Relationships & Flexibility

Now we explore how objects relate to each other and how OOP provides flexibility.

---

### 2.1 The Second Pillar: 🧬 Inheritance

**Inheritance** allows a new class (**subclass** or **derived class**) to inherit properties (fields) and methods from an existing class (**superclass** or **base class**).  
It represents an "**Is-A**" relationship.

---

### 🔍 Why Use Inheritance?

- 🔁 **Code reuse**  
- 🧭 **Creating hierarchies**  
- 🔀 Enables **polymorphism** (see next section)

---

### 🧠 Keywords to Know:

- `extends`: Used in the subclass declaration.  
- `super`: Used in the subclass to call superclass constructors or methods.  
- **Method Overriding**:  
  A subclass can provide a specific implementation for a method inherited from its superclass using the `@Override` annotation (optional but recommended).

---

### 🐶 Real-World Example: `Animal → Dog`

```Java

// 🧬 Superclass
class Animal {
    String name;

    public Animal(String name) {
        System.out.println("Animal constructor called.");
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating... 🍖");
    }

    public void makeSound() {
        System.out.println(name + " makes a generic sound.");
    }
}

// 🧬 Subclass inheriting from Animal
class Dog extends Animal {
    String breed;

    // Constructor for Dog - must call superclass constructor
    public Dog(String name, String breed) {
        super(name); // Calls the Animal(String name) constructor
        System.out.println("Dog constructor called.");
        this.breed = breed;
    }

    // Overriding the makeSound method
    @Override // Good practice annotation
    public void makeSound() {
        System.out.println(name + " (a " + breed + ") says: Woof! Woof! 🐕");
    }

    // Dog-specific method
    public void fetch() {
        System.out.println(name + " is fetching the ball! 🎾");
    }

     public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.eat();         // Inherited from Animal
        myDog.makeSound();   // Overridden in Dog
        myDog.fetch();       // Specific to Dog

        Animal genericAnimal = new Animal("Creature");
        genericAnimal.makeSound(); // Calls Animal's method
    }
}
```
# 2.2 📦 Packages & Access Modifiers (Revisited)

**Packages**: Organize related classes and interfaces (like folders for files). Use the `package` keyword at the top.

**Access Modifiers**: Control visibility:
- `public`: Accessible from anywhere.
- `private`: Accessible only within the declaring class. (Used for Encapsulation)
- `protected`: Accessible within the declaring class, its subclasses, and classes in the same package. (Useful for Inheritance)
- `default` (no keyword): Accessible only within the same package. (Package-private)

# 2.3 The Third Pillar: 🔄 Polymorphism

**Polymorphism** means "many forms". It allows objects of different classes to be treated as objects of a common superclass, but still execute their specific overridden methods.   

**Why?** Flexibility, extensibility. You can write code that works with superclass types, but it executes subclass-specific behavior at runtime.

**Types**:
- **Compile-time Polymorphism (Method Overloading)**: Defining multiple methods in the same class with the same name but different parameter lists (different number or type of arguments). The correct method is chosen at compile time.
- **Runtime Polymorphism (Method Overriding)**: A subclass provides its own implementation of a method inherited from a superclass. The correct method (subclass or superclass) is chosen at runtime based on the actual object type. This is closely tied to inheritance.

📱 **Analogy: Smartphone play()**  
A `MusicPlayer` app and a `VideoPlayer` app might both have a `play()` button (method). Clicking `play()` does something different depending on which app (object type) is running.


```Java

class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() { // Runtime Polymorphism (Overriding)
        System.out.println("Drawing a circle. ⚪");
    }

    // Compile-time Polymorphism (Overloading)
    public void draw(String color) {
        System.out.println("Drawing a " + color + " circle. 🎨");
    }
}

class Square extends Shape {
    @Override
    public void draw() { // Runtime Polymorphism (Overriding)
        System.out.println("Drawing a square. 🟥");
    }
}

public class DrawingApp {
    public static void main(String[] args) {
        // Runtime Polymorphism in action
        Shape myShape1 = new Circle(); // Object is Circle, Reference is Shape
        Shape myShape2 = new Square(); // Object is Square, Reference is Shape
        Shape myShape3 = new Shape();

        myShape1.draw(); // Output: Drawing a circle. ⚪ (Circle's draw() is called)
        myShape2.draw(); // Output: Drawing a square. 🟥 (Square's draw() is called)
        myShape3.draw(); // Output: Drawing a generic shape. (Shape's draw() is called)

        System.out.println("---");

        // Need to cast to access Circle-specific methods or overloaded methods
        if (myShape1 instanceof Circle) {
            Circle myCircle = (Circle) myShape1;
            myCircle.draw("blue"); // Output: Drawing a blue circle. 🎨 (Overloaded method)
        }
    }
}
```
# 2.4 The Fourth Pillar: 🔗 Abstraction

**Abstraction** means hiding implementation details and showing only essential features to the user. It helps manage complexity. In Java, abstraction is achieved using **abstract classes** and **interfaces**.

**Why?** Focus on what an object does, not how it does it. Define contracts for subclasses.

### Abstract Class (`abstract` keyword):
- Cannot be instantiated directly.
- Can have both abstract methods (no implementation, declared with `abstract`) and concrete methods (with implementation).
- Can have fields (instance variables).
- Can have constructors (called via `super()` from subclasses).
- A class can extend only one abstract class.
- **Use when** you want to provide a common base with some default implementation and force subclasses to implement certain methods.

### Interface (`interface` keyword):
- Cannot be instantiated directly.
- Traditionally (before Java 8), could only have public abstract methods (the keywords were implicit) and public static final constants.
- Since Java 8, interfaces can also have **default methods** (with implementation) and **static methods** (with implementation).
- Cannot have instance fields (only public static final constants).
- Cannot have constructors.
- A class can implement multiple interfaces.
- **Use when** you want to define a contract of capabilities (methods) that unrelated classes can implement. Represents a "Can-Do" relationship.

📱 **Real-World Example: Smartphone**  
A smartphone can make calls (`Callable`), can play media (`Playable`), etc. These capabilities can be defined as interfaces.

### Comparison Table: Abstract Class vs. Interface

| Feature       | Abstract Class (`abstract class`)                   | Interface (`interface`)                                    |
|---------------|-----------------------------------------------------|------------------------------------------------------------|
| Instantiation | Cannot be instantiated                              | Cannot be instantiated                                     |
| Methods       | Abstract & Concrete methods                         | Abstract methods (implicitly public abstract)<br>Default & Static methods (Java 8+) |
| Fields        | Instance & Static fields allowed                    | Only public static final constants                         |
| Constructors  | Can have constructors                               | Cannot have constructors                                   |
| Inheritance   | Class extends one abstract class                    | Class implements multiple interfaces                       |
| Relationship  | Often represents "Is-A" (stronger coupling)         | Often represents "Can-Do" (contract)                       |
| Purpose       | Provide common base implementation & state          | Define a contract of capabilities                          |



```Java

// 🔗 Interface defining a capability
interface Callable {
    void makeCall(String number); // public abstract implicitly
}

// 🔗 Interface defining another capability
interface Playable {
    void play(); // public abstract implicitly
    void stop(); // public abstract implicitly

    // Java 8+ Default method
    default void displayInfo() {
        System.out.println("This device is Playable.");
    }
}

// 🔗 Abstract class providing some base functionality
abstract class Device {
    private String serialNumber;

    public Device(String serial) { this.serialNumber = serial; }

    public String getSerialNumber() { return serialNumber; }

    // Abstract method - must be implemented by concrete subclasses
    public abstract void powerOn();
}

// Concrete class implementing interfaces and extending an abstract class
class SmartPhone extends Device implements Callable, Playable {
    private String model;

    public SmartPhone(String serial, String model) {
        super(serial); // Call Device constructor
        this.model = model;
    }

    // Implementing abstract method from Device
    @Override
    public void powerOn() {
        System.out.println(model + " powering on...📱");
    }

    // Implementing methods from Callable interface
    @Override
    public void makeCall(String number) {
        System.out.println(model + " calling " + number + "... 📞");
    }

    // Implementing methods from Playable interface
    @Override
    public void play() {
        System.out.println(model + " playing media... ▶️");
    }

    @Override
    public void stop() {
        System.out.println(model + " stopping media... ⏹️");
    }

    // Can optionally override default methods
    @Override
    public void displayInfo() {
         System.out.println(model + " (" + getSerialNumber() + ") is a Playable smartphone.");
    }

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("SN123", "Galaxy S25");
        myPhone.powerOn();
        myPhone.makeCall("555-1234");
        myPhone.play();
        myPhone.displayInfo(); // Calls the overridden default method
        myPhone.stop();

        // Using interface types (Polymorphism)
        Callable phoneAsCallable = myPhone;
        phoneAsCallable.makeCall("999-8888");

        Playable phoneAsPlayable = myPhone;
        phoneAsPlayable.play();
        phoneAsPlayable.displayInfo(); // Calls overridden method via interface reference
    }
}
```
# Mini-Quiz 2 ❓
- Explain the difference between method overloading and method overriding. Which one relates to compile-time polymorphism and which to runtime polymorphism?
- When would you choose an abstract class over an interface?
- What does the `super` keyword do in Java inheritance?  
(Answers at the end of the guide)

---

# Level 3: Advanced 🚀 - Refining Designs & Modern Java
Here we dive into more sophisticated concepts and modern Java features related to OOP.

## 3.1 🧩 Composition vs. Inheritance (Has-A vs. Is-A)

### Inheritance (Is-A)
- Creates a tight coupling between superclass and subclass.
- Changes in the superclass can break the subclass.
- Suitable when the subclass truly is a specialized version of the superclass.  
  _e.g., Dog is an Animal._

### Composition (Has-A)
- Involves creating objects by assembling or composing other objects.
- One class contains an instance of another class.
- Represents a "Has-A" relationship.

### Why Favor Composition?
- More flexible.
- Less coupling.
- Easier to change components without affecting the container class.

### Principle
**Favor Composition over Inheritance.**  
Use inheritance only when it models a true "Is-A" relationship.

### Analogy
- A **Car has an Engine** (Composition - better). The engine can be swapped out.
- Trying to make **Car inherit from Engine** makes no sense.
- A **SportsCar is a Car** (Inheritance - appropriate here).

```Java

// Example: Composition

// Component class
class Engine {
    private String type;
    public Engine(String type) { this.type = type; }
    public void start() { System.out.println("Engine (" + type + ") started."); }
    public void stop() { System.out.println("Engine (" + type + ") stopped."); }
    public String getType() { return type; }
}

// Container class using Composition
class Car {
    private String model;
    private Engine engine; // Car HAS-A Engine (Composition)

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine; // Injecting the Engine object
    }

    public void startCar() {
        System.out.print(model + ": ");
        engine.start(); // Delegate behavior to the Engine component
    }

    public void stopCar() {
        System.out.print(model + ": ");
        engine.stop(); // Delegate behavior
    }

    public String getEngineType() {
        return engine.getType(); // Access component data
    }

    public static void main(String[] args) {
        Engine electricEngine = new Engine("Electric");
        Engine petrolEngine = new Engine("V6 Petrol");

        Car tesla = new Car("Tesla Model Y", electricEngine); // Compose with electric engine
        Car ford = new Car("Ford Mustang", petrolEngine); // Compose with petrol engine

        tesla.startCar();
        ford.startCar();
        System.out.println("Tesla Engine: " + tesla.getEngineType());
        System.out.println("Ford Engine: " + ford.getEngineType());
    }
}
```
# 3.2 ⚙️ Static vs. Instance Members

### Instance Members (Fields/Methods)
- Belong to a specific object (instance) of the class.
- Each object has its own copy of instance fields.
- Accessed via an object reference (e.g., `myCar.drive()`).

### Static Members (Fields/Methods)
- Belong to the class itself, not to any specific object.
- There's only one copy shared among all objects of the class.
- Accessed using the class name (e.g., `Math.sqrt()`, `Car.numberOfCars`).

### Use Cases for `static`:
- Constants (e.g., `public static final double PI = 3.14159;`).
- Utility methods that don't depend on object state (e.g., `Math` class methods).
- Keeping track of class-level information (e.g., counting how many objects were created).
- Factory methods (see Professional level).



```Java

public class Counter {
    // Instance variable - each object gets its own copy
    private int instanceCount = 0;

    // Static variable - shared by all objects of the class
    private static int staticTotalCount = 0;

    public Counter() {
        instanceCount++; // Increment this object's count
        staticTotalCount++; // Increment the shared static count
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    // Static method - can only access static members directly
    public static int getStaticTotalCount() {
        // Cannot access instanceCount here directly (would need an object reference)
        // System.out.println(instanceCount); // Compile Error!
        return staticTotalCount;
    }

    public static void main(String[] args) {
        System.out.println("Initial Total Count: " + Counter.getStaticTotalCount()); // Access via class name

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("c1 Instance Count: " + c1.getInstanceCount()); // 1
        System.out.println("c2 Instance Count: " + c2.getInstanceCount()); // 1
        System.out.println("c3 Instance Count: " + c3.getInstanceCount()); // 1

        // Access static member via class name (preferred) or an object (discouraged)
        System.out.println("Final Total Count (via Class): " + Counter.getStaticTotalCount()); // 3
        System.out.println("Final Total Count (via c1): " + c1.getStaticTotalCount()); // 3 (Works but confusing)
    }
}
```
# 3.3 🎭 Inner Classes & Anonymous Classes

### Inner Class:
- A class defined inside another class.
- Can access members (even private) of the enclosing outer class.
- Useful for logical grouping and encapsulation when one class is only used by another.

### Anonymous Class:
- An inner class without a name.
- Defined and instantiated simultaneously.
- Often used for creating one-off implementations of interfaces or abstract classes (e.g., event listeners in GUIs, Runnables for threads).


```Java

interface Greeter {
    void greet();
}

public class OuterClass {
    private String outerMessage = "Hello from Outer!";

    // Regular Inner Class
    class InnerClass {
        public void display() {
            System.out.println("Inner accessing Outer: " + outerMessage); // Can access private outer members
        }
    }

    public void useInner() {
        InnerClass inner = new InnerClass();
        inner.display();
    }

    public void useAnonymous() {
        // Anonymous Class implementing Greeter interface
        Greeter englishGreeter = new Greeter() { // No class name here!
            @Override
            public void greet() {
                System.out.println("Anonymous: Hello!");
            }
        }; // Semicolon needed here

        Greeter spanishGreeter = new Greeter() {
             @Override
            public void greet() {
                System.out.println("Anonymous: ¡Hola!");
            }
        };

        englishGreeter.greet();
        spanishGreeter.greet();

        // Can also pass anonymous classes directly as arguments
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable running in a thread...");
            }
        });
    }

    public void startThread(Runnable r) {
        new Thread(r).start();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.useInner();
        outer.useAnonymous();
    }
}
```
# 3.4 🔌 Interfaces & Default/Static Methods (Java 8+)

Java 8 significantly enhanced interfaces:

### default Methods:
- Allow adding new methods to interfaces with an implementation without breaking existing classes that implement the interface.
- Provides a default behavior that implementing classes can use or override.

### static Methods:
- Allow utility methods related to the interface to be defined directly within the interface itself.

<!-- end list -->

```Java

interface MyUtility {
    // Abstract method (pre-Java 8 style)
    void process(String data);

    // Static method (Java 8+)
    static void log(String message) {
        System.out.println("LOG: " + message);
    }

    // Default method (Java 8+)
    default void displayDefault() {
        MyUtility.log("Displaying default implementation."); // Can call static methods
        // process("Default Data"); // Cannot call abstract methods directly
        System.out.println("This is the default behavior.");
    }
}

class MyUtilityImpl implements MyUtility {
    @Override
    public void process(String data) {
        MyUtility.log("Processing data: " + data); // Call static interface method
        System.out.println("Implementation processing: " + data.toUpperCase());
    }

    // Optionally override the default method
    @Override
    public void displayDefault() {
         MyUtility.log("Displaying OVERRIDDEN implementation.");
         System.out.println("This is the specific behavior for MyUtilityImpl.");
    }
}

public class InterfaceEvolutionDemo {
    public static void main(String[] args) {
        // Call static method via interface name
        MyUtility.log("Application started.");

        MyUtilityImpl impl = new MyUtilityImpl();
        impl.process("Some Input");
        impl.displayDefault(); // Calls the overridden default method
    }
}
```
# 3.5 🚀 Java Records (Java 14+ Preview, Java 16+ Standard)

Records are a concise way to declare classes that are primarily simple data carriers. They automatically generate:

- Private final fields for each component.
- A canonical constructor initializing all fields.
- Public getter methods (e.g., `x()` instead of `getX()`).
- Implementations of `equals()`, `hashCode()`, and `toString()`.

Great for immutable data transfer objects (DTOs).


```Java

// 🚀 Record declaration - concise!
record Point(int x, int y) {
    // You can add static members
    public static final Point ORIGIN = new Point(0, 0);

    // You can add instance methods
    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // You can add compact constructors for validation/normalization
    public Point { // Compact constructor - no parameter list!
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Coordinates cannot be negative");
        }
        // Implicit assignment happens AFTER this code: this.x = x; this.y = y;
    }
}

// Traditional class equivalent (much more boilerplate)
/*
final class PointClass {
    private final int x;
    private final int y;

    public PointClass(int x, int y) {
        if (x < 0 || y < 0) { throw new IllegalArgumentException("Coordinates cannot be negative"); }
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public boolean equals(Object o) { // Boilerplate
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointClass that = (PointClass) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() { // Boilerplate
        return Objects.hash(x, y);
    }

    @Override
    public String toString() { // Boilerplate
        return "PointClass[x=" + x + ", y=" + y + ']';
    }
}
*/

public class RecordDemo {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(5, 15);

        // Accessors (note the naming convention: x() not getX())
        System.out.println("p1.x: " + p1.x());
        System.out.println("p1.y: " + p1.y());

        // toString() automatically generated
        System.out.println("p1: " + p1); // Output: p1: Point[x=10, y=20]

        // equals() automatically generated
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // Output: true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // Output: false

        // hashCode() automatically generated
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode()); // Same as p1

        // Using instance method
        System.out.println("Distance to Origin: " + p1.distanceToOrigin());

        // Using static member
        System.out.println("Origin Point: " + Point.ORIGIN);

        // Testing validation in constructor
        try {
            Point invalidPoint = new Point(-5, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}
```
# Level 4: Professional 🏆 - Mastering OOP Design & Principles

---

## 4.1 🧠 SOLID Principles

**SOLID** is an acronym for five key design principles that make software designs more understandable, flexible, and maintainable.

### S - Single Responsibility Principle (SRP):
A class should have only one reason to change.  
**Meaning**: A class should focus on a single job or responsibility. Avoid creating "God classes" that do everything.  
**Benefit**: Easier to understand, modify, and test. Reduces coupling.

---

### O - Open/Closed Principle (OCP):
Software entities (classes, modules, functions) should be open for extension but closed for modification.  
**Meaning**: You should be able to add new functionality without changing existing, working code. Use interfaces, abstract classes, and polymorphism.  
**Benefit**: Reduces risk of introducing bugs into existing code. Promotes reusable designs.

---

### L - Liskov Substitution Principle (LSP):
Subtypes must be substitutable for their base types without altering the correctness of the program.  
**Meaning**: Subclasses should honor the contract defined by the superclass.  
**Benefit**: Ensures inheritance hierarchies are sound.  
**Violation Example**: `Square` inheriting `Rectangle` and changing width/height behavior.

---

### I - Interface Segregation Principle (ISP):
Clients should not be forced to depend on interfaces they do not use.  
**Meaning**: Prefer smaller, specific interfaces over large ones.  
**Benefit**: Reduces coupling. Improves code clarity.  
**Example**: Split `Worker` interface into `Workable`, `Eatable`, etc.

---

### D - Dependency Inversion Principle (DIP):
High-level modules should not depend on low-level modules. Both should depend on abstractions.  
**Meaning**: Use interfaces to decouple implementations. Use Dependency Injection.  
**Benefit**: More flexible, testable, and maintainable systems.

---

## 4.2 Common Mistakes & Best Practices ✅❌🛑

- ❌ **Misusing Inheritance**: Using `extends` just for reuse.
  - ✅ **Best Practice**: Favor Composition over Inheritance.

- ❌ **Creating "God Classes"**
  - ✅ Break down large classes (SRP).

- ❌ **Tight Coupling**
  - ✅ Code to interfaces (DIP), use Dependency Injection.

- ❌ **Mutable State Everywhere**
  - ✅ Prefer Immutability (e.g., Java Records).

- ❌ **Ignoring Access Modifiers**
  - ✅ Use private/protected thoughtfully.

- ✅ **Use `final`**:
  - Fields (constants), Methods (no override), Classes (no inheritance).

- ✅ **Use Interfaces for Contracts**

- 🛑 **Not Handling `null`**
  - ✅ Use `Optional`, null-checks, annotations.

---

## 4.3 (Brief Mention) Design Patterns

Design patterns are reusable solutions to common design problems.

### Singleton Pattern (Java)
```java
public class SettingsManager {
    private static final SettingsManager INSTANCE = new SettingsManager();
    private SettingsManager() { System.out.println("Settings Loaded."); }
    public static SettingsManager getInstance() { return INSTANCE; }
}
```

### Factory Pattern (Java)
```java
interface Notification { void send(String message); }

class EmailNotification implements Notification {
    public void send(String msg) {
        System.out.println("Email: " + msg);
    }
}

class SmsNotification implements Notification {
    public void send(String msg) {
        System.out.println("SMS: " + msg);
    }
}

class NotificationFactory {
    public Notification createNotification(String type) {
        if ("EMAIL".equalsIgnoreCase(type)) return new EmailNotification();
        if ("SMS".equalsIgnoreCase(type)) return new SmsNotification();
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
```

### Others:
Observer, Strategy, Decorator, Adapter, Facade, etc.

---

## 🏁 Conclusion & Next Steps

You've journeyed through the core concepts, advanced features, and design principles of Object-Oriented Programming in Java! 🥳

### ✅ Key Takeaways:
- OOP models real-world entities.
- 4 Pillars: Encapsulation, Inheritance, Polymorphism, Abstraction.
- SOLID principles = High-quality code.
- Favor Composition & Immutability.
- Modern Java: Default Methods, Records, Optional.

### 🔜 What's Next?
- ✍️ Practice by building projects and refactoring code.
- 📚 Study Design Patterns deeply.
- 🛠️ Explore OOP in frameworks like Spring.
- 🧪 Learn about testing, mocks, and stubs.

---

# Mini-Quiz 3 ❓

1. **Why is "Favor Composition over Inheritance" a common OOP design principle?**  
   - Inheritance creates tight coupling. Composition is more flexible and safer.

2. **What is the main difference between a static method and an instance method?**  
   - Static: belongs to the class.  
   - Instance: belongs to the object.

3. **What problem do Java Records primarily solve?**  
   - They reduce boilerplate code for immutable data classes.

---

## 💡 Mini-Quiz Answers Summary:

**Quiz 1**
- Class: blueprint, Object: instance.
- Encapsulation: hides internal state with controlled access.
- Constructor: initializes an object.

**Quiz 2**
- Overloading: compile time, different params. Overriding: runtime, same signature.
- Abstract Class: common state/methods. Interface: capability contract.
- `super`: calls superclass constructor or method.

**Quiz 3**
- Composition > Inheritance for flexibility.
- Static vs. Instance methods.
- Java Records reduce boilerplate.

---

