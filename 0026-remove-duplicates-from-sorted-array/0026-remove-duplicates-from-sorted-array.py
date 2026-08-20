class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        for j in nums :
            if j == nums[i] :
                continue 
            else :
                nums[i+1] = j 
                i+=1
            
        return i+1
