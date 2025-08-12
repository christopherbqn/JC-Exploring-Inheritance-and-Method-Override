# Lab : Exploring Inheritance and Method Overriding

Submitted by: Bayquen, Christopher Gilbert A. | August 12, 2025

This repository holds our lab activities exploring the concepts of inheritance, creating class hierarchies, reusing code effectively, and designing flexible and extensible applications.

**Output Predictions**

- **Basic Inheritance: the `extends` Keyword**: **A** <br> the program will output `Tuut, tuut!` `I am a Generic Vehicle Mustang`. This is possible because the `Car` class extends the `Vehicle` class, inheriting the public and protected methods of the class; allowing the object `myCar` to access `.honk` from the parent class. <br><br>
- **Abstract Classes: defining a template**: **B** <br> The `Circle` and `Rectangle` objects created provides an implementation for the `area()` method of the `Shape` abstract class, when `myCircle.display()` and `myRectangle.display()` is called, the `area()` is called to the version of each object. <br><br>
- **Method Overriding: Providing a new implementation**: **B** <br> This program implements method overriding where the `CodeEditor` class overrides the `openFile` method inherited from the parent class `Editor`. When implementing the classes, the `myCodeEditor.openFile()` will print out `Applying syntax highlighting...` then `Opening Generic File` from the parent class. This also happens to the  `polyEditor` object as it refers to the Editor class while being a CodeEditor Object. <br><br>
- **