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

For this problem, I approached it using two different methods:

1. **Brute Force in C**: I used a nested loop to check each possible pair of numbers to find a match. This approach has a time complexity of `O(n^2)` due to the two loops.

2. **Optimized Dictionary Approach in Python**: I used a dictionary (hash map) to store the indices of numbers as I iterate through the list. This allows finding a solution in a single pass with a time complexity of `O(n)` by reducing the need for nested loops.

### Solution Code

- **C Solution**: See `two_sum.c`
- **Python Solution**: See `two_sum.py`

### Key Takeaways
- Hash maps (dictionaries) are highly efficient for look-up problems in Python.
- Practicing both C and Python helps build a strong foundation, as C reinforces memory management while Python provides fast, high-level operations.
