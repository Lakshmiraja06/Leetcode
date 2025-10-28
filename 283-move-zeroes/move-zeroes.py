class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
    
        """
        prev = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[prev], nums[i] = nums[i], nums[prev]
                prev += 1
        return nums
            