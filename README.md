## Learnings

- constructor injection is better because you can still keep the fields private
- constructor injection -> field injection -> method injection
- Field and method injection are automatically done if constructor injection is set up for a class
- We use a module when we don't own a class and hence we can't use constructor injection so we provide it.
- If the provides methods in modules don't depend on the instance state of the module, we can use the methods as static
- If a class depends on an interface, we have to use module to provide a specific implementation of the interface, we cannot use constructor injection directly. 
- We can use @binds if we want to provide an instance of an interface. Its more optimal as dagger doesn't generate any implementation for that module. 