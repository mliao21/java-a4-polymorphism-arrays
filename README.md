# a4-polymorphism-arrays
Playing with polymorphism and arrays.

This assignment has two parts:
- [1. Class menagerie](#1-class-menagerie)
- [2. Stats GUI](#2-stats-gui)


# 1. Class Menagerie

**Objectives**

The objectives of this assignment are
1. To reinforce the concepts of inheritance and polymorphism
2. To give practice extending classes and implementing interfaces

In preparation for this lab you should review Chapter 8, especially Section 8.3, of Java, Java, Java.

**Problem Statement**

In this lab, we begin with the definition of the Animal class given on page 348 of the text. Following the examples in the book, we will implement our own subclass of Animal (other than Cow, Cat, and Pig). We will then modify the Animal class definition by adding the abstract method eat(). We will implement the `eat()` method in our Animal subclasses, including the new subclass that we defined here. We will define the `Trainable` interface and provide implementations of its `doATrick()` method in our Animal subclasses. Finally, we will define a `Predator` interface and provide implementations of its `preysOn()` method in out Animal subclasses.
By the completion of the lab, we will have a program that will generate the following output:

```
I am a cow and I go moo
I eat hay
I am a cat and I go meow
I eat mice
I am a frog and I go rribbit
I eat flies
I do tricks. I can hang from the drapes.
I do tricks. I can somersault.
I am a wolf and I go how-uul
I eat deer
I prey on Cows: false
I prey on Cats: true
```

**Problem decomposition**

This project will involve the Animal class, the Cow and Cat subclass, and the subclass that you will define. The Animal class is currently designed as follows:

```
@startuml
skinparam classAttributeIconSize 0
abstract class Animal{

# kind: String 
+ Animal() 
+ toString(): String 
+ {abstract} speak():String 
+ {static} main(args: String[])

}
@enduml
```

**Implementation**

_Step1: Setup._

Study the code in files `Animal.java`, `Cow.java` and `Cat.java`.

_Step2: Compile and run._

Modify the `main()` method in the `Animal` class so that it no longer refers to the `Pig` class, which we won't be using in this lab. Then compile and run the `Animal` class.

_Step 3. Define your own Animal subclass._

Following the example of the `Cat` and `Cow` classes, define your own subclass of Animal. Implement its `speak()` method in a way that is appropriate for that animal.

_Step 4. Defining and testing a new inherited behavior._

Modify the Animal class by defining an abstract `eat()` method. This method has no parameters and returns a `String`. Add this `String` the `toString()` method. Then modify the `Cat` and `Cow` subclasses and the subclass that you created so that all three classes implement the `eat()` method. When you're done with this step, your program should generate something like the following output:

```
I am a cow and I go moo
I eat hay
I am a cat and I go meow
I eat mice
I am a dog and I go woof
I eat carpets
```

_Step 5. Defining the Trainable interface._

The Trainable interface has the following design:

```
@startuml
skinparam classAttributeIconSize 0
interface Trainable{

+ {abstract} doATrick():String

}
@enduml
```

Provide an implementation of the `Trainable` interface for both the `Cat` class and the class you defined. To implement an interface you must modify the class definition and then provide an implementation of all the methods defined in the interface. In this case you would modify the `Cat` definition to:

```java
public class Cat extends Animal implements Trainable
```

You would then provide a definition of the `doATrick()` method in the `Cat` class. This is similar to the way you defined an implementation of the `actionPerformed()` method when you implemented the `ActionListener` interface in the GUI files of previous labs.

To test your code, modify the `main()` program to include the following lines:

```java
Trainable pet = new Cat();
System.out.println(pet.doATrick());
```
Modify `main()` so that it also calls `doATrick()` on the Animal subclass that you created.

_Step 6. Questions._

Given the classes and interfaces you have defined, which of the following would be valid. Explain. If you don't know the answers, experiment by typing the code into your program and testing it.

- `Trainable pet1 = new Cow();`
- `Animal pet2 = new Cat(); System.out.println(pet2.doATrick());`
- `Animal pet3 = new Cat(); System.out.println( ((Trainable)pet3).doATrick() );`

_Step 7. Defining a Predator interface_

Define a new interface named `Predator`, which contains the `preysOn()` method. This method takes a single parameter of type `Animal` and returns a `boolean`. For a class that implements this interface, the `preysOn()` interface would define all the animals that that animal preys on.

To test this method define an `Animal` subclass such as `Wolf` that preys on Cats and other small animals. One way to implement `preysOn()` would use the built-in `instanceof` operator. This is a boolean operator that has the form `obj` instance class. For example, if you have created a `String` instance named `str`, then `str instanceof String` would be `true`.

**Reporting**

In the markdown file `Animals.md` add the UML class diagram including `Animal`, `Cat`, `Cow`, `Trainable`, `Predator`, your class and the predator test class as an embedded image. Add JavaDoc and comments to all your class additions, classes and interfaces. Include answers to the questions in _step 6_ . Include a screenshot demonstrating successful execution of your program.

# 2. Stats GUI
**Objectives**

The objectives of this lab are:
- To give practice using arrays.

**Problem Statement**

Write a JFrame based GUI that enables the user to input a sequence of exam grades and then computes the average and the median of the grades entered. Note that to compute the median of a list of numbers, you must find the middle value -- i.e., that value for which there are the same number of smaller and larger. If there are an odd number of elements in the list, the median is the middle element. So, for the list

```
  10 20 45 65 76 78 88
```

the median would be 65. For a list with an even number of elements, you must take the average of the two middle numbers. So, for the list

```
  10 20 45 65 75 78 88 90
```

the median would be (65 + 75)/2 = 70. To solve this problem, it is necessary to store the individual grades in an array and then sort the array.

**GUI Specifications**

Elements and layouts of the GUI are implemented in `src/StatsGUI.java`.

The GUI contains an input JTextField, an output JTextArea, and two JButtons, one to show stats and one to clear the GUI (and start over). The user is prompted to enter grades into the JTextField. Pressing ENTER will add the grade. When the STATS button is clicked, the program sorts and displays the grades that were entered, plus their mean (average) and median. When the RESET button is clicked, the GUI should be cleared so that a new set of stats may be calculated.

**Design Specifications**

You need two Java classes for this project.

`StatsGUI` defines the graphical user interface. It should implement the `ActionListener` interface and should handle the following three actions:
* JTextField input: Pass the number in the text field to the Stats object
* STATS Button	: Get the results from the Stats object and display them in the JTextArea.
* RESET Button: Clear the interface and create a new Stats object.

A partial implementation of this class is available at `src/StatsGUI.java`.

`Stats` should keep track of the grades that are typed in and should do the calculation of the mean and the median. It should contain the following elements:
- Instance variables. An `int` array is needed to store the individual grades. This should be declared `private` and should be initialized in the constructor method. Also, a `private` integer variable should be used to count the number of grades that have been stored in the array.
- Constructor Method. The public constructor method should instantiate the array. Give it 100 elements.
- The `add(int)` Method. This `public` method takes an `int` parameter, a grade, and inserts it into the next location in the array. It uses the counter variable to determine where the next element goes. Don't forget to increment the count after each insertion.
- The `getMean()` Method calculates the average of the numbers that have been inserted into the array. Use a for loop. What should the bound be for the loop?
- The `sort()` Method sorts the array into ascending order. You will be provided with a version of the `InsertionSort` from page 407 to 410 of the text Java, Java, Java .
- The `getMedian()` Method first sorts the first N elements of the array, where N is the number of grades that have been stored in the array. It then returns the median value as a double. How do you identify whether there are an even or odd number of elements in the array? How do you identify the middle element?
- The `toString()` Method returns the list of sorted grades plus their average and their median. It uses string concatenation plus escape sequences, such as `"\n"` to format the output. This method will be called from the GUI.

You are provided a partial implementation of the `src/Stats.java`.


**Reporting**

In the markdown file `Stats.md` add the UML class diagram of `StatsGUI` and `Stats`, their dependencies and their relationships. Add JavaDoc and comments to all your class additions. Include a screenshot demonstrating successful execution and outputs of a computing stats of even and odd number of grades. 
