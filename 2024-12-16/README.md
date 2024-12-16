# LeetCode Problem 3264 - Final Array State After K Multiplications

## Problem Description  
You are given an integer array `nums`, an integer `k`, and a `multiplier`. You need to perform the following operation exactly `k` times:  

1. Find the smallest element in the array.  
2. Multiply it by the `multiplier`.  
3. Update the array with the new value.  

Return the final state of the array after all operations.

---

### Examples  
**Example 1:**  
```
Input: nums = [1, 2, 3], k = 2, multiplier = 3  
Output: [3, 6, 3]  
Explanation:  
- Iteration 1: The smallest element is 1 → Multiply it: 1 * 3 = 3. Updated array: [3, 2, 3].  
- Iteration 2: The smallest element is 2 → Multiply it: 2 * 3 = 6. Updated array: [3, 6, 3].
```

**Example 2:**  
```
Input: nums = [5, 8, 7], k = 3, multiplier = 2  
Output: [20, 16, 14]  
```

**Example 3:**  
```
Input: nums = [0, 0, 0], k = 3, multiplier = 5  
Output: [0, 0, 0]  
Explanation: Multiplying 0 by any value still results in 0.
```

---

### Constraints  
- `1 <= nums.length <= 10^5`  
- `1 <= k <= 10^5`  
- `1 <= multiplier <= 10^3`  
- `-10^3 <= nums[i] <= 10^3`  

---

## Solution Explanation  
The Java solution uses an iterative approach to find the smallest element and update it:  

1. **Finding the Smallest Element**:  
   - A helper method `findMin()` iterates through the array to locate the index of the smallest element.  

2. **Performing Operations**:  
   - For `k` iterations, find the smallest element, multiply it by the `multiplier`, and replace its value in the array.  

3. **Efficiency**:  
   - Since the operation is repeated `k` times, each requiring `O(n)` time to find the minimum, the overall time complexity is **O(k * n)**.  

## Key Takeaways  
- **Array Manipulation**: Finding and updating elements efficiently within an array.  
- **Iterative Operations**: Repeating the same operation multiple times on a dynamic array.  
- **Brute Force Approach**: While not optimal for very large inputs, the implementation is clear and effective for moderate constraints.

---

## Complexity Analysis  
- **Time Complexity**: **O(k * n)** where `n` is the array size and `k` is the number of iterations.  
- **Space Complexity**: **O(1)** as no additional data structures are used.  

---

## Tags  
- Array  
- Brute Force  
- Greedy  

---

Feel free to check out the code files for each solution:

C Code: final_array_state.java
If you have any suggestions or optimizations, contributions are welcome! 🚀  

Happy coding! 😊
