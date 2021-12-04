## Associative Arrays
- Associative arrays(maps or dictionaries) are abstract data types
- Composed of a collection of key-value pairs where each key appears at most once in the collection
- most of the time we implement associative arrays with hashtable but binary search trees can be used as well.
- the aim is to reach O(1) time complexity for most operations.
- Under the hood TreeMaps rely on red-black trees(O(logN) search time)
---

## HashMap
- Big O:
  - `put` - O(1)
  - `get` - O(1)
  - `contains` - O(1)
  - `remove` - O(1)
---

## LinkedHashMap
- Big O:
  - `put` - O(1)
  - `get` - O(1)
  - `contains` - O(1)
  - `remove` - O(1)
---

## TreeMap
- Big O:
  - `put` - O(log(n))
  - `get` - O(log(n))
  - `remove` - O(log(n))
  - `containsKey` - O(log(n))
---