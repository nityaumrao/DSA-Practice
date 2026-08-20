class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l = []
        i,j = 0 , len(numbers)-1
        while(i<=j):
            if numbers[i]+numbers[j] > target :
                j-=1
            elif numbers[i]+numbers[j] < target :
                i+=1
            else :
                l.append(i+1)
                l.append(j+1)
                return l 

       



