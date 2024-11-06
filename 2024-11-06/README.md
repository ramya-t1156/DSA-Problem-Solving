# LeetCode Problem 2 - Add Two Numbers

## Problem Description
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each node contains a single digit. Add the two numbers and return the sum as a linked list.

- Each input list represents a number without leading zeros, except the number 0 itself.
- Each node in the linked lists holds a single digit.

### Examples
Example 1:
```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
```

Example 2:
```
Input: l1 = [0], l2 = [0]
Output: [0]
```

Example 3:
```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
```

### Constraints
- The number of nodes in each linked list is in the range `[1, 100]`.
- `0 <= Node.val <= 9`
- It is guaranteed that the lists represent non-negative integers without leading zeros.

## Solution Explanation
The C solution uses a pointer-based approach to efficiently traverse both linked lists and calculate the sum:

1. **Iterate Through Each List**: We traverse both linked lists (`l1` and `l2`) using two pointers.
2. **Add Digits and Handle Carry**: For each node, we add the values of the nodes from both lists along with any carry from the previous step. This sum is split into a new digit for the current position and a carry for the next addition.
3. **Create New Nodes**: For each sum result, we create a new node to store the value and link it to the result list.
4. **Handle Remaining Carry**: After the loop, if there's a remaining carry, we create a final node to hold this value.

This approach has a time complexity of O(n), where n is the length of the longer linked list.

## Key Takeaways
- **Memory Management**: Manual memory allocation for each node reinforces C's lower-level handling of data structures.
- **Carry Mechanism**: Similar to basic addition, the carry management between nodes is essential for accuracy.
- **Efficiency**: The single-pass approach (O(n) complexity) ensures the solution is efficient for the input constraints.

Feel free to check out the code files for each solution:

- **C Code**: [add_two_numbers.c](add_two_numbers.c)

If you have any suggestions or improvements, feel free to open an issue or a pull request. Happy coding!
