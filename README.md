# Java Hashing Practice Codes

Topics covered:

1. Frequency count using HashMap
2. Count duplicate numbers
3. Remove duplicates using HashSet
4. Character frequency
5. First non-repeating character
6. First repeating element
7. Two Sum using HashMap
8. Array intersection
9. Array union
10. Anagram checking
11. Subarray sum equals K
12. Longest consecutive sequence
13. HashMap basic operations
14. HashSet basic operations
15. Word frequency

Core methods to remember:

HashMap:
- put(key, value)
- get(key)
- getOrDefault(key, defaultValue)
- containsKey(key)
- remove(key)
- entrySet()

HashSet:
- add(value)
- contains(value)
- remove(value)
- size()

Important pattern:

map.put(x, map.getOrDefault(x, 0) + 1);

This is commonly used for frequency counting.
