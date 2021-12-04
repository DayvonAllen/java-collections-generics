## Associative Arrays
- Associative arrays(maps or dictionaries) are abstract data types
- Composed of a collection of key-value pairs where each key appears at most once in the collection
- most of the time we implement associative arrays with hashtable but binary search trees can be used as well.
- the aim is to reach O(1) time complexity for most operations.
- Under the hood TreeMaps rely on red-black trees(O(logN) search time)
---

## HashMap
- If a lot of collisions occur then performance(time complexity) will drop to O(n)
- Rely heavily on a one-dimensional array and a hash function
- can store one null key
- Uses more memory than the TreeMap because the underlying array for the set is going to be way bigger than the amount of items we are going to store.
- Big O:
  - `put` - O(1)
  - `get` - O(1)
  - `contains` - O(1)
  - `remove` - O(1)
---

## LinkedHashMap
- Uses doubly linked list data structure in addition to maintain the insertion order
- Relies on a hash function
- can store one null key
- Uses more memory than the TreeMap because the underlying array for the set is going to be way bigger than the amount of items we are going to store.
- Big O:
  - `put` - O(1)
  - `get` - O(1)
  - `contains` - O(1)
  - `remove` - O(1)
---

## TreeMap
- Uses a balanced binary search tree(red-black tree)
- There are no collisions in tree maps
- Needs less memory than other maps
- cannot store null keys
- Big O:
  - `put` - O(log(n))
  - `get` - O(log(n))
  - `remove` - O(log(n))
  - `containsKey` - O(log(n))
---
  
## Red-Black Trees
- It is a balanced(binary search tree) data structure invented back in 1978 by Leonidas Guibas and Robert Sedgewick.
- This data structure has a guaranteed O(log(n)) running time because it's balanced.
- the running time of binary search trees depends on the `h` height of the binary search tree.
- AVL trees are faster than red-black trees because they are more rigidly balanced but needs more work to implement and maintain.
- It is faster to construct a red-black tree than an AVL tree.
- Operating systems rely heavily on these data structures.
- The tree needs to be rotated sometimes to remain balanced.
- Space complexity is O(n)
- Time complexity:
  - insertion - O(log(n))
  - deletion - O(log(n))
  - search - O(log(n))
---