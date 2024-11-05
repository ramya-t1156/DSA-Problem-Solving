# LeetCode Problem 1 - Two Sum

## Problem Description
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

### Examples

- **Example 1:**
  - **Input:** `nums = [2,7,11,15]`, `target = 9`
  - **Output:** `[0,1]`
  - **Explanation:** Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

- **Example 2:**
  - **Input:** `nums = [3,2,4]`, `target = 6`
  - **Output:** `[1,2]`

- **Example 3:**
  - **Input:** `nums = [3,3]`, `target = 6`
  - **Output:** `[0,1]`

### Constraints
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

## Solution Explanation

For the "Two Sum" problem, I approached it using two different methods:

1. **Brute Force Approach in C**:
   - In C, I used a brute-force method with a nested loop. The outer loop picks each number in the `nums` array, and the inner loop checks if there's another number in the rest of the array that, when added to the current number, equals the `target`.
   - If a match is found, the indices of the two numbers are stored in an array, which is returned as the result.
   - This approach has a **time complexity of O(n²)** because each element is compared with every other element in the list.
   - This method is simple but efficient enough for small arrays; however, it becomes slow for larger inputs due to its nested loops.

2. **Optimized Approach in Python Using a Dictionary (Hash Map)**:
   - In Python, I used a dictionary (or hash map) to store the indices of numbers as we iterate through the `nums` array.
   - For each number, I calculate its "complement," which is the value that, when added to the current number, will equal the `target`.
   - If the complement already exists in the dictionary, I immediately return the indices of the current number and its complement.
   - This approach has a **time complexity of O(n)** since it only requires a single pass through the list, significantly improving efficiency.
   - The dictionary approach allows for quick lookups and avoids the need for nested loops, making it more suitable for larger inputs.

### Solution Code

- **C Solution**: See `two_sum.c`
- **Python Solution**: See `two_sum.py`

### Key Takeaways
- **Efficiency of Data Structures**: Using a dictionary in Python makes the solution more efficient, as dictionaries provide fast O(1) average-time complexity for lookups.
- **Language Strengths**: Implementing the solution in C reinforces lower-level concepts like memory allocation, while Python's built-in data structures allow for quicker and more optimized solutions.
- **Problem-Solving Approach**: Starting with a brute-force solution helps establish an understanding of the problem, while a more optimized approach improves performance.

---

Feel free to check out the code files for each solution:

- **C Code**: [two_sum.c](two_sum.c)
- **Python Code**: [two_sum.py](two_sum.py)

If you have any suggestions or improvements, feel free to open an issue or a pull request. Happy coding!
