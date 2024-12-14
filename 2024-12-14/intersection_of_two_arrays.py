class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        arr=[]
        nums1=set(nums1)
        for num in nums2:
            if num in nums1:
                arr.append(num)
                nums1.remove(num)
        return arr
        
