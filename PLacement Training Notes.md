**Multithreading**

\-running multiple thread inside a single process at the same time

\-all threads share the same memory same resources and perform different tasks simultaneously

\-used when task are light weight need fast communication

example-watching a YT video while comments are loading and ads are running all inside the same app



**Multiprocessing**

\-running processes at the same time

\-each process  has its own memory own resources runs independently

\-used when task are heavy and need high performance

example-opening+ Spotify+ VScode together



real example-imagine using a food delivery app



**Multithreading**

searching restaurant

tracking order

chatting with delivery partner

\--all running inside one app



**Multiprocessing**

food delivery app ,WhatsApp, google map

\--all running independently as different process



**Key difference**

**Multithreading**

\-shared memory

\-faster communication

\-light weight

\-less secure



**Multiprocessing**

\-separate memory

\-more secure

\-slower communication



lambda stream

functional

how to perform a action stream

data pipeline

method reference

grouping by



**lambda expression(Quick task execution)**

\-imagine your are working in an e-commerce company like amazon ,you have a list of product names and want to sort them quickly

Collections.sort(products, (a, b) -> a.compareTo(b));

* shortcut for writing code
* functional interface(reusable logic)
* in an HR system you want to filter employees salary >5000 , so we can use here predicate:-
* Predicate<Employee> highSalary = e -> e.salary > 5000;
* Predicate = Condition checker (true/false)
* predicate-used in filtering data validating rules



Funtion (Data Transformation)

* in an banking app user enters amount as string 1000,you need to convert it into integer, tax or interest using function:-
* Function<String, Integer> convert = s -> Integer.parseInt(s);

consumer (perform action)

* in a logging system you want to print logs
* Consumer<String> log = msg -> System.out.println(msg);



supplier(Lazy Creation)

* in an shopping app product object should be created.
* Supplier<Product> s = () -> new Product();



Stream(data pipeline)

* in FlipKart ,you have orders filter order >1000 apply discount print result
* orders.stream()
* &#x20;     .filter(o -> o.price > 1000)
* &#x20;     .map(o -> o.price \* 0.9)
* &#x20;     .forEach(System.out::println);



method referencr(Cleaner code)

* instead of writing
* x -> System.out.println(x)
* 
* Use:
* 
* System.out::println



reduce(final calculation)

* in a finance app calculate total expenses
* expenses.stream()

&#x09;.reduce(0,integer::sum);

Grouping by categorization

* grouping employees by dept.



why do we prefer strings and lambda adgtrd

* it improves boiler plate code
* and helps process large data effieciently using app data pipeleine approach.
* making of reusable code.





28/03/2026

Saturday



Buffer Reader

* Buffer reader is used to read text efficiently by buffering input and reading data line by line instead of character by charater to improve perfamance
* Buffer Reader creates a Buffer in (temporary memory) reads chunk of bytes(example: 8kb) then gives data line by line
* reading log files ,large CSV files, User input, Configuration files





||Scanner|Buffer reader|
|-|-|-|
|speed|slow|Fast|
|Reads|reads by token|Reads line by line|
|Parsing|Builds in (nextInt,nextLine)|Manual|
|Us case|small inputs|Large data|
||reads only string ,needs to convert||



flush

write buffer to file(keep string open)



sql

write an sql query to display the names of employees who have more than 5 years of experience and joined after January 1 2001 use alias e\_id, e\_name



the coures=\_id,course name,shcdule detais(day and starttime) of all courses that are taught in Wednesday in rooms use alias  C\_Id, C\_Name, day, Start\_time



30/03/2026

HashMap

* HashMap is a Data structure in the java store that store in key values
* 101-mithun
* 102-student
* each key must ne unique but values must be duplicate
* it is mainly used for fast searching ,caching ,indexing data because it gives very fast access time



how does HashMap data store data internally?

* HashMap internally uses an  array of buckets whwnever you insert a data map.put(101-"mithun") this data is stored inside one of the bucket of an array



who decides the bucket location?

* HashMap uses a concept called hashing it calculates hashcode of key -> bucket index uding formula index =hashcode(key) modulas array size this index decides where exactly the data will be stored

&#x20;

what if two keys get same bucket?

* so java creates a linked list creates a bucket



how data is retried?

* calculate hash code, find bucket index, traverse linked list



what is race condition?

* when multiple threads access and modify shared data simultaneously leadind to incorrect or and predictable
* example-count++;



because thread scheduling is unpredictable ,sometimes threads run sequentially sometimes concurrently



synchronized void increment() {

&#x20;   count++;

}

diffwrence between Synchronize method this block.

it logs whole method locks only part of the key.



What is wait?

releases log and waits.

notify-bakes one thread

example-producer consumer



What is executer  Service?

A framework to manage thread pool. Instead of creating threads manually

why we use threadpool

Reuse threads, improve performance. Avoid memory overhead.



8\. difference between Runnable and callable.

No return in runnable. That is if you call a tab and then say runnable, call return, then you will get no return in runnable. No return in see you.

Runnable, fallable. Runnable then no return. Okay ma, fallable has return varies. No exception.



9.what is future?

* represents result of asynchronous compution
* Future<Integer> f = ex.submit(task);
* f.get();



10.what happens if we dont call shutdown?

* application may not terminte ,threads keep running



11.what is single time pattern?

* ensures only one instance of a class exists



12.where  single time used in java?

* runtime class,logger,database connection



13.what is factory pattern?

* creates objects without exposing creation logic
* example-Calendar.getInstance()



14.what is builder pattern

* used to create complex objects step by step



15.Observer Pattern?

* one object notifies multiple objects.
* example-youtube notifications



16.what is strategy pattern?

* allows Changing the algorithm at runtime.
* example-payment method



17.decorater pattern

adds functionality without modifying orginal class



diff btw strategy and decorater



in strategy it changes behaviour and interchangeable

decorater adds feature and layered strategy



what is lru cache?

removes least recently used item

it uses hashmap and doubly linked list





SUMS

you are desighning a zoo  with limited land ,you need alocate space for 3 types of animals -herbivors,carnivores and aquatic animals.Each type of animal has cost per unit area ,maximum area available minimum,min space required per animal.
input-cost per unit area hc,ac,ac

minimum space per

no.of animals required

total land available-L



rules-each animal rewuired space



2.in an voting queue of n people each person is represented by a character A-supports party A, B-supports party B. each undecided voter decides their vote based on the nearest node supporter to their left if the nearest A on the left is closer voter becomes A,if the nearest B on the left is closer voter becomes B.if no supporter is found remains undecided.count total votes for party a and party b determine the winner



560,20





31.03.2026

6.when to use sliding window?

subarray substring pronblems contigues elements



7.prefix sum?

running sum of elements which helps find subarray sums efficiently



8.array ,arraylist ,linked list

Array is best for fixed size data fast access index based



Array list best for which size changes need fast access and flexible size.

\[amortized]-shoping cart--item can increase



Linked list Best of all frequent insert delete, no shifting required.

example-train compartments





For fast access is needed, use array or array list. if frequent delete insert is needed use linked list



array list is generally preferred because it balances both.





Given an array of integers where every element appears an even number of times except one element that appears an odd number of times write a program to find odd occurring element in order of log(n) time the equal elements must appear in pairs in the array but there cannot be more than two consecutive occurences  of an element.sample input n=5 elemts are 11223 output=3

6

434343

4



in this palindrome given an input string word split the string into exactly 3 palindromic substrings working from left to right choose the smallest split for the first substring that still allows the remaining word to be split into two palindrome similarly choose the smallest 2nd palindromic substring that leaves a 3rd palindromic substring .if there is no way to split the word into exactly 3 palindromic substring print impossible .every character of the string needs to be consumed .





1.04.2026

What is Binary Search

a Fast way to find an element in a sorted array works by dividing the search space in half



How it works?

starts with a whole array. check the middle element if it is the target (found) if target < middle (search left half) ,if target > middle (search right half).repeat it until found or array is empty

Key Point:

* array must be sorted
* time complexity
* space complexity O(n)





what is the difference between syntax error and runtime error

Syntax error

* it happens when you break the language rules the code won't even run example -missing semicolon ,wrong brackets- caught by compiler before execution



Runtime error

* it happens while the program  is running code starts but crashes inbetween example divide by 0 ,null pointer- occurs during execution



difference between primary key and foreign key

primary key

* uniquely identifies each row in a table no duplicates no null values only one primary key per table example -students table-- s\_id,s\_name.



foreign key

* a field that links to the primary table can have duplicates(many records that can point to the same values used to create relationship between table
* example-orders table order\_id,s\_id .s\_id acts as foreign key.



**Monotonic stack**

* a stack that maintains elements in increasing or decreasing order used in next greater element stock span problems



What is reverse poly notation?

* an expression where operators come after operands
* 2 1 + 3 \* → (2+1)\*3 = 9



2.04.2026

JP MORGAN CHASE QUESTIONS;

zzzyyxx

k=2

output=zzyzyxx



abbccc



hello

o=ebiil



cipher





1.why map is not the part of the collection interface in java

Map is not part of collection because collection stores single elements but map stores key value pairs. So java keeps it in a separate hierarchy



2.what is the string pool in java

string pool is special memory area inside the heap where java stores unique store values, if two string have the same value java keeps only one copy to save memory



3.what is the difference between wait() ,sleep(), yield()?

wait () - is used for thread communication and releases the lock

sleep() - passes execution without releasing the lock

yield() - it is a suggestion to the scheduler to allow other threads to execute



4.why doesn't java use pointers?

pointers  in c, C++ store memory addressers but java does not use pointers because safer no direct access to memory ,easier-no confusing pointer syntax , automatic -memory managed by garbage collecter



5.what is volatile keyword?

the volatile keywaord in java is used to indicate that a variables value maybe changed by multiple threads  it ensures that the value of the variable is always read from the main memory not from an threads local cache



6\. what is the difference between hashmap and treemap

hashmap stores elements using a hashtable and does not maintain order while treemap stores elements using a red-black tree keeps keys sorted



7.final vs finally vs finalize?

final - a keyword used to restrict modification

finally - - a block used in exception handling that always executes whether an exception occurs or not

finalize - a method called by the garbage collector before destroying an object





03.04.2026

1.difference between cpmarable and comparater?

comparable -provides default natural sorting using  compareto() , while comparater provides custom sorting using compare() and allows multiple sorting orders



2.what is the role of hashcode and equals in collection

hashcode- it gives an number hashvalue for an object used by hashmap hashset to decide where to store the object

equals= checks whether 2 object are really equal used to avoid duplicate and find the correct object



3.what is a fail pass iterater

a fail  pass iterater immedialtly throws a concurrent modification exception if the collection is modified while iterating except using the iteraters own remove method



4\. which collection is best for fast search

hashmap and hashset are best for fast searching because they use a method called hashing which helps find data very quickly



5.what is the difference btw collection and collections

collection is an interface used to store an group of object varies collections is a utility where it provides a static methods to perforem operations on collection object



6\. what happes if you dont write a constructor

java gives a default constructer automitically it helps create an object even if you dont write one







06-04-2026

Has only one answer for that our functional interface has only 1 abstract method A functional interface has only one abstract method As a function interface has only one abstract method it is used mainly with It is used mainly with Lambda expression It is used mainly for Lambda Expressions Examples It is mainly used by Lambda it is used mainly with Lambda Expressions Ranbir Kapoor comparator return Wild streams are used

Why streams are used CSTREAMS

Easy easy they support operations like Collections easily Streams are used to process collections easily

Springs are used to process collections in They support operations like They support operations like fil They support operations like Philtre by Samas Philtre, sort .They reduce score and improve readability

what is optional and why it exists?

optional is a container that maybe have a value

it is used to avoid null pointer exception

it provides safe methods like orelse

Java 8 introduced Streams,l Streams Lambda Optional

Java 17 adder Records, Pattern matching, Records, Better performance



Java 17 is More secure and modern

&#x20;

How to create Custom exceptions

Custom exception is created Custom exception Let's create that By extending exception class By external exception class Custom exception sbi tar by extending exception class We can define our own error message We can define our own error message We can define Our own yarn message Used for hand Used for handling Application specific errors Used for handling application Specific errors





07.04.2026
1.Height of a tee
height=no.of  levels(max depth)
think of an company heierachy
ceo->manager->employee

2.leaf node= No children
In company employees with no subordinates

Level order= Level order visit level by level Example social media Level 1 u level 2 fronts level 3 fronts of Franc Use rain shortest path network traversal Use rain shortest path network traversal Shortest path network traversal Network Network traversal Next in order

inorder= Left root right
Example sorted data retrieval

* Sorted data retrieval

Pre order=
example= hstructure Serial
Tree cloning serialisation
Root a letter writer supporters other folders structured subfolders
Write a tool

post-order=left right root Call the retirement home
Delete files first then folder Memory cleaner files deletion
Swap left and right Mirror image left becomes right .Use rain image processing UI reflections Image processing ui reflections

5.Diameter of 3 longest path
Example = Network cable longest distance between two systems
network design routing

6. balanced tree=high difference lesser than equal to one
Example =balance to organization Not too deep on one side
Using fast searching databases

Lowest common ancestor(LCA lowest common  parent)
ex= Common anxiety of two people yaadfamily tree Myself and my cousin have same grandparents Myself

7.binary search tree
left lesser than route lesser than right
ex=Dictionary words spotted
us thank youed in search engines



establish connection between connection interface
java application with database
it provides some methods like
createStatement()
preparedStatement()



1.what is the java collection framework
java collection framework is a set of classes is a set of classes and interface provided by java to store and manipulate the group of object it ptovides growable java structure and built methods in data



2.what id the diff btw start and run methods?
start methods creats new thread of execution and invokes the run method in the new thread varies run method executes code as a regular  method call in current thread it does not start



3.what is the thread lifecycle in java

thread object is considered in born state during object creation ,in born state there is multiple states



running-thread object considered in running state during run method inviked

in running state there can be single thread at a time ,during running state

notify open bracket close bracket



thread object considered in dead state after exit from run method there can be multiple thread



**08.04.2026**

1.what is graph?

a graph is a data structure with vertices (nodes) ex: people, cities ,systems.

edges(connection) relationship between them ex: social media =people +friendship



2.undirrected graph A ----- B

edges have no direction connection is 2 way a-b ,b-a (- = CONNECTED) ex: Facebook friendship(if a is friend of b then b is friend of a )

socail network, road connection



3.dirrected graph(di-graph)A -----> B

edges have direction instagram and twitter follow .a->b, but b may not follow a. follwer system task dependencies



4.weighted graph()

each edge has a weight(cost/distance) A ----5---- B

example :GMaps distance between cities time to travel uses shortest path network cost optimization



5.unweighted graph()A ---- B ---- C

all edges are equal (no weight)

finding min no.of steps

example=shortest number of trends to reach someone

uses bfs search ,



6.cyclic graph

contains a cycle(loop)

circular dependencies in software



A → B → C

↑       ↓

←-------



7.A-cyclic graph A → B → C → D

no cycle ,company hierarchy ,CEO-manager-employee

uses task scheduling



8.directed A-cyclic graph

example- build system

one task depends on another

uses: topological sort ,job scheduling



A → B → D

&#x20;\\      ↑

&#x20; → C ---



9.connected graph

all nodes are reachable

example: internet network (every computer can reach another)



10.disconnected graph A ---- B     C ---- D

some nodes are not connected

example: isolated users in a network, no friends and connection



11.complete graph

every node connects to every other node (fully connected)

ex: small team communication everyone talks to everyone

A ---- B

|\\    /|

| \\  / |

|  \\/  |

|  /\\  |

| /  \\ |

|/    \\|

C ---- D





Undirected:   A—B

Directed:     A→B

Weighted:     A—5—B

Cyclic:       A→B→C→A

Acyclic:      A→B→C

DAG:          A→B→C (no loop)

Connected:    A—B—C—D

Disconnected: A—B C—D

Complete:     All connected



Edges = n(n-1)/2

Edges = n(n-1)/2



Undirected	Two-way	        	Facebook

Directed	One-way			Instagram

Weighted	Has cost		Google Maps

Unweighted	Equal edges		BFS problems

Cyclic	        Has loop		Circular dependency

Acyclic	        No loop	        	Hierarchy

DAG	        Directed + no cycle	Task scheduling

Connected	All reachable		Internet

Disconnected	Separate parts		Isolated users

Complete	Fully connected		Team chat

Bipartite	2 groups		Job matching

Tree		No cycle + connected	File system









08.04.2026



string joiner is a final calss in java.util.package

we can create string using delimiter like,-prefix and suffix



2.what is the differs between throw and thows keyward in jabva

* they are used to handle exception
* throw-it us used to handle explicitly
* throws- it is used to declare that a method can throw can throw an exception



3.what is daemon thread

* it is the background thread that runs in the background to perform task such as garbage collection



given 2 integers a and b your task is to determine the sum of all the cubes of all numbers in the range of a-b

a=4

b=9

out=1989



2.you are organizing hottier ballon ride your are given an integer n number of people array weights of size n integer x is max capacity select people such that total weight lesser than equal to is x number of people is max return the count.



3.a parking lot charges vehicles based on the number of hours parked ,the charges are calculated first 2 hours 100,next 3 hors 50 per hour .remaning hour 20 per hour

if input not an integer error invalid input if error less than 0 -invalid hours



5

350



4.a gym offers membership plans for specific duration with fixed prices write a program to calculate the total cost of the membership based on the number of month

pricing-

1month-2000

3m=5000

6m=9000

9m=12000

12m=15000

if the given input match throw exception





5.given a range m,n both inclusive where 0<=m,n<=1lahk find the sum of all integers between m and n .

0 3

6

'

6.given a matrix size mxn print its elements in zig zag row vise pattern even rows =left to right ,odd rows =right to left

3x3

123

456

789



123

654

789



6.you are given n transaction each transaction each transaction contains sender ,receiver ,timestamp in sec ,amount validate transaction based on the following rules

* if any previous transaction has the same sender and receiver-print error duplicate transaction
* if time difference consecutive transaction is > 60 sec print fraud detected and stop
* if all transaction are valid print all are valid

3

a=100

b=500

c=120

d=300

e=150

f=200



out=all are valid



given an purchase amount applied discount and print final payable amount

discount rules

amount lesser than thousand is 5%

1000<-10%

amount>5000=15%

output print final amount rounded to 2 decimal places

input

800

out

760.00



in

3000

out

2700.00



in

6000

out

5100.00





generate the total number of valid sequences of soldiers

n=length of sequence

r=soldiers numbers from 1-r

end=last soldier

rules:

* first soldier must be one
* last must be end
* no 2 adjacent soldiers are equal
* repetations allowed

testcase

n=4

r=3

end=2

out=2



t2

n=2

r=2

end=2

out=1



t3

n=3

r=3

end=2

out=1





10.04.2026





given 2 arrays a and b of size n and m find the count of union elements of the 2 arrays n=5,a={12345} ,n=3,b=123 out=123



2.you are given an array prices where prices of i is the prices of given stock on the nth day you want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock return the maximum profit you can achieve from this transaction ,if you cannot achieve any profit return 0

input:an array of integer prices where prices of \[i] represents the prices of the stock of the nth day prices =7,1,5,3,6,4 print max profit of prices .out=5



3.input a3b5

out=aaabbbbb



4\. given an integer n convert all 0 of n to 5 example

in=1004

out=1554

in=123

out=123



5.handle both lower case and upper case zoho Interview. use a set for order of 1 lookup

out

z h  nt rv  w

&#x09;

6.overlapping intervels in an array input \[1,3],\[2,6]\[8,10]

\[1,6] \[8,10]









13.04.2026





for a movie theatre your goal is to analyze the ticket prices and filter out the odd priced tickets

output: compute the sum all odd ticket prices

compute the sum all odd ticket prices

compute the average all odd ticket prices



constrants =the avg must be accurate upto 2 decimel places

input

line: int n=no.of tickets line 2 n space separated integers representing ticket prices

example :input -4 ,ticket with prices 30,35,20,25

odd prices -35,25



sum 60

average=30.00



2.you are given 2 arrays representing the cost of blood and the cost of billings along with target total cost ,you need to calculate the total cost of a sandwitch that is closest to the target value

rules and constraints= bread you must choose exactly one bread from the bread cost array fillings ,you can choose 0,1 or more fillings from the filling cost array filling limit each filling can be used atmost 2 times

the tiebreaker -if two combinations result in a total cost equally close to the target return the smaller cost

input:

bread cost array

filling cost array

target integer



approach

this problem requires a recursion and dfs algorithm 2 explore all possible combinations

example=bread cost 5,7 filling cost 2,3 target 10 output 10(combinations include 5+2+3=10 or 7+3=10)







SQL

1.find duplicate records in a table

2.retry the second highest salary from employee table

3.find employees without department

4.write a query to create a trigger that log any delete section on the employee table

5.calcu

7.customers who make purchases but never returned products (Walmart)

8.show the count of orders per customer

9.retrieve all employees who joined in 2023

10.calculate average order value per customer

11.get the latest order places by each customer

12.flight number ending with 1 your output should have 5 columns cabin crew id first name last name ,last name, contact ,flight id.

13.the total number of passengers and total number of baggage for flights arriving in Paris on February 11,2024 -flight\_id,total passenger,total baggage

14.the number of women products available from the table named product

15.the train name and their type which have speed less than 50

17.get total revenue and total orders from region

18.count customers with more than 5 orders retry customers with orders above average order value

19.find all employees hired on weekends

20.find all employees with salary btw 50000 and 100000

21\. get monthly sales revenue

22.rank employees by salary within each department

23.find customers who placed every month in 2023

24.find moving average of sales over the last 3 days

25.identify the first and last order date for each customer show product sales distribution percent of total revenue retrieve customers who make consecutive purchase

26.find churned (no orders in last 6 months) customers

27.calculate cumulative revenue by day

28.identify top performing dept by average salary ,find customers who orders more than the average number of orders per customer

29.calculate revenue generated from customers (first time orders)

30.find the % of employees in each dept

31.the product of and of the product whose status are ion the transit hub   productid, name

32.retry the max salary difference within each department

33.find product that contribute to 80 % of the revenue (parito principle) 

34.show last purchase of each customer along with order amount.

35.calculate average time btw 2 purchases for each customer.

36.calculate year over year growth in revenue

37.detect customers whose purchase amount is higher than their historical  90%

38.the message id content where messages have "hello" in it 

39.the artist id name ,where the artist have the number in the name.

