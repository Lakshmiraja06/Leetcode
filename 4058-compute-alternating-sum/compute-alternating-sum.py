class Solution:
    def alternatingSum(self, nums: List[int]) -> int:
        total_sum =0
        for i in range(len(nums)):
            if(i%2 == 0):
                total_sum += nums[i]
            else:
                total_sum -= nums[i]
        return total_sum
        