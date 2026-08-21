class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        z,o,t = 0 ,0 ,0
        n = len(nums)
        for i in range(0,n) :
            if nums[i] == 0 :
                nums[z],nums[i] = nums[i],nums[z]
                z+=1
        o = z
        for i in range (z,n):
            if nums[i] == 1 :
                nums[z],nums[i]=nums[i],nums[z]
                z+=1
        


