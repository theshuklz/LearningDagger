## Learnings

- constructor injection is better because you can still keep the fields private
- constructor injection -> field injection -> method injection
- Field and method injection are automatically done if constructor injection is set up for a class
- We use a module when we don't own a class and hence we can't use constructor injection so we provide it.
- If the provides methods in modules don't depend on the instance state of the module, we can use the methods as static
