# Object-Oriented Programming Concepts

## Questions

- Real-world objects contain `states` and `behaviors`.
- A software object's state is stored in `fields`.
- A software object's behavior is exposed through `methods`.
- Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data `encapsulation`.
- A blueprint for a software object is called a `class`.
- Common behavior can be defined in a `superclass` and inherited into a `subclass` using the `extends` keyword.
- A collection of methods with no implementation is called an `interface`.
- A namespace that organizes classes and interfaces by functionality is called a `package`.
- The term API stands for `application programming interface`?

## Exercises

1. Create new classes for each real-world object that you observed at the beginning of this trail. Refer to the Bicycle class if you forget the required syntax.
2. For each new class that you've created above, create an interface that defines its behavior, then require your class to implement it. Omit one or two methods and try compiling. What does the error look like?
   > the error message will list the required methods that have not been implemented.

### Dog class

```java
class Dog {
  string name;
  string color;
  string breed;
  boolean hungry;

  void bark() {
    System.out.println(name + " barks!!");
  }

  void fetch() {
    System.out.println(name + " fetches the ball");
  }

  void wagTail() {
    System.out.println(name + " wags tail!!");
  }
}

```

### Dog Interface & class

```java
interface Dog {
  void bark();

  void fetch();

  void wagTail();
}

class spot implements Dog {
  string name = "spot";
  string color = "yellow";
  string breed = "beagle";
  boolean hungry = false;

  public void bark() {
    System.out.println(name + " barks!!");
  }

  public void fetch() {
    System.out.println(name + " fetches the ball");
  }

  public void wagTail() {
    System.out.println(name + " wags tail!!");
  }
}

```
