class Solution {
    public void sortColors(int[] nums) {
        int i = 0 , j = nums.length-1 ;
        while(i<j){
            if(nums[j]==2) {
                j--;
                continue ;
            }
            if(nums[i]==2){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }else i++;
        }
        i = 0 ;
        while(i<=j){
            if(nums[i]==1){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j--;
            }else i++;
        }
    }
}