# DSA Practice – October 2026 Target

## About
I am preparing for Software Development Engineer (SDE-1) roles at mid‑sized product companies across India (Noida, Mumbai, Hyderabad, Bangalore, Pune, Chennai).  
**Target interview month:** October 2026  

## Tracking Spreadsheet
[Link to my DSA tracker](https://docs.google.com/spreadsheets/d/15WzS5Y2ctfZ0l-fr2f4DPp2ZhxasnAeIRVmbQWHhnSw/edit?usp=sharing)  

## Problems Solved So Far

### Arrays (Week 1 – April 13, 2026)
| Problem | Solution | Optimal? | Follow‑up solved? |
|---------|----------|----------|-------------------|
| Product of Array Except Self (LC 238) | O(n) time, O(1) space (output array) | ✅ | N/A |
| Missing Number (LC 268) | Sum formula `n*(n+1)/2 - sum` | ✅ | ✅ (XOR method also implemented) |
| Find All Numbers Disappeared (LC 448) | In‑place negation | ✅ | ✅ |
| Maximum Subarray (LC 53) | Kadane’s algorithm | ✅ | N/A |

### Sliding Window (Week 2 – April 14/15, 2026)
| Problem | Solution | Optimal? | Notes |
|---------|----------|----------|-------|
| Minimum Size Subarray Sum (LC 209) | Sliding window – expand right, shrink left | ✅ | O(n) time, O(1) space |
| Fruit Into Baskets (LC 904) | Sliding window with at most 2 distinct fruits | ✅ | O(n) time, O(1) space |
| Longest Repeating Character Replacement (LC 424) | Sliding window with max frequency count | ✅ | O(n) time, O(1) space (26 letters) |

### Two Pointers (Week 3 – April 16, 17 and 19, 2026)
| Problem | Solution | Optimal? | Notes |
|---------|----------|----------|-------|
| Sort Colors (LC 75) | Dutch national flag algorithm (three pointers) | ✅ | O(n) time, O(1) space |
| 3Sum (LC 15) | Two pointers after sorting | ✅ | O(n²) time, O(1) extra space (excluding output) |
| 4Sum (LC 18) | Two pointers with nested loops | ✅ | O(n³) time, O(1) space. Learned: int overflow → double → long (best). |
| Container With Most Water (LC 11) | Two pointers – move the pointer with the smaller height inward | ✅ | O(n) time, O(1) space. Classic area maximisation problem. |

### Stack (Week 4 – April 19, 2026)
| Problem | Solution | Optimal? | Follow‑up solved? | Notes |
|---------|----------|----------|-------------------|-------|
| Min Stack (LC 155) | Two stacks – one for values, one for running minimum | ✅ (time) | ✅ (single‑stack diff method understood) | O(1) time all ops, O(n) extra space. Chose clarity over space micro‑optimisation. |

### Strings (Week 4 – April 20, 2026)
| Problem | Solution | Optimal? | Notes |
|---------|----------|----------|-------|
| Longest Palindromic Substring (LC 5) | Expand around center | ✅ | O(n²) time, O(1) space. Handled odd/even length palindromes. |
| String to Integer (atoi) (LC 8) | Iterate with edge case handling | ✅ | O(n) time, O(1) space. Trim, sign, overflow check, break on non‑digit. |
| Count and Say (LC 38) | Iterative string building | ✅ | O(2ⁿ) time worst? but O(n) with StringBuilder |
| Compare Version Numbers (LC 165) | Split by dots, parse integers, handle different lengths | ✅ | O(n+m) time, O(1) extra space |

### Binary Search (Week 5 – April 22/23, 2026)
| Problem | Solution | Optimal? | Notes |
|---------|----------|----------|-------|
| Find Peak Element (LC 162) | Binary search with `left < right` and `right = mid` | ✅ | O(log n) time, O(1) space |
| Find Minimum in Rotated Sorted Array (LC 153) | Binary search comparing `mid` with `right` | ✅ | O(log n) time; handles rotation gracefully |
| Search in Rotated Sorted Array (LC 33) | Find pivot then binary search, or single‑pass modified binary search | ✅ | O(log n) time, classic rotated array search |

### Redos (from earlier failed attempts)
- Valid Palindrome (LC 125) – O(1) space two pointers
- Longest Common Prefix (LC 14) – horizontal scanning

## Plan
- Follow a structured weekly checklist (Arrays → Sliding Window → Two Pointers → Strings → Sorting → Linked List → Stack/Queue → Heaps → Trees → Graphs → DP → Backtracking → Intervals → Greedy → Bit Manipulation → Mocks)
- Solve problems daily, push code to this repo
- Redo problems I previously saw solutions for (spaced repetition)
- Build two projects (URL Shortener, Task Manager API)
- Give mock interviews and apply to 40+ companies

## Progress
- Start date: April 12, 2026
- LeetCode problems solved: 21 (will update daily)

## Redo List (problems to revisit)
- [x] 3Sum (solved early on Apr 16) ✅
- [x] Container With Most Water (solved early on Apr 19) ✅
- [x] Min Stack (solved early on Apr 19) ✅ – two‑stack O(1) time, O(n) space; single‑stack trade‑off understood
- [x] Find Minimum in Rotated Sorted Array (scheduled May 16) → **now prioritized for Apr 23**
- [x] Search in Rotated Sorted Array (LC 33) → **add to redo, scheduled Apr 23**
- [ ] Search in Rotated Sorted Array II (LC 81) → **add to redo, scheduled Apr 24**
- [ ] Copy List with Random Pointer (scheduled May 26)
- [ ] Merge k Sorted Lists (scheduled May 27)
- [ ] Generate Parentheses (scheduled Jun 6)
- [ ] Task Scheduler (scheduled Jul 7)
- [ ] Longest Consecutive Sequence (scheduled Aug 18)
- [ ] Minimum Window Substring (scheduled Aug 20)
- [ ] Next Permutation (scheduled Aug 22)
- [ ] Koko Eating Bananas (scheduled Aug 23)
- [ ] Time‑Based Key‑Value Store (scheduled Aug 24)
- [ ] Car Fleet (scheduled Aug 25)
- [ ] Minimum Remove to Make Valid Parentheses (scheduled Aug 26)
- [ ] Design Circular Queue (scheduled Aug 27)

## Projects
- [ ] URL Shortener (June 7–13)
- [ ] Task Manager API (July 5–11)

## How to use this repo
Each solved problem is saved under its topic folder with date and complexity notes.  
Daily commits keep me accountable.
