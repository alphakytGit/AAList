# AAList
Arrays and ArrayLists
There are distinct conceptual differences between Arrays and ArrayLists in Java. These conceptual differences are also illustrated in the source code file (AAList- https://github.com/alphakytGit/AAList.git)
saved in the GitHub repository.  
Conceptual Differences: 
1.	Size: Arrays have a fixed size, set at the time of their creation, while ArrayLists are dynamic and can grow or shrink as elements are added or removed.
2.	Element Types: Arrays can store both primitive types and objects, whereas ArrayLists can only store objects. However, autoboxing allows primitive types to be stored as objects.
3.	Performance: Arrays are faster for access and use less memory due to their fixed size and simpler structure. ArrayLists, while more flexible, incur additional overhead for resizing and managing the internal array.
4.	Memory Allocation: Arrays use a fixed amount of memory, while ArrayLists dynamically allocate more memory as needed. This dynamic resizing involves copying elements to a larger array, which can introduce performance overhead.
5.	Functionality: ArrayLists offer more advanced functionality with methods like add(), remove(), and size(), whereas arrays are more limited, only supporting fixed-size elements.
