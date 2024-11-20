class Solution:
    def triangleType(self, nums: List[int]) -> str:
        a, b, c = nums
        
        if a + b <= c or a + c <= b or b + c <= a:
            return "none"

        if a == b == c:
            return "equilateral"
        
        if a == b or a == c or b == c:
            return "isosceles"
        
        return "scalene"