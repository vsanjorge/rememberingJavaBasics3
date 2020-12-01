/*****
* Last episode we revisited inputs, prints, conditions, loops and arrays.
* In this snippet we're introducing OOP (Object Oriented Programming) with classes and objects.
* We will also look into visibility types for attributes and methods, and how to modify these attributes through getters and setters.
*****/

class Main {
  public static void main(String[] args) {
    Dog firulais = new Dog(); // We create an object from our Dog class (see Dog.java)
    firulais.setName("Firulais"); // we give our dog a name =)
    firulais.bark(); // This prints "Firulais says Woof-Woof"

    Cat kaka = new Cat(); // We will be able to create a Cat object because the class is accesible (public)
    //kaka.meow(); // This won't be accesible because the meow() method is private
  }
}