## Learnings

- constructor injection is better because you can still keep the fields private
- constructor injection -> field injection -> method injection
- Field and method injection are automatically done if constructor injection is set up for a class
- We use a module when we don't own a class and hence we can't use constructor injection so we provide it.
- If the provides methods in modules don't depend on the instance state of the module, we can use the methods as static
- If a class depends on an interface, we have to use module to provide a specific implementation of the interface, we cannot use constructor injection directly. 
- We can use @binds if we want to provide an instance of an interface. Its more optimal as dagger doesn't generate any implementation for that module. 
  - Inside the binds abstract class, we can only provide objects as static methods not otherwise. 
- We have to use modules if we want to inject values at runtime and we can't use direct constructor injection in that case as the class won't know how to get the required field. 
- DaggerComponent.create() is only generated if the none of the modules in the component take arguments over the constructor. 
- We can use Component.builder to inject values in the component as well. It saves the sanctity of the class as it can still remain abstract. Prefer that over passing value directly in the module. 
- @BindsInstance is used to set variables at runtime. Its better than passing a value at runtime to module as it saves code generation for module implementation.
- @named is better if you wanna provide stuff with same return type. 