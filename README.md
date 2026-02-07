# 🧩 Design Patterns Collection (Java)

This repository contains implementations of **Design Patterns** written in Java.  
The goal of this project is to demonstrate understanding of **Creational**, **Structural**, and **Behavioral** design patterns along with examples and explanations.

---

# 📚 Contents

## 🏗 Creational Patterns
Creational patterns focus on **object creation mechanisms**, trying to create objects in a flexible and reusable way.

### ✅ Factory Pattern
Creates objects without exposing the instantiation logic to the client.

**Key Idea:**  
Encapsulates object creation and returns objects through a common interface.

**Use Cases:**
- When object creation logic is complex
- When code should be decoupled from concrete classes

---

### ✅ Builder Pattern
Separates the construction of a complex object from its representation.

**Key Idea:**  
Step-by-step object construction.

**Use Cases:**
- Creating objects with many optional parameters
- Immutable object creation

---

### ✅ Singleton Pattern
Ensures that only **one instance** of a class exists and provides a global access point.

**Key Idea:**  
Controlled access to a single shared instance.

**Use Cases:**
- Logging
- Configuration management
- Caching

---

## 🧱 Structural Patterns
Structural patterns focus on **how classes and objects are composed** to form larger structures.

---

### ✅ Adapter Pattern
Allows incompatible interfaces to work together.

**Key Idea:**  
Acts as a translator between two interfaces.

**Use Cases:**
- Integrating legacy systems
- Working with third-party libraries

---

### ✅ Composite Pattern
Treats individual objects and compositions of objects uniformly.

**Key Idea:**  
Represents part-whole hierarchies using tree structures.

**Use Cases:**
- File systems
- UI components
- Organizational structures

---

### ✅ Decorator Pattern
Adds behavior to objects dynamically without modifying their structure.

**Key Idea:**  
Wraps objects to extend functionality.

**Use Cases:**
- Adding features dynamically
- Extending functionality without subclassing

---

### ✅ Proxy Pattern
Provides a placeholder or surrogate for another object to control access.

**Key Idea:**  
Controls access, lazy initialization, logging, or security.

**Use Cases:**
- Access control
- Lazy loading
- Remote objects

---

## 🔄 Behavioral Patterns
Behavioral patterns focus on **communication between objects** and responsibility delegation.

---

### ✅ Chain of Responsibility Pattern
Passes requests along a chain of handlers.

**Key Idea:**  
Each handler decides whether to process the request or pass it forward.

**Use Cases:**
- Logging frameworks
- Event handling
- Middleware processing

---

### ✅ Command Pattern
Encapsulates a request as an object.

**Key Idea:**  
Separates request sender from request executor.

**Use Cases:**
- Undo/Redo operations
- Task scheduling
- GUI buttons

---

### ✅ Mediator Pattern
Reduces direct communication between objects by introducing a mediator.

**Key Idea:**  
Centralized communication control.

**Use Cases:**
- Chat rooms
- UI component coordination

---

### ✅ Iterator Pattern
Provides a way to access elements of a collection sequentially without exposing its structure.

**Key Idea:**  
Abstract traversal of collections.

**Use Cases:**
- Collection traversal
- Custom data structures

---

### ✅ Observer Pattern
Defines a one-to-many dependency between objects.

**Key Idea:**  
When one object changes state, all dependents are notified.

**Use Cases:**
- Event systems
- Messaging systems
- UI updates

---

### ✅ Strategy Pattern
Defines a family of algorithms and makes them interchangeable.

**Key Idea:**  
Encapsulates algorithms and allows runtime selection.

**Use Cases:**
- Payment processing
- Sorting strategies
- Validation logic

---

## 🚀 Project Goals

- Demonstrate understanding of GoF Design Patterns
- Provide clean and readable implementations
- Serve as an educational reference
- Show real-world usage examples

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming
- SOLID Principles

---

## 📂 Project Structure

creational/
factory/
builder/
singleton/

structural/
adapter/
composite/
decorator/
proxy/

behavioral/
chain of responsibility/
command/
mediator/
iterator/
observer/
strategy/

---

## 🤝 Contribution

Contributions, improvements, and suggestions are welcome.

---

## 📜 License

This project is for educational purposes.
