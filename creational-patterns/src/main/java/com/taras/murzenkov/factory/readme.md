Factory classes are often implemented because they allow the project to follow the SOLID principles more closely. In particular, the interface segregation and dependency inversion principles.

Factories and interfaces allow for a lot more long term flexibility. It allows for a more decoupled - and therefore more testable - design. Here is a non-exhaustive list of why you might go down this path:

    It allows you to introduce an Inversion of Control (IoC) container easily
    It makes your code more testable as you can mock interfaces
    It gives you a lot more flexibility when it comes time to change the application (i.e. you can create new implementations without changing the dependent code)
    
Differnce between strategy and factory patterns: 
strategy allows you to EXECUTE the provided algorithm but factory will build the particular object for you. 
