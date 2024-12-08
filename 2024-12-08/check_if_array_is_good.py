class Solution:
    def isGood(self, nums: List[int]) -> bool:
        n=max(nums)

        if len(nums)!=n+1:
            return False

        ans = sorted(nums)
        for i in range(n-1):
            if ans[i]!=i+1:
                return False

        if ans[n-1]==n and ans[n]==n:
            return True

        return False
