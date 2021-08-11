# Assignment 2
**Group 2:**
Ole Bjørnar Granås & Michael Herland Valen

### Theory task
a) What are the two essential operations of a Stack? Mention two other useful but nonessential operations

Essential
- Pop (retrieve the top element)
- Push (put a new element on the stack)

Nonessential
- Empty (test for an empty stack)
- Peek (inspect the top element)

Source: 05_stack.ppt page 11

---


b) What data structures are commonly used in a database index? Why?

Database / SQL Index
- Used to retrieve data from database more quickly and is only used to speed up searches/queries.

Binary Search Tree (B-Tree)
- A binary search tree never has to be sorted because the elements always satisfy the required order relations
- Because the data is sorted, this allows the B-Tree to be searches, sequential access, insertions, and deletions in O(log n)
- When new elements are inserted (or removed) properly, the binary search tree maintains its order
- In the worst case, searching is O(n)

Source: 12_Binary trees.ppt page 24
https://www.w3schools.com/sql/sql_create_index.asp
https://en.wikipedia.org/wiki/Binary_search_tree

---

c) What are the most important features and advantages of the hashmap data structure?

- Map objects provide efficient search and retrieval of entries that contain pairs of objects (a unique key and the information)
- Hash tables (implemented by a **Map** or Set) store objects at arbitrary locations and offer an average constant time for insertion, removal, and searching
- Mathematically, a Map is a set of ordered pairs whose elements are known as the key and the value
- Keys must be unique, but values need not be unique

Source: 03_Sets and maps.ppt page 3, 11

---
#Note:

The folder "Screenshots", contains the output of all the solutions.

Task 2:
- Assignment 2_2AB
- Assignment 2_2C

Task 3:
- Assignment 2_3

Task 4:
Task 4 contains two solutions, one developed by each of us, and later discussed. We decided to keep both of them.
- Assignment 2_4_S1
- Assignment 2_4_S2
    - PriorityList
