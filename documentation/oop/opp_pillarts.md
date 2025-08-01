# The Pillars of Object-Oriented Programming (OOP)

Object-Oriented Programming is based on four main principles. These pillars help us build programs that are modular, reusable, and easy to maintain.

---

## 1. Abstraction

Abstraction means creating simplified models of real-world objects to focus on relevant details while hiding unnecessary complexity.

- **Definition:** The ability to represent real-world entities as classes and objects, showing only important information and hiding internal details.
- **Example:**  
  Imagine a `Car` class. You don’t need to show the complex engine parts inside; instead, you expose attributes like color, model, and speed.

---

## 2. Encapsulation

Encapsulation protects an object’s internal data and controls how that data is accessed or modified.

- **Definition:** Hiding an object's internal state and requiring all interaction through public methods (often called getters and setters).
- **Benefits:** Protects data from unauthorized access, increases security, and makes the code easier to maintain.
- **Example:**  
  A `BankAccount` class keeps its balance private. The balance can only be changed through methods like `deposit(amount)` and `withdraw(amount)`, preventing invalid changes.

---

## 3. Inheritance

Inheritance allows one class to reuse the properties and behaviors of another class.

- **Definition:** A subclass inherits attributes and methods from a superclass.
- **Benefits:** Promotes code reuse and creates clear relationships between classes.
- **Example:**  
  A base class `Employee` can have subclasses `Manager` and `Developer`. They inherit common attributes like name and salary but can also have specific behaviors.

---

## 4. Polymorphism

Polymorphism lets methods behave differently depending on the object calling them.

### Types of Polymorphism:

#### 🔹 Method Overloading (Static Polymorphism)
Same method name, different parameters (compile-time decision).

```java
public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }
}
```
### 🔹 Method Overriding (Dynamic Polymorphism)

A subclass changes the behavior of a method defined in its superclass (runtime decision).

```java
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
```

### 🔹 Parametric Polymorphism (Generics)

Writing flexible, type-safe code using generic types.

```java
public class Box<T> {
    private T content;

    public void put(T item) {
        content = item;
    }

    public T get() {
        return content;
    }
}
```


### 🔹 Coercion

Automatic conversion between compatible data types during operations.

```java
int x = 5;
double y = 4.5;
double result = x + y; // int converted to double automatically
```

### 🔹 Polymorphism Types Comparison Table

| Type                    | When Compile  | Main Feature                | Typical Example                                       |
|-------------------------|---------------|-----------------------------|-------------------------------------------------------|
| Static Polymorphism     | Compile       | Method/Operator Overloading | `add(int a, int b)` and `add(int a, int b, int c)`    |
| Dynamic Polymorphism    | Runtime       | Method Overriding           | `animal.makeSound()` in different subclasses          |
| Parametric Polymorphism | Compile       | Generics for type safety    | `Box<T>`                                              |
| Coercion Polymorphism   | Runtime       | Automatic type conversion   | `int + double = double`                               |
                