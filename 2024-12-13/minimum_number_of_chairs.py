class Solution:
    def minimumChairs(self, s: str) -> int:
        current = 0
        max_chairs = 0

        for event in s:
            if event == 'E':
                current += 1
                if current > max_chairs:
                    max_chairs = current
            elif event == 'L':
                current -= 1

        return max_chairs
