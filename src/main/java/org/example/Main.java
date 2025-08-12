package org.example;

public class Main {


    public static void main(String[] args) {

        // extends
        System.out.println("--- 1️⃣ Basic Inheritance: the extends keyword ---");
        Car myCar = new Car();
        myCar.honk();
        myCar.display();

        //mini challenge
        System.out.println("\n---mini challenge---");
        Bicycle myBike = new Bicycle();
        myBike.honk();
        myBike.ringBell();


        // abstract Class: Defining a template
        System.out.println("\n--- 2️⃣ Abstract Classes: Defining a Template ---");
        Circle myCircle = new Circle();
        System.out.println(myCircle.display());

        Rectangle myRectangle = new Rectangle();
        System.out.println(myRectangle.display());

        //mini challenge
        System.out.println("\n---mini challenge---");
        Dog myDog = new Dog();
        myDog.breath();
        myDog.makeSound();


        // method overriding
        System.out.println("\n--- 3️⃣ Method Overriding: Providing a New Implementation ---");
        Editor myEditor = new Editor();
        CodeEditor myCodeEditor = new CodeEditor();
        Editor polyEditor = new CodeEditor(); // Polymorphism

        System.out.println("--- Regular Editor ---");
        myEditor.openFile();

        System.out.println("\n--- Code Editor ---");
        myCodeEditor.openFile();

        System.out.println("\n--- Polymorphic Editor ---");
        polyEditor.openFile();

        // mini challenge
        System.out.println("\n---mini challenge---");
        GameCharacter myChar = new GameCharacter();
        ArmoredCharacter myArmoredChar = new ArmoredCharacter();
        System.out.println("Regular Character " + myChar.takeDamage(100));
        System.out.println("Armored Character " +  myArmoredChar.takeDamage(100));


        // inheriting variables & access rules
        System.out.println("\n--- 4️⃣ Inheriting Variables & Access Rules ---");
        CheckingAccount myCheckingAccount = new CheckingAccount(100);
        myCheckingAccount.deductMonthlyFee();





    }


}

class BankAccount{
    protected double balance;

    public BankAccount(double startingBalance){
        this.balance = startingBalance;
    }

    public double getBalance(){
        return this.balance;
    }

    // public setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount{
    private double fee = 5.0;

    public CheckingAccount(double startingBalance){
        super(startingBalance);
    }

    public void deductMonthlyFee(){
        // fix issue using encapsulation concept
        setBalance(getBalance() - fee);
        System.out.println("Fee deducted. New Balance: " + getBalance());

    }
}


class GameCharacter{

    public String takeDamage(int amount){
        int health = 100;
        int newHealth = health - amount;
        return "takes " + amount + " damage. new health: " + newHealth;
    }

}

class ArmoredCharacter extends GameCharacter{
    @Override
    public String takeDamage(int amount) {
        amount = amount /2;
        return super.takeDamage(amount);

    }
}






class Editor{
    public void openFile(){
        System.out.println("Opening Generic File.");
    }
}

class CodeEditor extends Editor{
    @Override
    public void openFile() {
        System.out.println("Applying Syntax highlighting...");
        super.openFile();
    }
}




abstract class Animal{

    public abstract void makeSound();

    public void breath(){
        System.out.println("Inhale...Exhale...");
    }
}

class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

}



// Abstract Parent Class
abstract class Shape{
    public abstract double area();

    public String display(){
        return "The area is: " + area();
    }
}

// concrete subclass
class Circle extends Shape{
    private double radius = 5.0;

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}


// concrete subclass
class Rectangle extends Shape{
    private double length = 4.0;
    private double width = 6.0;

    @Override
    public double area() {
        return length * width;
    }
}




//mini challenge 1
class Bicycle extends Vehicle{
    public void ringBell(){
        System.out.println("Ring ring!");
    }
}


// parent Class
class Vehicle{
    protected String brand = "Generic Vehicle";

    public void honk(){
        System.out.println("Toot, toot!");
    }
}

// child class
class Car extends Vehicle{
    private String modelName = "Mustang";

    public void display(){
        System.out.println("I am a " + brand + " " + modelName  );
    }
}