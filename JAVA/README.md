# 365-Day Java Curriculum
### 10 minutes a day, zero to "understand any Java code shown to me"

**How this works:** Each day = 1 new concept + 1 short code example + 1 small exercise you type and run yourself. Every day builds directly on the last. Milestone checkpoints appear every 30 days so you can confirm real progress, not just completion.

This file has two parts:
1. **Full year roadmap** — every day's topic, all 365 days, organized by month
2. **Detailed lessons for Days 1–14** — the exact format each day will follow (concept, code, exercise)

Once you've worked through Days 1–14, ask me for the next batch and I'll write out Days 15–30 in the same detailed format. Writing all 365 full lessons at once would make this file unusably long — better to build it as you go.

---

## FULL YEAR ROADMAP

### Month 1 (Days 1–30): Fundamentals
1. What is Java? Installing JDK, writing/running "Hello World"
2. Variables and data types (int, double, char, boolean)
3. Arithmetic and assignment operators
4. Strings and concatenation
5. Comments and code readability
6. Type casting and conversion
7. Getting user input (Scanner)
8. if / else statements
9. Comparison and logical operators (&&, ||, !)
10. Nested if statements
11. switch statements
12. while loops
13. do-while loops
14. for loops
15. Nested loops
16. break and continue
17. Arrays: declaring and initializing
18. Looping through arrays
19. Multidimensional arrays
20. Methods: declaring and calling
21. Method parameters and return values
22. Method overloading
23. Variable scope (local vs. class-level)
24. Recursion basics
25. Static vs. instance context (intro)
26. String methods (length, substring, indexOf, etc.)
27. Formatting output (printf, String.format)
28. Practice project: build a simple calculator
29. Practice project: expand the calculator (menu, loop until quit)
30. **Milestone Checkpoint #1** — You should be able to write a program using variables, loops, conditionals, arrays, and methods together without looking anything up.

### Month 2 (Days 31–60): Object-Oriented Programming
31. What is OOP? Classes and objects
32. Fields and constructors
33. The `this` keyword
34. Instance methods
35. Getters and setters (encapsulation)
36. Access modifiers (public, private, protected)
37. Static fields and methods
38. The `final` keyword
39. Constructor overloading
40. Object composition ("has-a" relationships)
41. Inheritance basics (`extends`)
42. The `super` keyword
43. Method overriding
44. Polymorphism (why it matters)
45. `instanceof` and casting objects
46. Abstract classes
47. Interfaces basics
48. Implementing multiple interfaces
49. Abstract class vs. interface — when to use which
50. Enums
51. Object class methods: toString(), equals(), hashCode()
52. Packages and imports
53. Practice project: Library system (Day 1 — model Book, Member classes)
54. Practice project: Library system (Day 2 — inheritance for different member types)
55. Practice project: Library system (Day 3 — interfaces for borrowable items)
56. Practice project: Library system (Day 4 — polish and test)
57. Nested and inner classes
58. Anonymous classes (intro)
59. Records (Java 16+ shorthand for data classes)
60. **Milestone Checkpoint #2** — You should be able to design a small system using multiple interacting classes, inheritance, and interfaces.

### Month 3 (Days 61–90): Exceptions, Collections, Generics
61. Exception handling: try/catch
62. Multiple catch blocks, finally
63. Custom exceptions
64. Checked vs. unchecked exceptions
65. try-with-resources
66. Introduction to the Collections framework
67. ArrayList
68. LinkedList (and how it differs from ArrayList)
69. HashMap
70. HashSet
71. TreeMap and TreeSet (sorted collections)
72. Iterating collections (for-each and Iterator)
73. Generics basics (why `List<String>` instead of raw `List`)
74. Generic methods and classes
75. Bounded type parameters
76. Comparable interface (natural ordering)
77. Comparator interface (custom ordering)
78. Sorting collections
79. Nested collections (List of Maps, etc.)
80. Practice project: Contact manager (Day 1 — model + ArrayList storage)
81. Practice project: Contact manager (Day 2 — search/sort with Comparator)
82. Practice project: Contact manager (Day 3 — HashMap for fast lookup)
83. Practice project: Contact manager (Day 4 — polish and test)
84. StringBuilder (mutable strings)
85. Regular expressions basics
86. Wrapper classes (Integer, Double, etc.) and autoboxing
87. Arrays vs. Collections — when to use which
88. Deque and Queue interfaces
89. Immutable collections (List.of, Map.of)
90. **Milestone Checkpoint #3** — You should be able to choose the right collection for a problem and use generics without thinking twice.

### Month 4 (Days 91–120): File I/O and Functional Programming
91. Reading files (basic file reading)
92. Writing files
93. Working with file paths (Path, Files classes)
94. Introduction to lambda expressions
95. Functional interfaces (what makes something "functional")
96. Predicate, Function, Consumer, Supplier
97. Introduction to Streams
98. Stream operations: map and filter
99. Stream operations: reduce and collect
100. Optional class (avoiding null)
101. Method references (`Class::method` syntax)
102. Practice: refactor Month 1–3 loops into streams
103. Date and Time API: LocalDate, LocalDateTime
104. Formatting and parsing dates
105. Duration and Period (time calculations)
106. Practice project: Task scheduler (Day 1 — model tasks with dates)
107. Practice project: Task scheduler (Day 2 — filter/sort with streams)
108. Practice project: Task scheduler (Day 3 — save/load from file)
109. Practice project: Task scheduler (Day 4 — polish and test)
110. Working with CSV-style text data
111. try-with-resources for file handling (revisited, deeper)
112. Collectors: groupingBy, joining, counting
113. Stream.of, IntStream, and numeric streams
114. Parallel streams (concept — when and why)
115. Practice: build a simple text-based data report generator
116. Practice project continued
117. Practice project continued
118. Recap: connecting OOP + collections + streams
119. Common stream/lambda mistakes to avoid
120. **Milestone Checkpoint #4** — You should be able to process a collection of data using streams instead of manual loops, and read/write simple files.

### Month 5 (Days 121–150): Concurrency
121. What is a thread? Creating threads (Thread class)
122. The Runnable interface
123. Thread lifecycle (new, runnable, running, dead)
124. Synchronized methods and blocks
125. Race conditions — what they are and why they happen
126. Thread safety basics
127. ExecutorService — managing threads properly
128. Callable and Future
129. Thread pools
130. Concurrent collections (ConcurrentHashMap)
131. Atomic variables (AtomicInteger, etc.)
132. Practice project: Multithreaded counter (Day 1 — build the unsafe version, see it break)
133. Practice project: Multithreaded counter (Day 2 — fix it with synchronization)
134. Deadlocks — what causes them and how to avoid them
135. Producer-consumer pattern
136. wait() and notify() basics
137. CompletableFuture — running async code
138. Chaining async operations
139. Practice project: Simulated file downloader (Day 1 — sequential version)
140. Practice project: Simulated file downloader (Day 2 — concurrent version)
141. Common concurrency pitfalls
142. When NOT to use multiple threads
143. Volatile keyword
144. Thread interruption handling
145. Practice: stress-test your counter project
146. Recap: concurrency vocabulary check
147. Reading real-world concurrent code (guided example)
148. Practice project continued
149. Practice project continued
150. **Milestone Checkpoint #5** — You should understand why concurrency bugs happen and be able to write basic thread-safe code.

### Month 6 (Days 151–180): Design Patterns and Clean Code
151. What are design patterns and why they matter
152. Singleton pattern
153. Factory pattern
154. Builder pattern
155. Observer pattern
156. Strategy pattern
157. Decorator pattern
158. Adapter pattern
159. Command pattern
160. Practice: refactor Month 2's Library project using 2 patterns
161. Practice project continued
162. SOLID — Single Responsibility & Open/Closed
163. SOLID — Liskov Substitution & Interface Segregation
164. SOLID — Dependency Inversion
165. Clean code: naming things well
166. Clean code: function/method size and focus
167. Code smells — recognizing them
168. Refactoring practice: fixing a messy example
169. Practice: refactor your own earlier project for cleanliness
170. Practice project continued
171. Introduction to unit testing — why test?
172. JUnit basics: writing your first test
173. Assertions (assertEquals, assertTrue, etc.)
174. Testing edge cases
175. Test-driven development (TDD) — the basic loop
176. Practice: add tests to your Contact Manager project
177. Practice project continued
178. Mocking basics (why and when)
179. Recap: patterns + clean code + testing
180. **Milestone Checkpoint #6** — You should be able to look at messy code and identify what pattern or principle would improve it.

### Month 7 (Days 181–210): Build Tools and Version Control
181. Introduction to Maven — what problem it solves
182. Maven project structure and pom.xml
183. Managing dependencies with Maven
184. Maven build lifecycle (compile, test, package)
185. Introduction to Gradle (how it compares to Maven)
186. Practice: convert a project to Maven
187. Git basics: init, add, commit
188. Git branching
189. Merging and resolving conflicts
190. Git log, diff, and history
191. GitHub basics: remotes, push, pull
192. Pull requests and code review basics
193. .gitignore and repo hygiene
194. Writing a good commit message
195. Practice: put your Task Scheduler project on GitHub properly
196. Practice project continued
197. Semantic versioning basics
198. Reading a real open-source project's structure (guided)
199. Practice: full project setup — Maven + Git + tests together
200. Practice project continued
201. Practice project continued
202. Logging basics (why print statements aren't enough)
203. Introduction to SLF4J
204. Practice: add logging to an existing project
205. Recap: professional project setup checklist
206. Practice: apply the checklist to a new mini-project
207. Practice project continued
208. Practice project continued
209. Recap: tools + workflow
210. **Milestone Checkpoint #7** — You should be able to set up a real project from scratch with proper structure, version control, and dependency management.

### Month 8 (Days 211–240): Databases and JDBC
211. What is a relational database? Core SQL concepts
212. SELECT and WHERE — basic queries
213. INSERT, UPDATE, DELETE
214. JOIN basics (combining tables)
215. Primary keys and foreign keys
216. Introduction to JDBC
217. Connecting Java to a database
218. Executing queries via JDBC
219. PreparedStatement — and why it prevents SQL injection
220. Handling ResultSet
221. Connection pooling — the concept
222. Practice project: CRUD app (Day 1 — connect + create table)
223. Practice project: CRUD app (Day 2 — insert/read)
224. Practice project: CRUD app (Day 3 — update/delete)
225. Practice project: CRUD app (Day 4 — polish and error handling)
226. Introduction to ORMs — what problem they solve
227. Intro to Hibernate/JPA concepts
228. Entity mapping basics (@Entity, @Id)
229. Repositories — the pattern behind data access
230. Practice: convert part of your CRUD app to use JPA-style entities
231. Transactions — what they are and why they matter
232. Database design basics: normalization (intro)
233. Practice: design a small schema for a new app idea
234. Practice project continued
235. Indexes — what they do and why they matter
236. Common database performance mistakes
237. Practice: build a small DB-backed app end to end
238. Practice project continued
239. Recap: databases + JDBC + JPA basics
240. **Milestone Checkpoint #8** — You should be able to design a simple schema and read/write to a database from Java code.

### Month 9 (Days 241–270): Spring Framework Basics
241. What is Spring? Why frameworks exist
242. Dependency Injection — the core idea
243. Inversion of Control explained simply
244. Spring Boot project setup
245. Key annotations: @Component, @Autowired, @Service
246. application.properties / configuration basics
247. Building your first REST controller
248. HTTP methods in Spring: GET, POST, PUT, DELETE
249. Handling request/response bodies
250. Practice project: REST API (Day 1 — set up project + first endpoint)
251. Practice project: REST API (Day 2 — CRUD endpoints)
252. Spring Data JPA — repositories made easy
253. Connecting Spring Boot to a real database
254. Practice project: REST API (Day 3 — connect to database)
255. Practice project: REST API (Day 4 — polish and test endpoints)
256. Validation basics (@Valid, constraints)
257. Exception handling in Spring (@ControllerAdvice)
258. DTOs — why not expose entities directly
259. Practice: add validation + proper error handling to your API
260. Practice project continued
261. Spring Security — the basic concept
262. Authentication vs. authorization
263. Practice: add basic security to your API
264. Practice project continued
265. Logging and monitoring in a Spring app
266. Practice: add logging to your API
267. Reading a real Spring Boot open-source project (guided)
268. Recap: Spring vocabulary check
269. Practice project continued
270. **Milestone Checkpoint #9** — You should be able to build a working REST API with a database behind it from scratch.

### Month 10 (Days 271–300): Advanced Spring and Real-World Practices
271. RESTful API design principles (good vs. bad API design)
272. Layered architecture: Controller → Service → Repository
273. Working with JSON (Jackson, how Spring handles it automatically)
274. Practice: refactor your API into proper layers
275. Testing Spring apps: integration tests intro
276. MockMvc basics
277. Practice: write tests for your API
278. Practice project continued
279. Consuming external APIs (RestTemplate / WebClient)
280. Practice: call a public API from your app and use the data
281. Practice project continued
282. Packaging a Spring Boot app (the JAR)
283. Introduction to Docker — the concept, not the deep-dive
284. Practice: read a Dockerfile and understand what it does
285. Environment profiles (dev vs. prod configuration)
286. Practice: add a dev/prod config split to your project
287. API versioning basics
288. Pagination and filtering in APIs
289. Practice: add pagination to your API
290. Practice project continued
291. Rate limiting — the concept
292. Caching basics (why and when)
293. Practice: add simple caching to your API
294. Practice project continued
295. Full project polish day
296. Full project polish day
297. Writing a good README for your project
298. Recap: everything from Month 9–10 together
299. Practice: present your API project as if to an interviewer
300. **Milestone Checkpoint #10** — You should be able to build, test, and explain a real backend project end to end.

### Month 11 (Days 301–330): JVM Internals and Performance
301. What is the JVM? Bytecode, compilation basics
302. Memory model: stack vs. heap
303. Garbage collection — the basic idea
304. Common GC algorithms (overview, not deep math)
305. What causes memory leaks in Java
306. Profiling — the concept of measuring before optimizing
307. Efficient collection usage (avoiding common performance traps)
308. Why immutability helps performance and safety
309. Reflection basics — inspecting classes at runtime
310. Creating custom annotations
311. Practice: build a tiny tool using reflection
312. Class loading — how Java finds and loads classes
313. JVM tuning — high-level concepts (heap size, etc.)
314. Practice: analyze a slow method and figure out why
315. Advanced generics: bounded types, wildcards, PECS principle
316. Varargs (variable-length arguments)
317. Practice: refactor earlier generic code to be cleaner
318. Java Platform Module System — the basics
319. Practice: modularize a small project
320. Practice project continued
321. Equality deep dive: == vs equals() vs hashCode() contracts
322. Common interview questions about JVM internals (guided review)
323. Practice: explain garbage collection out loud/in writing
324. Practice: explain stack vs. heap out loud/in writing
325. Recap: performance vocabulary check
326. Reading a performance-focused blog post (guided, applied)
327. Practice: apply one optimization to an earlier project
328. Practice project continued
329. Recap: JVM internals overview
330. **Milestone Checkpoint #11** — You should be able to explain how Java manages memory and why certain code is slow or fast.

### Month 12 (Days 331–365): Capstone Project and Real-World Readiness
331. Code review best practices — what to look for
332. Practice: review a piece of your own old code critically
333. How to read unfamiliar open-source code (a repeatable approach)
334. Practice: pick a small open-source repo and map its structure
335. Javadoc and writing good documentation
336. Capstone planning: pick your project idea and scope it
337. Capstone: design the architecture (layers, entities, endpoints)
338. Capstone: set up the project (Maven/Gradle + Git + Spring Boot)
339. Capstone: build core data models
340. Capstone: build repository layer
341. Capstone: build service layer
342. Capstone: build REST controllers
343. Capstone: connect to database
344. Capstone: add validation and error handling
345. Capstone: add tests
346. Capstone: add authentication/security
347. Capstone: add logging
348. Capstone: refactor for clean code
349. Capstone: apply a design pattern where it fits
350. Capstone: performance pass (check for obvious issues)
351. Capstone: write the README
352. Capstone: polish and bug fixes
353. Capstone: polish and bug fixes
354. Capstone: prepare a walkthrough (as if presenting to an employer)
355. Full-year recap: Fundamentals → OOP (self-test)
356. Full-year recap: Collections → Streams (self-test)
357. Full-year recap: Concurrency → Patterns (self-test)
358. Full-year recap: Spring → Databases (self-test)
359. Full-year recap: JVM → Performance (self-test)
360. Identify your weakest area from the recaps and revisit it
361. Practice: mock code review of your capstone (self or ask me)
362. Practice: mock technical interview questions (Java fundamentals)
363. Practice: mock technical interview questions (system/API design)
364. Final review and reflection — how far you've come since Day 1
365. **Milestone Checkpoint #12 (Final)** — You should be able to read Java code from any developer — fundamentals, OOP, collections, streams, concurrency, patterns, Spring, databases, JVM concepts — and understand what it's doing without unfamiliar gaps.

---

## DETAILED LESSONS: DAYS 1–14

### Day 1: What is Java? Setup + Hello World

**Concept:** Java is a compiled, object-oriented language. Your code is compiled into "bytecode" that runs on the Java Virtual Machine (JVM) — this is why Java code runs the same way on Windows, Mac, or Linux. Every Java program starts execution from a `main` method.

**Code example:**
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

**Exercise:** Install a JDK (Java Development Kit) if you haven't already, and an editor (IntelliJ IDEA Community Edition is a solid free choice). Create a file called `HelloWorld.java`, type the code above exactly, and run it. Then change the message to print your name instead.

---

### Day 2: Variables and Data Types

**Concept:** A variable stores a value in memory. Java is "statically typed" — you must declare what type of data a variable holds. The core primitive types: `int` (whole numbers), `double` (decimals), `char` (single character), `boolean` (true/false).

**Code example:**
```java
int age = 21;
double price = 19.99;
char grade = 'A';
boolean isStudent = true;

System.out.println(age);
System.out.println(price);
System.out.println(grade);
System.out.println(isStudent);
```

**Exercise:** Create variables for your age, your height (as a double), the first letter of your name (as a char), and whether you like coding (as a boolean). Print all four.

---

### Day 3: Arithmetic and Assignment Operators

**Concept:** Java supports standard math operators: `+ - * / %` (modulus/remainder). Assignment operators like `+=`, `-=`, `*=` let you update a variable based on its current value.

**Code example:**
```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3 (integer division!)
System.out.println(a % b); // 1 (remainder)

a += 5; // same as a = a + 5
System.out.println(a); // 15
```

**Exercise:** Write a program with two int variables. Print the result of all five operators (`+ - * / %`) applied to them. Then use `+=` to add 10 to one of them and print the new value.

---

### Day 4: Strings and Concatenation

**Concept:** A `String` is a sequence of characters, wrapped in double quotes. Unlike primitives, String is an object. You combine strings with `+` (concatenation), and you can mix strings with numbers this way too.

**Code example:**
```java
String firstName = "Alex";
String lastName = "Rivera";
String fullName = firstName + " " + lastName;

int age = 21;
String message = "Hi, I'm " + fullName + " and I'm " + age + " years old.";

System.out.println(fullName);
System.out.println(message);
```

**Exercise:** Create a String for your favorite hobby and an int for how many years you've done it. Print a sentence combining both using concatenation, e.g. "I've been coding for 2 years."

---

### Day 5: Comments and Code Readability

**Concept:** Comments are notes in your code that Java ignores when running — they're for humans reading the code. `//` for a single line, `/* ... */` for multiple lines. Good comments explain *why*, not just *what* (the code already shows what).

**Code example:**
```java
// Calculate the total price including tax
double price = 50.0;
double taxRate = 0.08; // 8% tax

/*
   This is a multi-line comment.
   Useful for longer explanations.
*/
double total = price + (price * taxRate);
System.out.println(total);
```

**Exercise:** Take your Day 4 program and add a comment above each variable explaining what it represents. Add one multi-line comment at the top of the file describing what the program does overall.

---

### Day 6: Type Casting and Conversion

**Concept:** Sometimes you need to convert between types — e.g., an `int` to a `double`, or a `String` to an `int`. "Widening" (int → double) happens automatically. "Narrowing" (double → int) needs an explicit cast and can lose data.

**Code example:**
```java
int wholeNumber = 7;
double decimalNumber = wholeNumber; // automatic widening: 7.0

double pi = 3.14159;
int truncatedPi = (int) pi; // explicit narrowing cast: 3

String numberAsText = "42";
int parsedNumber = Integer.parseInt(numberAsText); // String to int

System.out.println(decimalNumber);
System.out.println(truncatedPi);
System.out.println(parsedNumber);
```

**Exercise:** Create a double variable with a decimal value. Cast it to an int and print both the original and the casted version — notice what happens to the decimal part. Then take a String like `"100"` and convert it to an int using `Integer.parseInt`.

---

### Day 7: Getting User Input (Scanner)

**Concept:** Programs become interactive with the `Scanner` class, which reads input typed by the user while the program is running. You import it from `java.util`, then use methods like `.nextLine()` (for text) or `.nextInt()` (for numbers).

**Code example:**
```java
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Hi " + name + ", you are " + age + " years old.");
    }
}
```

**Exercise:** Write a program that asks the user for their favorite hobby and how many years they've practiced it, then prints a sentence combining the two inputs — same as Day 4, but now with real user input instead of hardcoded values.

---

### Day 8: if / else Statements

**Concept:** `if` runs a block of code only when a condition is true. `else` runs when it's false. This is how your program makes decisions.

**Code example:**
```java
int age = 20;

if (age >= 18) {
    System.out.println("You're an adult.");
} else {
    System.out.println("You're a minor.");
}
```

**Exercise:** Write a program that checks if a number is positive or negative and prints the result.

---

### Day 9: Comparison and Logical Operators (&&, ||, !)

**Concept:** Comparison operators (`==`, `!=`, `>`, `<`, `>=`, `<=`) compare values and return true/false. Logical operators combine multiple conditions: `&&` (both must be true), `||` (at least one true), `!` (flips true/false).

**Code example:**
```java
int age = 25;
boolean hasID = true;

if (age >= 18 && hasID) {
    System.out.println("Allowed entry.");
} else {
    System.out.println("Not allowed.");
}
```

**Exercise:** Write a program checking if a number is between 10 and 20 (inclusive) using `&&`.

---

### Day 10: Nested if Statements

**Concept:** You can put an `if` statement inside another `if` statement to check more specific conditions after a general one is met.

**Code example:**
```java
int score = 85;

if (score >= 60) {
    if (score >= 90) {
        System.out.println("Grade: A");
    } else {
        System.out.println("Grade: Pass");
    }
} else {
    System.out.println("Grade: Fail");
}
```

**Exercise:** Write a nested if that categorizes a number as negative, zero, small positive (1-100), or large positive (100+).

---

### Day 11: switch Statements

**Concept:** `switch` is a cleaner alternative to many `if/else if` chains when checking one variable against several exact values.

**Code example:**
```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Unknown day");
}
```

**Exercise:** Write a switch statement that prints the name of a month given its number (1-12).

---

### Day 12: while Loops

**Concept:** A `while` loop repeats a block of code as long as a condition stays true. It checks the condition *before* each run.

**Code example:**
```java
int count = 1;

while (count <= 5) {
    System.out.println("Count: " + count);
    count++;
}
```

**Exercise:** Write a while loop that prints all even numbers from 2 to 20.

---

### Day 13: do-while Loops

**Concept:** A `do-while` loop is like `while`, but it checks the condition *after* running the block — so it always runs at least once, even if the condition is false from the start.

**Code example:**
```java
int count = 1;

do {
    System.out.println("Count: " + count);
    count++;
} while (count <= 5);
```

**Exercise:** Write a do-while loop that asks the user (via Scanner) for a number, and keeps asking until they enter a number greater than 0.

---

### Day 14: for Loops

**Concept:** A `for` loop packs initialization, condition, and increment into one line — useful when you know how many times you want to repeat something.

**Code example:**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}
```

**Exercise:** Write a for loop that prints the multiplication table (1 to 10) for a number of your choice.

---

**Next step:** Once you've worked through Days 1–14, come back and ask for Days 15–21 (or however far you want the next batch to go) and I'll write them in this same format.
