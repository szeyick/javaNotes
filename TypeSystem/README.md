# Java Type System

<h3>Key Terms</h3>
<p>
<ul>
<li>Object</li>
<li>Type</li>
<li>Class</li>
<li>Interface</li>
<li>Polymorphism</li>
<li>Inheritence</li>
<li>Abstract Class</li>
</ul>
</p>
<h3>Introduction</h3>
<p>
In this section, you'll find a basic introduction to the type system that exists in Java and how it forms the basic structure of any application.
</p>
<p>
Java uses the concept of <b>Objects</b>, which when compared to something in the real-world is essentailly a "thing" (i.e Dog, Car, Plane). Each one of these objects is an instance of (has a <b> is-a </b> relationship) of a <b>type</b>.
</p>
<p>
A <b>type</b> defines what sort of object that it is. Again using the real world example, a type can consist of such things like, Animal or Vehicle. It is there to ensure that our object complies to the Object <b>is-a</b> Type (Animal, Vehicle) relationship.
</p>
<p>
A <b>class</b> is the blueprint, the layout for the object and defines the set of methods that can be called, allowing the class to be manipulate the data contained within the object. A class can extend its functionality by <b>inheritance</b>, where it takes on the properties of the class that it inherits from. In Java, a class can only extend one other class.
</p>
<p>
We can further define functionality of a class through an <b>interface</b>. The interface defines a set of methods that a class must implement. A Java class can inherit any number of interfaces. An interface cannot be instantiated into an object, as only classes can be.
</p>
<p>
Between a interface and class, we have an <b>abstract class</b>. It acts like a class in that you can describe the data and provide some implementation, but it also allows us to define methods that have no implementation, which requires its extending subclasses to implement it on behalf of the abstract class.
</p>
<p>
Because a class can extend another class and inherit a number of interfaces, it is called a <b>polymorphic</b> type system. The term <b>polymorphism</b> means an object of many types. If a class extends another class and inherits a bunch of interfaces, its type can be of any of those types allowing it to take many shapes.
</p>
<h3>How types are used</h3>
<p>
Types are used in languages to allow the compiler to work okut how much space to allocate for objects in memoery. It is applicable for classes in Java since only they can be instantiated. Types can also be used for descriving arguments, return values, allowing the compiler or run-time to know their sizes also. 
</p>
<p>
All methods in Java are defined by their name, the types of their arguments and their return types. It is a constraint of a method, allowing the compiler to let us know when an object being passed in as a argument is of the wrong type or when it returns the wrong type. This means that -
</p>
<p>
<b>Foo methodName (ArgumentTypeA arg1, ArgumentTypeB arg2) <br></b>
and <br>
<b>Foo methodName (ArgumentTypeB arg1, ArgumentTypeA arg2) <br></b>
</p>
<p>
Are considered as different methods since the compiler notices that they argument types are in a different order. This makes Java a <b>type safe</b> language as it does not allow us to pass objects with the wrong type to a method.
</p>
<p>
The purpose of an interface is to provide to others who want to use an object, the set of operations that it can perform on the object. It is similar in use to a UI in that it determines how a user can manipulate the program. It is true that you can invoke the same methods directly on the class but by referring to its interface you can abstract the object allowing methods to be called on all objects of <b>at least</b> the interface type rather than referring to its concrete implementation therefore restricting the operations that can be performed.
</p>
<p>
In addition to extending a methods functionality to allow it to operate on any class that is of the same type as the interface, it also restricts how much of the object a method can see. The method should only know as much about an object as the interface allows, therefore not exposing all of its internal data.
</p>
