# Java Cheat Sheet for DSA (Common Syntax Only)

## 1. String & StringBuilder

| Task | Syntax |
|------|--------|
| Length | `s.length()` |
| Char at index | `s.charAt(i)` |
| Substring | `s.substring(start, end)` |
| Split | `s.split("/")` |
| Convert to char array | `s.toCharArray()` |
| String equality | `s1.equals(s2)` |
| StringBuilder create | `StringBuilder sb = new StringBuilder()` |
| Append | `sb.append("text")` |
| Reverse | `sb.reverse()` |
| Clear | `sb.setLength(0)` |
| To string | `sb.toString()` |

## 2. Type Conversions

| Task | Syntax |
|------|--------|
| String to int | `Integer.parseInt(str)` |
| Int to string | `Integer.toString(num)` |
| Char to string | `String.valueOf(c)` |
| Char digit to int | `c - '0'` |

## 3. Arrays

| Task | Syntax |
|------|--------|
| Sort | `Arrays.sort(arr)` |
| Length | `arr.length` |
| Print | `Arrays.toString(arr)` |

## 4. Stack (Deque)

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(10);           // push
int top = stack.pop();    // pop
int peek = stack.peek();  // peek
boolean empty = stack.isEmpty();
```

## 5. Queue (Deque)

```java
Deque<Integer> queue = new ArrayDeque<>();
queue.offer(10);          // add to end
int front = queue.poll(); // remove from front
int peek = queue.peek();  // view front
boolean empty = queue.isEmpty();
```

## 6. Deque (all methods)

```java
Deque<Integer> dq = new ArrayDeque<>();

// Add
dq.offerFirst(30);        // add to front (returns false if full)
dq.offerLast(40);         // add to end (returns false if full)

// Remove
int pollFirst = dq.pollFirst(); // remove front (null if empty)
int pollLast = dq.pollLast();   // remove end (null if empty)

// View
int peekFirst = dq.peekFirst(); // view front (null if empty)
int peekLast = dq.peekLast();   // view end (null if empty)

// Others
int size = dq.size();
boolean empty = dq.isEmpty();
dq.clear();
```

## 7. HashMap

```java
Map<String, Integer> map = new HashMap<>();
map.put("key", 10);                               // insert
int val = map.getOrDefault("key", 0);            // get with default
boolean hasKey = map.containsKey("key");         // check existence
map.remove("key");                     // removes key-value pair
map.clear()                     // clear
```

## 8. Character Checks

```java
Character.isDigit(c)        // is digit? (0-9)
Character.isLetter(c)       // is letter? (a-z, A-Z)
c >= '0' && c <= '9'        // manual digit check (faster)
```

## 9. Loops

```java
// Index loop
for (int i = 0; i < n; i++) { }

// For-each
for (int num : arr) { }

// While
while (condition) { }
```

## 10. Common Mistakes

| Wrong |	Correct |
|-------|---------|
| `s1 == s2` | `s1.equals(s2)` |
| `s.length` |	`s.length()` |
| `arr.length()` |	`arr.length` |
| `Integer.parseInt(s.charAt(i))` |	`s.charAt(i) - '0'` |

## What was fixed?

1. Added **closing backticks** (```` ``` ````) after each code block (sections 4–8).
2. Fixed the **Common Mistakes table** – now has proper markdown table format with pipes `|` and dashes.

