## Abstract Data Types(ADT)
``` 
Abstract Data type (ADT) is a type (or class) for objects whose behavior is defined by a set of values and a set of operations.

The definition of ADT only mentions what operations are to be performed but not how these operations will be implemented. 
It does not specify how data will be organized in memory and what algorithms will be used for implementing the operations. 
It is called “abstract” because it gives an implementation-independent view. 
The process of providing only the essentials and hiding the details is known as abstraction.
```
``` 
The user of the data type does not need to know how that data type is implemented, 
for example, we have been using Primitive values like int, float, char data types only with the knowledge that these data type can operate and be performed on without any idea of how they are implemented. 
So a user only needs to know what a data type can do, but not how it will be implemented. 
Think of ADT as a black box which hides the inner structure and design of the data type. 
```
---

## List Of Abstract Data Types
- `Queue`
- `Stack`
  - has a LIFO(Last In First Out) structure, the last item we inserted is the first item taken out. 
  - Basic operations are `push()`(push a value to the top of the stack), `pop()`(return and remove the value at the top of the stack), `peek()`(returns the value at the top of the stack)
  - it can be implemented with arrays or with linked lists
  - Stack Big O:
    - Push - O(1) 
    - Pop - O(1)
    - Peek - O(1)
    - Contains- O(n)
- `Associative Array` 
- `Set`
---