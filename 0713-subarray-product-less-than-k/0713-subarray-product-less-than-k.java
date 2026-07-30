class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0 ;
        int n = nums.length ;
        int i = 0 , j = 0 , count = 0 ;
        long multi = 1 ;
        while(j<n){ 

            multi = multi*nums[j];

            while(multi>=k && i<=j) {
                multi /= nums[i];
                i++;
            }
            count += (j-i+1);
            j++;
        }
        return count ;
    }
}