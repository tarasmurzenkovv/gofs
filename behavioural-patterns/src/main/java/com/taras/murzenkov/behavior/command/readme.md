Command pattern consists of three objects:
- Request
- Command interface and several its implementation
- Invoker

Invoker has the method that accepts the Commnad interface and executes the stored commands.
Each implementation of the command wraps the Request inside it and implemens the Command interface. 

[back](https://github.com/terancet/gofs)