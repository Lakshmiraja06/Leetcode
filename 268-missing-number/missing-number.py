class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        total = n*(n+1)/2
        sum = 0
        for i in nums:
            sum += i
            
        k = total - sum
        return int(k)

            
        