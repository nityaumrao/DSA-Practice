class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length ;
        int maxi = 0  , maxi2 = 0 ;
        for(int num : nums ){
            if(maxi<num){
                maxi2=maxi;
                maxi = num;
            }else {
                maxi2 = Math.max(num, maxi2);
            }
            
        }
        
        return (maxi-1)*(maxi2-1);
    }
}