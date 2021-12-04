## List
- It extends the `Collection` interface
- It's an ordered collection that allows us to store and access items in a sequential manner
- Lists can include duplicate elements(while sets can not)
- It gives you full visibility and control over the ordering of its elements.
---

## LinkedList Big O
``` 
add() – appends an element to the end of the list. So it only updates a tail, therefore O(1) constant-time complexity.
add(index, element) – in average runs in O(n) time
get() – searching for an element takes O(n) time
remove(element) – to remove an element, only pointers have to be updated. This operation is O(1).
remove(index) – to remove an element by index, we first need to find it, therefore the overall complexity is O(n)
contains() – also has O(n) time complexity
```
---

## ArrayList Big O
``` 
add() – takes O(1) time. However, worst-case scenario, when a new array has to be created and all the elements copied to it, is O(n).
add(index, element) – in average runs in O(n) time
get() – is always a constant time O(1) operation
remove() – runs in linear O(n) time. We have to iterate the entire array to find the element qualifying for removal
indexOf() – also runs in linear time(O(n)). It iterates through the internal array and checking each element one by one. So the time complexity for this operation always requires O(n) time
contains() – implementation is based on indexOf(). So it will also run in O(n) time
```
---