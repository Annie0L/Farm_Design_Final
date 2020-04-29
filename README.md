Video demonstration: https://youtu.be/J9ovRoF2H_s

Design Pattern I
> Name: Decorator pattern

> Problem Description:
There are "affinities" of certain attributes in this program for different animals and farmers,
such as the amount of product produced or ability to make something. There needs to be a way to 
add something on top of the object itself. An animal will still be an animal and a farmer
will still be a farmer, but there should be a way to make special editions. 

> Solution Description:
Use inheritance to extend those base models of a famer, animal, etc., to be able to add desired attributes as desired.

> Consequences:
The issue with this is that you can only have one parent of a class and it might be better to have an interface to implement
instead. However, you can always choose to have the attributed be the one parent class and then use implementations for 
other code you may want to use. 

Design Pattern II

> Name: Factory pattern

> Problem Description:
You need to make farms that do entirely different things and are essentially two different kinds of objects. 
Be able to give entirely different implementations to farms with the same description of what a farm might do, but not
how it does it. For instance, if you have an animal farm and a crop farm you might want to describe that you sell
them at the market, but how you sell them (At an auction vs. a farmer's market) could be totally diffferent.

> Solution Description:
Make abstract classes or interfaces and then let objects define how things actually happen and what they are in 
implementation of those farms.

> Consequences:
There might be farms that are almost identical in how they do something and it may not always make sense to make a completely
different implementation if you don't know that they're going to be that different, one could argue. On the other hand,
if you know that this design pattern is worthwhile because you know all classes don't overlap, it's a great way to have
a loose definition of possible things that could be implemented.

Design Pattern III

> Name: Mediator pattern

> Problem Description: 
We need a way to interconnect the idea of time passing for objects (Animals, humans) and that affecting other objects 
(currency, crops).

> Solution Description:
We can make an intermediary class to keep track of time that defines the relationships between objects that otherwise 
have nothing to do with each other in a particular capacity. You could do this by making a class that uses a hash map or 
the like to compare different objects one to many, but everyone has one to many (AKA many-to-many).

> Consequences:
The class will have to manage a lot of relationships itself, so the code in the class itself might be a bit wordy
since it has to manage all the relationships, but this is so that the other classes don't have to be varied and scattered
talking to each other. 
