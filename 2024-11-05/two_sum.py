class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # Create a dictionary to store the indices of numbers
        num_dict = {}
        
        # Iterate through the list of numbers
        for i, num in enumerate(nums):
            # Calculate the complement required to achieve the target
            complement = target - num
            
            # Check if the complement is already in the dictionary
            if complement in num_dict:
                # If found, return the indices of the current number and its complement
                return [num_dict[complement], i]
            
            # If not found, add the current number and its index to the dictionary
            num_dict[num] = i
        
        # If no solution is found, return an empty list
        return []
