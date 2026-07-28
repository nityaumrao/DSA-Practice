class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length ;
        long sum = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i<k ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            sum += nums[i];
        }
        long ans = 0 ;
        if(map.size()==k) ans = sum;

        int i = 0 , j = k ;

        while(i<j && j<n){
            map.put(nums[i] , map.getOrDefault(nums[i],0)-1);
            if(map.get(nums[i])==0) map.remove(nums[i]);
            map.put(nums[j] , map.getOrDefault(nums[j],0)+1);
            sum = sum - nums[i] + nums[j] ; 
            if(map.size()==k){
                ans = Math.max(sum,ans);
            }
            i++;
            j++;
        }
        return ans ;
    }
}