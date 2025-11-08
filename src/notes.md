Singleton Design pattern:
=========================

The Singleton Design Pattern ensures that a class has only one instance throughout the application and provides a global point of access to that instance.

Key Characteristics
===================

Single instance: Only one object of the class is created.

Global access point: The instance can be accessed globally using a static method (commonly getInstance()).

Controlled instantiation: The class controls its own creation by making the constructor private or protected.

Real-world Examples
===================

Logger classes — one shared logging instance

Configuration manager — single source of truth for app settings

Thread pools — centralized control of system threads

Database connections — one connection manager per database


========================================================================================================


Factory Design Pattern
======================

The Factory Design Pattern provides an interface for creating objects, but allows subclasses or dedicated factory classes to decide which class to instantiate.

In short, it delegates the object creation process to a factory rather than instantiating objects directly using new.


Key Characteristics
===================

Encapsulation of object creation logic

Decouples client code from concrete class names

Promotes flexibility and scalability


Types of Factory Patterns
==========================

Simple Factory (Static Factory Method) — one method returns instances based on input.

Factory Method Pattern — defines an interface for creating objects but allows subclasses to decide which class to instantiate.

Abstract Factory Pattern — provides an interface for creating families of related or dependent objects.