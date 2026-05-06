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

## 6. HashMap

```java
Map<String, Integer> map = new HashMap<>();
map.put("key", 10);                               // insert
int val = map.getOrDefault("key", 0);            // get with default
boolean hasKey = map.containsKey("key");         // check existence
```

## 7. Character Checks

```java
Character.isDigit(c)        // is digit? (0-9)
Character.isLetter(c)       // is letter? (a-z, A-Z)
c >= '0' && c <= '9'        // manual digit check (faster)
```

## 8. Loops

```java
// Index loop
for (int i = 0; i < n; i++) { }

// For-each
for (int num : arr) { }

// While
while (condition) { }
```

## 9. Common Mistakes

| Wrong |	Correct |
|-------|---------|
| `s1 == s2` | `s1.equals(s2)` |
| `s.length` |	`s.length()` |
| `arr.length()` |	`arr.length` |
| `Integer.parseInt(s.charAt(i))` |	`s.charAt(i) - '0'` |

