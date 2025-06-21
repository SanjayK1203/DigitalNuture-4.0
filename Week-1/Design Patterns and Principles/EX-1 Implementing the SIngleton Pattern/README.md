 Exercise 1: Implementing the Singleton Pattern

 Scenario:
You need to ensure that a logging utility class in your application has only one instance throughout the application lifecycle, to guarantee consistent and centralized logging.

⸻

 Steps:
	1.	Create a New Java Project:
Create a new Java project named SingletonPatternExample.
	2.	Define a Singleton Class:
	•	Create a class named Logger that contains a private static instance of itself.
	•	Ensure that the constructor of the Logger class is private to prevent direct instantiation.
	•	Provide a public static method that returns the single instance of the Logger class.
	3.	Implement the Singleton Pattern:
Write code to ensure that the Logger class strictly follows the Singleton Design Pattern, allowing only one instance to be created and reused across the application.
	4.	Test the Singleton Implementation:
Create a separate test class to verify that only one instance of the Logger is created and that it is shared and reused throughout the application.