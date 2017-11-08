**GoF Definition**

Avoid coupling the sender of a request to its receiver by giving more than one object a
chance to handle the request. Chain the receiving objects and pass the request along the chain until an
object handles it.

**Concept**

Here we process a series of objects one by one (i.e., in a sequential manner). A source will initiate this
processing. With this pattern, we constitute a chain where each of the processing objects can have some logic
to handle a particular type of command object. After one’s processing is done, if anything is still pending, it
can be forwarded to the next object in the chain. We can add new objects anytime at the end of a chain.

[back](https://github.com/terancet/gofs)