public class Dog { // This is a class with just one method, an attribute and its getter/setter
  String name; // attribute

  public String getName (){ // getter
    return name;
  }

  public void setName (String name){ // setter
    this.name = name;
  }

  void bark() { // method
    System.out.println(name + " says Woof-Woof");
  }
}