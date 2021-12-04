## Queues
- It's an abstract data types, and it can be implemented either using arrays or with linked lists.
- It has a FIFO(First In First Out) structure, the first item we inserted is the first item we take out.
- Basic operations are `enqueue()`(add value to the end of the queue) `dequeue()`(remove first value), `peek()`(remove the first value)
- Has several applications in operating systems and thread management(multithreading).
- Queues are useful when a resource is shared with several consumers(for example threads)
- Threads are stored in queues
- queues are important in CPU scheduling
- They are used when data is transferred asynchronously between two processes
- graph algorithms rely heavily on queues: `breadth-first search` use queues as an underlying abstract data type.
- In Java queues have certain method names:
  - `poll` - removes and returns the head of the queue(returns null if no elements)
  - `offer` - inserts the specified element into the queue if it is possible to do so immediately without violating capacity restrictions
  - `element` - retrieves the head of the queue
  - `peek`
  - `remove` - retrieves and removes the head
  - `add` - inserts into a queue without violating space capacity restrictions(return true or IllegalStateException if no space is currently available)
---

Big O Notation(Linked List Implementation)
- Enqueue - O(1)
- Dequeue - O(1)
- Peek - O(1)
- Contains - O(n)
---

## Priority Queue(PQ)
- All elements have a priority and are stored based on that in the queue.
- All objects must be comparable that are stored in a PQ
- Uses a binary heap as the underlying data structure
- methods:
  - `add`
  - `peek`
  - `poll`
---