class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int product = nums[0] , result = 1 ;
        for(int i = 0 ; i<n ; i++){
            result = 1 ;
            for(int j = i ; j<n ;j++){
                result *= nums[j];
                product = Math.max(result,product);
            }
        }
        return product ;
    }
}