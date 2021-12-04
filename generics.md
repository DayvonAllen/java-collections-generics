## Why Use Generics
- Generics add stability to your code
- It makes most of the bugs and errors detectable at compile time and not at run-time\
- They enable types(classes and interfaces) to be parameters when defining classes, interfaces and methods
- We can reuse the same code with different inputs.
- They offer stronger type checks at compile time
  - If our code violates type safety then the compiler warns us and this is exactly why we prefer compile time errors
- We can eliminate type casting
---

## Bounded Generic Types(Why do we use them?)
- Sometimes we want to restrict the type that can be used as type arguments in a parameterized type.
- a method that operates on numbers(integers, floats or doubles) might only want to accept instances of the `Number` class or its subclasses
- This is exactly why there are bounded type parameters.
- Bounded types allow you to invoke methods defined in the bounds.
- ex. `<T extends Comparable<T>>`
---

## Upper Bounded Wildcards
- `?` - the wildcard operator
- `<? extends T>` - denotes upper bounded wildcards
- We may want to use wildcards with child classes(sub-types), this allows us to do that.
- `printAll(List<? extends T>)`
  - This method can accept a list of any subclass of `T`
  - you can not add items to a `List<? extends T>`(except Null, you can insert null) because you can not guarantee what list it is really pointing to,
    - the only thing you can do for sure is read the items.
    - It does not provide immutability
```
// no compile time error 
List<? extends Number> li = new ArrayList<>();

// compile time error(cannot add items when using an upper bounded wildcard operator)
li.add(new Integer(23));
``` 
---
    
## Lower Bounded Wildcards
- `<? super T>` - denotes lower bounded wildcards
- We may want to use wildcards with parent classes(super-types), this allows us to do that.
- This is usually useful when we want to insert items into a generic data structure or collection
- ex. `printAll(List<? super T>`
  - This method can accept a list of any superclass of `T`
  - You can not read items from `List<? super T>` because you cannot guarantee what list it is really pointing to - we can read objects(`Object`) exclusively
    - We can insert subtypes of `T` into a `List<? super T>`
- ex. `addItem(List<? super Integer>)`
  - We can add an `Integer` to the list without any problem
  - We can add `Numbers` or even `Objects` to the lost because `Number` and `Object` are superclasses of `Integer`
---
  
## Lower Bounded Wildcards vs Upper Bounded Wildcards
- Use `Upper Bounded Wildcards` when you will only get values out of a structure or collection
- Use `Lower Bounded Wildcards` when you will only put values into a structure or collection.
- Do not use wildcards if you want to read and write from a structure or collection
  - We can use bounded generic type parameters in these cases.
---
  
## Wildcards vs Bounded Types
- Wildcards:
  - We do not have access to the actual type(unknown type)
  - wildcards can handle a single bound(extends or super)
  - you should use wildcards whenever possible
- Bounded Types:
  - We can access the `T`
  - bounded type parameters can handle multiple bounds
    - `<T extends Number & Comparable<T>>`
  - you should use bounded type parameters if you want to read and write.
---
  
## Type Erasure
- Java uses type erasure to implement generics, this is how generic code is handled.
- It replaces all generic type parameters with their bounds or Object for unbounded type parameters
  - This is true for wildcards as well.
- So the final bytecode will contain plain Java classes and objects.
- Sometimes type erasure uses type casting
- sometimes it needs to generate additional methods
  - This usually occur when inheritance is used 
  - these are called `bridge methods` to maintain polymorphism with generic types as well(prevents ambiguous situations).
---