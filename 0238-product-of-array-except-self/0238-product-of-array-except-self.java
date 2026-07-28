class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;
        int multi = 1 ;
        int z = 0 ;
        for(int i = 0 ; i<n ; i++){
            if(nums[i]==0) {
                z++ ;
                continue;
            }
            multi *= nums[i] ;
        }
        int[] ans = new int[n] ;
        if(z >=2){
            Arrays.fill(ans,0);
            return ans ;
        }
        for(int i = 0 ; i<n ; i++){
            if(nums[i]==0) {
                Arrays.fill(ans,0) ;
                ans[i] = multi ;
                break ;
            }
            ans[i] = multi/nums[i] ;
        }
        return ans ;
    }
}