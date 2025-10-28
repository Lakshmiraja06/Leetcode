class Solution:
    def removeZeros(self, n: int) -> int:
        nums = str(n)
        s1 = ""
        for i in range(len(nums)):
            if nums[i] != "0":
                s1 += nums[i]
        return int(s1)           