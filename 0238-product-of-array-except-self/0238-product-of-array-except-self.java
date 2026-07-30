class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length ;
        int[] prefix = new int[n] , sufix = new int[n] ;
        Arrays.fill(prefix,1);
        Arrays.fill(sufix,1);
        int z = 0 ;
        for(int i = 1 ; i<n ; i++){
            if(nums[i-1]==0) {
                z++ ;
            }
            prefix[i] = prefix[i-1]*nums[i-1] ;
            sufix[i] = sufix[i-1]*nums[n-i] ;
            
        }
        int[] ans = new int[n] ;
        if(z >=2){
            Arrays.fill(ans,0);
            return ans ;
        }
        for(int i = 0 ; i<n ; i++){
            int multi = prefix[i]*sufix[n-1-i];
            ans[i] = multi ;
        }
        return ans ;
    }
}