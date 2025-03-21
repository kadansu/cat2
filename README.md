Q1.md 
                   The Rules of Big O Notation in Algorithm Analysis
* Sum Rule it is when your algorithm performs multiple operations sequentially, you add their complexities   If f(n) = O(g(n)) and h(n) = O(k(n)), then f(n) + h(n) = O(max( g(n), k(n) ) When combining complexities, only the largest term dominates.
* * * * Example
// O(n) + O(m) = O(n + m)
for (int i = 0; i < n; i++) {
    System.out.println(i); // O(n)
}

for (int j = 0; j < m; j++) {
    System.out.println(j); // O(m)
} 

*  Product Rule for nested operations, multiply the complexities If f(n) = O(g(n)) and h(n) = O(k(n)), then f(n) * h(n) = O(g(n) * k(n)). 
 * * * * Example
 // O(n) * O(m) = O(n * m)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        System.out.println(i + j); // O(n * m)
    }
}

* Constant Factor Rule when analyzing time complexity, we ignore constant multipliers. If an algorithm takes 2n operations, we simplify it to O(n) For any constant c > 0 and functions f(n) and g(n), if f(n) = O(g(n)), then cf(n) = O(g(n)).
* * * * Example
// O(3n) simplifies to O(n)
for (int i = 0; i < n; i++) {
    System.out.println(i); // Operation 1
    System.out.println(i); // Operation 2
    System.out.println(i); // Operation 3
}
* Polynomial Rule when an algorithm has multiple terms, the highest degree term dominates as n grows large.
* * * * Example
// O(n² + n + 1) simplifies to O(n²)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j); // O(n²)
    }
}

for (int k = 0; k < n; k++) {
    System.out.println(k); // O(n)
}

System.out.println("Constant operation"); // O(1)

* Logarithmic Rule when an algorithm repeatedly divides the problem size, it typically has logarithmic complexity.
* * * * Example
// O(log n)
int i = 1;
while (i < n) {
    System.out.println(i);
    i = i * 2; // Each iteration doubles i, so we have log₂(n) iterations
}

* Recursive Rule for recursive algorithms, analyze the recurrence relation to determine complexity ,each recursive call cuts the problem size in half, resulting in O(log n) complexity.
* * * * Example
// O(log n)
public int binarySearch(int[] array, int target, int low, int high) {
    if (low > high) return -1;
    
    int mid = (low + high) / 2;
    if (array[mid] == target) return mid;
    else if (array[mid] > target) 
        return binarySearch(array, target, low, mid - 1);
    else 
        return binarySearch(array, target, mid + 1, high);
}









Q2.md
                                     Difference Between Arrays and Linked Lists
// In trems of memory
* Arrays use contiguous blocks of memory where elements are stored next to each other in memory while linked list use non-contiguous memory locations where  node can be stored anywhere in memory.

* Arrays uses static allocation in the  memory  because  In many languages (like Java), arrays have fixed size that must be declared at initialization while linked list uses dynamic allocation in the memory because memory is allocated at runtime as new nodes are added, allowing the list to grow or shrink.

* Arrays have less overhead per element since they only store the actual data which is efficency while linked list each node requires extra memory to store the reference to other node.

* Arrays have a random access of elements  due to contiguous storage, arrays support direct access to any element using an index while in linked list sequential access is  required to  traversal from the beginning to the end to access elements.

//In trems of perfomance

* Arary Resizing is  an expensive operation that requires creating a new array and copying elements while linked list Resizing has no explicit resizing needs because they grow or shrink one node at a time.

* Arrarys have  a better cache performance due to contiguous memory allocation while linked list have poorer cache performance due to scattered memory allocation.

*  In arrays the access Time is  Constant  for accessing any element by index while in liknked list the acces time is Linear  to access an arbitrary element.

//In trems of insertion and deletion operations

* Insertion at beginning in arrys requires shifting all elements to make space while in linked list Insertion at beginning is Constant time operation regardless of list size

* In arrays deletion from beginning requires shifting all elements to fill the gaps while in linked list deletion from beginning is Constant time operation.






