## Set
- Is an interface in java
- Sets are abstract data types that can store certain values without any particular order and no repeated values(no duplicates).
---

## HashSet
- If a lot of collisions occur then performance(time complexity) will drop to O(log(n))
- Rely heavily on a one-dimensional array and a hash function
- Uses more memory than the TreeSet because the underlying array for the set is going to be way bigger than the amount of items we are going to store.
- Big O
  - `add` - O(1)
  - `remove` - O(1)
  - `contains` - O(1)
---

## LinkedHashSet
- If a lot of collisions occur then performance(time complexity) will drop to O(log(n))
- Uses doubly linked list data structure in addition to maintain the insertion order
- Relies on a hash function
- Uses more memory than the TreeSet because the underlying array for the set is going to be way bigger than the amount of items we are going to store.
- Big O
  - `add` - O(1)
  - `remove` - O(1)
  - `contains` - O(1)
---

## TreeSet
- Uses a balanced binary search tree(red-black tree)
- There are no collisions in tree maps
- Needs less memory than other sets
- Big O
  - `add` - O(log(n))
  - `remove` - O(log(n))
  - `contains` - O(log(n))
---