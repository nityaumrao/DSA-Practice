class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length ;
        int maxi = 0  , maxi2 = 0 ;
        for(int i = 0 ; i<n ; i++){
            
            if(maxi<nums[i]){
                maxi2=maxi;
                maxi = nums[i];
            }else {
                maxi2 = Math.max(nums[i] , maxi2);
            }
            
        }
        return (maxi-1)*(maxi2-1);
    }
}