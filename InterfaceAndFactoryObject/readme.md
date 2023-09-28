# Interface and factory objects

If a class inherits an abstract method and does not overwrite must be declared as an `abstract` class.
We can say that an `interface` is an abstract class but that is not exactly like that. Exists a difference between
`interface` and an `abstract class`:
- Abstract classes can be extended(with word: `extends`)
- Interfaces can be implemented(with word: `implements`)

One class can only inherits from one class; and mulitple interfaces can be implemented
of which is going to inherit `abstract` methods that must be overwritten.

In this program we use `CommunicatorManager` to get an instance of `Communicator` and send a message through it

![UMLCommunicatorManager](images/CommunicatorManagerUML.png)

What if we modify the method `createCommunicator` of `CommunicatorManager` and
instead returning an `MessengerPigeon` instance we return `CellPhone`

Nothing...

Because we remove  of know whats the type instance, and our code was decoupled

So with `createCommunicator` method of class `CommunicatorManager` can be classified as `FACTORY METHOD`.


## Interface Comparable

This interface declares just one method: `compareTo` that compares an object that is received as parameter with the own instance
on which the method is being executed

## Lambda expresions
Allow interface implementation, the only restriction it is that the `interface` must contain a unique 
method created

# JCF

Its a set of class and interfaces that implements different data structures of frecuently use

## Lists and collections
We define collections to any `set` of objects. A String[] is a string Collection, a int[] is a collection of
integer numbers and Object[] a set of objects.

But in general terms when we speak of lists or collections we talk about objects that
implement interfaces `List` or `Collection`

List -> Interface that extends Collection
