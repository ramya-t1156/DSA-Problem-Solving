class Solution:
    def toLowerCase(self, s: str) -> str:
        result = ""
        for i in s:
            if i.isupper():
                result+=i.lower()
            else:
                result+=i
        return result
        
