class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length ;
        HashMap <Integer,Integer> map = new HashMap<>();
        int min = 100 , max = 0;
        for(int i = 0 ; i<n ; i++){
            map.put(nums[i],1);
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);

        }
        List<Integer> list = new ArrayList<>();
        for(int i = min ; i<=max ; i++ ){
            if(map.getOrDefault(i,0)<1){
                list.add(i);
            }
        }
        return list ;
    }
}