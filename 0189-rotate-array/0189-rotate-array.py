class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        k = k % len(nums)
        numl = nums[:-k]
        numr = nums[-k:]

        numl = numl[::-1]
        numr = numr[::-1]
        nums[:] = numl+numr
        
        nums[:]=nums[::-1]
        
        