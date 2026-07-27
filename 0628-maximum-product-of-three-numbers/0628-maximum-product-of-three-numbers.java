class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length -1 ;
        if(nums[n]*nums[n-1]*nums[n-2] < nums[0]*nums[1]*nums[n]){
            return nums[0]*nums[1]*nums[n] ;
        }
        return nums[n]*nums[n-1]*nums[n-2] ;
    }
}